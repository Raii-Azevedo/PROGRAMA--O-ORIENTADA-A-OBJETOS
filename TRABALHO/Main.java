import javax.swing.JOptionPane; 
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}

public class Main {
    private static final String ARQUIVO_ALUNOS = "alunos.txt";
    private static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        showMenu(); // Exibe a mensagem do sistema 
        carregarAlunosDoArquivo(); // Carrega os alunos 
        while (true) {
            int opcao = getMenuOption();
            processOption(opcao);
        }
    }

    private static void showMenu() {
        showMessage("\nSISTEMA DE GERENCIAMENTO DE ALUNOS\n");
    }

    private static int getMenuOption() {
        String[] options = { "Cadastrar Alunos", "Exibir lista de alunos", "Sair" };
        return JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    }

    private static void processOption(int opcao) {
        switch (opcao) {
            case 0:
                cadastrarAluno();
                break;
            case 1:
                exibirListaAlunos();
                break;
            case 2:
                showMessage("Volte Sempre!");
                System.exit(0);
            default:
                showMessage("Opção inválida. Tente novamente.");
        }
    }

    private static void cadastrarAluno() {
        String nome = showInputMessage("Digite o nome do aluno:");
        int idade = Integer.parseInt(showInputMessage("Digite a idade do aluno:"));
        String matricula = showInputMessage("Digite a matrícula do aluno:");
        String curso = showInputMessage("Digite o curso do aluno:");
        alunos.add(new Aluno(nome, idade, matricula, curso));
        salvarAlunosEmArquivo(); // Salva os alunos no arquivo
        showMessage("Aluno cadastrado com sucesso!");
    }

    private static void salvarAlunosEmArquivo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO_ALUNOS))) {
            for (Aluno aluno : alunos) {
                writer.println(aluno.getNome() + ", " + aluno.getIdade() + ", " + aluno.getMatricula() + ", "
                        + aluno.getCurso());
            }
        } catch (IOException e) {
            showError("Erro ao salvar alunos: " + e.getMessage());
        }
    }

    private static void carregarAlunosDoArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_ALUNOS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 4) {
                    String nome = parts[0];
                    int idade = Integer.parseInt(parts[1]);
                    String matricula = parts[2];
                    String curso = parts[3];
                    alunos.add(new Aluno(nome, idade, matricula, curso));
                } else {
                    showError("Formato inválido de linha no arquivo: " + line);
                }
            }
        } catch (IOException e) {
            showError("Erro ao carregar alunos: " + e.getMessage());
        } catch (NumberFormatException e) {
            showError("Erro ao converter idade para inteiro: " + e.getMessage());
        }
    }

    private static void exibirListaAlunos() {
        if (alunos.isEmpty()) {
            showMessage("Nenhum aluno cadastrado.");
        } else {
            JTextArea textArea = new JTextArea(20, 50); // 20 linhas e 50 colunas
            textArea.setEditable(false);
            StringBuilder alunosStr = new StringBuilder("Lista de Alunos:\n\n");
            for (Aluno aluno : alunos) {
                alunosStr.append("Nome: ").append(aluno.getNome()).append("\n");
                alunosStr.append("Idade: ").append(aluno.getIdade()).append("\n");
                alunosStr.append("Matrícula: ").append(aluno.getMatricula()).append("\n");
                alunosStr.append("Curso: ").append(aluno.getCurso()).append("\n\n");
            }
            textArea.setText(alunosStr.toString());
            JOptionPane.showMessageDialog(null, new JScrollPane(textArea));
        }
    }

    private static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static void showError(String message) {
        showMessage("Erro: " + message);
    }

    private static String showInputMessage(String message) {
        return JOptionPane.showInputDialog(null, message);
    }
}
