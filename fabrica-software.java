import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        // Obtendo os dados dos clientes e veículos
        Map<Integer, Object[]> clientesVeiculos = Dados.dados();
        
        // Utilizando os dados
        for (int i = 1; i <= 5; i++) {
            Object[] clienteVeiculo = clientesVeiculos.get(i);
            Cliente cliente = (Cliente) clienteVeiculo[0];
            Veiculo veiculo = (Veiculo) clienteVeiculo[1];
            
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Veículo: " + veiculo.getModelo());
            System.out.println();
        }
    }
}

class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente(String cpf, String nome, String endereco, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private String fabricante;
    private String cor;

    public Veiculo(String placa, String modelo, int ano, String fabricante, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

class Dados {
    public static Map<Integer, Object[]> dados() {
        Map<Integer, Object[]> clientesVeiculos = new HashMap<>();
        
        // Adicionando clientes e veículos ao mapa
        clientesVeiculos.put(1, new Object[] {
            new Cliente("123.456.789-00", "Fulano", "Rua A, 123", "1234-5678", "fulano@example.com"),
            new Veiculo("ABC1234", "Modelo1", 2022, "Fabricante1", "Cor1")
        });
        clientesVeiculos.put(2, new Object[] {
            new Cliente("123.456.789-00", "Ciclano", "Rua B, 123", "1234-5678", "ciclano@example.com"),
            new Veiculo("ABC128645", "Modelo2", 2023, "Fabricante2", "Cor2")
        });
        clientesVeiculos.put(3, new Object[] {
            new Cliente("123.456.789-00", "Beltrano", "Rua C, 123", "1234-5678", "beltrano@example.com"),
            new Veiculo("ABC1234", "Modelo3", 2024, "Fabricante3", "Cor3")
        });
        clientesVeiculos.put(4, new Object[] {
            new Cliente("123.456.789-00", "Fulaninho", "Rua D, 123", "1234-5678", "fulaninho@example.com"),
            new Veiculo("ABC1234", "Modelo4", 2025, "Fabricante4", "Cor4")
        });
        clientesVeiculos.put(5, new Object[] {
            new Cliente("123.456.789-00", "Fulanão", "Rua E, 123", "1234-5678", "fulanão@example.com"),
            new Veiculo("ABC1234", "Modelo5", 2021, "Fabricante5", "Cor5")
        });
        
        return clientesVeiculos;
    }
}
