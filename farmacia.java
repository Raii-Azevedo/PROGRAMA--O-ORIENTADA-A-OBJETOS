// Pessoa.java
public class Pessoa {
    private int id;
    private String nome;
    private String logradouro;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private String telefone;
    private String cpfCnpj;

    public Pessoa(int id, String nome, String logradouro, String numero, String cep, String bairro,
                  String cidade, String uf, String telefone, String cpfCnpj) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
        this.cpfCnpj = cpfCnpj;
    }

    // Getters e Setters
}

// Associado.java
public class Associado extends Pessoa {
    private String situacao;
    private int numeroAssociado;

    public Associado(int id, String nome, String logradouro, String numero, String cep, String bairro,
                     String cidade, String uf, String telefone, String cpfCnpj, String situacao,
                     int numeroAssociado) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.situacao = situacao;
        this.numeroAssociado = numeroAssociado;
    }

    // Getters e Setters
}

// Colaborador.java
public class Colaborador extends Pessoa {
    private String cargo;

    public Colaborador(int id, String nome, String logradouro, String numero, String cep, String bairro,
                       String cidade, String uf, String telefone, String cpfCnpj, String cargo) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.cargo = cargo;
    }

    // Getters e Setters
}

// Fornecedor.java
public class Fornecedor extends Pessoa {
    private String nomeFantasia;
    private String website;

    public Fornecedor(int id, String nome, String logradouro, String numero, String cep, String bairro,
                      String cidade, String uf, String telefone, String cpfCnpj, String nomeFantasia,
                      String website) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.nomeFantasia = nomeFantasia;
        this.website = website;
    }

    // Getters e Setters
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Associado associado = new Associado(1, "João", "Rua A", "123", "12345-678", "Centro", "Cidade", "SP",
                "(11) 1234-5678", "123.456.789-00", "Ativo", 1001);

        Colaborador colaborador = new Colaborador(2, "Maria", "Rua B", "456", "54321-876", "Bairro", "Cidade", "SP",
                "(11) 9876-5432", "987.654.321-00", "Farmacêutico");

        Fornecedor fornecedor = new Fornecedor(3, "FarmaCompany", "Av. C", "789", "98765-432", "Centro", "OutraCidade",
                "RJ", "(21) 3333-4444", "123.123.123/0001-99", "FarmaFantasy", "www.farmacompany.com");

        // Uso dos objetos criados...
    }
}
