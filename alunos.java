import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class alunos {
    public static void main(String[] args) {
    System.out.println("---- FORMULÁRIO DE CADASTRO -----");
    Scanner scanner = new Scanner(System.in);
    int menu;
    
    do {
        System.out.println("\n[1] Cadastrar\n[2] Exibir Alunos\n[3] Sair\n");
        System.out.print("Digite o número da opção desejada: ");
        
        // Verificar se a entrada é um número inteiro
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite um número inteiro.");
            scanner.next(); // Limpar o buffer de entrada
        }
        
        menu = scanner.nextInt();
        
        switch (menu) {
            // ...
        }
    } while (menu != 3);
    
    scanner.close();
}

    public static void exibirAlunos() {
        try {
            File file = new File("cadastro-alunos.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cadastrar() {
        try {
            FileWriter fileWriter = new FileWriter("cadastro-alunos.txt", true);
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite seu endereço: ");
            String end = scanner.nextLine();
            System.out.print("Digite seu telefone: ");
            String tel = scanner.nextLine();
            System.out.print("Digite seu e-mail: ");
            String email = scanner.nextLine();
            System.out.print("Digite sua matrícula: ");
            String matricula = scanner.nextLine();

            String aluno = nome + "," + end + "," + tel + "," + email + "," + matricula;
            fileWriter.write(aluno + "\n");

            fileWriter.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

