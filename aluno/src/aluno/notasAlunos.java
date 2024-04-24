package aluno;

import javax.swing.JOptionPane;

public class notasAlunos {
    
    private String nome;
    private double prova1;
    private double prova2;
    private double trabalho;
    private double media;
    private String situacao;
    private int quantAlunos;

    public String getNome() {
        return nome;
    }

    public double getProva1() {
        return prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }
    
    
    public void exibirAluno(){
        setNome((JOptionPane.showInputDialog("Digite o nome do aluno: ")));
        setProva1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 1: ")));
        setProva2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 2: ")));
        setTrabalho(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho: ")));

    }
    
    public void calculaMedia(){
        setMedia(getProva1() + getProva2() + getTrabalho());
    }
    
    public void situacaoAluno(){
        if(media>=18){
            setSituacao("Aprovado");
            JOptionPane.showMessageDialog(null, "A nota de " + getNome() + " é: " +getMedia());
            JOptionPane.showMessageDialog(null, "O aluno está "+ getSituacao() + " por nota.");
        }else{
            setSituacao("Reprovado");
            JOptionPane.showMessageDialog(null, "A nota de " + getNome() + " é : " +getMedia());
            JOptionPane.showMessageDialog(null, "O aluno está "+ getSituacao() + " por nota.");
        }
    }

    
}
