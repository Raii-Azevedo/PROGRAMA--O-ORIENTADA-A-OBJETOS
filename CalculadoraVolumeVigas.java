/*Trabalhar com encapsulamento em orientação a objetos pode nos trazer muitas vantagens, como diminuir a complexidade no desenvolvimento da aplicação. Entretanto, é importante termos um bom conhecimento sobre o assunto para aplicarmos da melhor forma em nossos projetos.

Você trabalha como analista/programador em uma fábrica de software e foi encarregado de criar uma aplicação que calcule o volume de concreto para o trabalho com vigas em construção civil. Sabe-se que a fórmula para o cálculo desse volume é (base x altura x comprimento).

O cliente necessita de uma aplicação que solicite, via caixa de diálogo, os dados referentes à base, à altura e ao comprimento das vigas a serem trabalhadas e deve ser informado o resultado por meio de uma caixa de mensagem.

Sua tarefa é implementar essa aplicação em uma linguagem de programação orientada a objetos (POO) e fazer uso das técnicas de encapsulamento.*/

import javax.swing.JOptionPane;

public class CalculadoraVolumeVigas {

    private double base;
    private double altura;
    private double comprimento;

    // Método para definir a base da viga
    public void setBase(double base) {
        this.base = base;
    }

    // Método para definir a altura da viga
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para definir o comprimento da viga
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    // Método para calcular o volume da viga
    public double calcularVolume() {
        return base * altura * comprimento;
    }

    public static void main(String[] args) {
        CalculadoraVolumeVigas calculadora = new CalculadoraVolumeVigas();

        // Solicitar os dados via caixa de diálogo
        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base da viga:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da viga:"));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento da viga:"));

        // Definir os valores na calculadora
        calculadora.setBase(base);
        calculadora.setAltura(altura);
        calculadora.setComprimento(comprimento);

        // Calcular o volume da viga
        double volume = calculadora.calcularVolume();

        // Exibir o resultado em uma caixa de mensagem
        JOptionPane.showMessageDialog(null, "O volume da viga é: " + volume + " metros cúbicos");
    }
}

