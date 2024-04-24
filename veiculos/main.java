import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvarDadosTxt {
    public static void main(String[] args) {
        // Exemplo de veículo de passageiro
        VeiculoPassageiro carro = new VeiculoPassageiro("ABC1234", "Fiat", "Palio", 2022, 2021, "123456789",
                                                        "987654321", "Nacional", 500, 1.5, 1.7, 4.0,
                                                        "Branca", "Cinza", "Gasolina", "1.0 Flex", 5000,
                                                        10.5, 4, 5, new String[]{"Ar condicionado", "Direção hidráulica"});

        // Caminho do arquivo de texto
        String caminhoArquivo = "veiculos.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            // Escrever os dados do veículo no arquivo
            writer.write(carro.toString());
            System.out.println("Dados do veículo inseridos no arquivo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

// Classe Veiculo (superclasse)
class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private String procedencia;
    private double capacidadeCargaKg;
    private double altura;
    private double largura;
    private double profundidade;

    // Construtor
    public Veiculo(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi,
                   String renavam, String procedencia, double capacidadeCargaKg, double altura, double largura, double profundidade) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.procedencia = procedencia;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    // Getters e Setters (métodos para acessar e modificar os atributos)

    @Override
    public String toString() {
        return placa + ";" + marca + ";" + modelo + ";" +
               anoModelo + ";" + anoFabricacao + ";" + chassi + ";" +
               renavam + ";" + procedencia + ";" + capacidadeCargaKg + ";" +
               altura + ";" + largura + ";" + profundidade;
    }
}

// Classe VeiculoPassageiro (subclasse de Veiculo)
class VeiculoPassageiro extends Veiculo {
    private String corExterna;
    private String corInterna;
    private String tipoCombustivel;
    private String motor;
    private double quilometragem;
    private double consumoMedio;
    private int numeroPortas;
    private int numeroPassageiros;
    private String[] opcionais;

    // Construtor
    public VeiculoPassageiro(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi,
                             String renavam, String procedencia, double capacidadeCargaKg, double altura, double largura, double profundidade,
                             String corExterna, String corInterna, String tipoCombustivel, String motor, double quilometragem,
                             double consumoMedio, int numeroPortas, int numeroPassageiros, String[] opcionais) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeCargaKg, altura, largura, profundidade);
        this.corExterna = corExterna;
        this.corInterna = corInterna;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.quilometragem = quilometragem;
        this.consumoMedio = consumoMedio;
        this.numeroPortas = numeroPortas;
        this.numeroPassageiros = numeroPassageiros;
        this.opcionais = opcionais;
    }

    // Métodos getters específicos para VeiculoPassageiro
    public String getCorExterna() {
        return corExterna;
    }

    public String getCorInterna() {
        return corInterna;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public String getMotor() {
        return motor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public String[] getOpcionais() {
        return opcionais;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + corExterna + ";" + corInterna + ";" + tipoCombustivel + ";" +
                motor + ";" + quilometragem + ";" + consumoMedio + ";" + numeroPortas + ";" +
                numeroPassageiros + ";" + String.join(",", opcionais);
    }
}
