// FiguraGeometrica.java
public class FiguraGeometrica {
    public double calcularArea() {
        return 0; // Este método será sobrescrito nas subclasses
    }
}

// Retangulo.java
public class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// TrianguloRetangulo.java
public class TrianguloRetangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public TrianguloRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Passos para a construção do programa:");
        System.out.println("1. Criar uma estrutura de herança com a classe FiguraGeometrica como superclasse e as subclasses Retangulo e TrianguloRetangulo.");
        System.out.println("2. Implementar o método calcularArea() na superclasse e sobrescrevê-lo nas subclasses para calcular a área específica de cada figura geométrica.");
        System.out.println("3. Na classe Main, criar objetos das subclasses e chamar o método calcularArea() para obter as áreas calculadas e imprimir os resultados.");

        Retangulo retangulo = new Retangulo(5, 10);
        TrianguloRetangulo triangulo = new TrianguloRetangulo(3, 4);

        double areaRetangulo = retangulo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();

        System.out.println("\nÁrea do retângulo: " + areaRetangulo);
        System.out.println("Área do triângulo retângulo: " + areaTriangulo);
    }
}
