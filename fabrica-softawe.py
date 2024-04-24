def dados():
    clientes_veiculos = {
    1: (Cliente("123.456.789-00", "Fulano", "Rua A, 123", "1234-5678", "fulano@example.com"),
        Veiculo("ABC1234", "Modelo1", 2022, "Fabricante1", "Cor1")),
    2: (Cliente("123.456.789-00", "Ciclano", "Rua B, 123", "1234-5678", "ciclano@example.com"),
        Veiculo("ABC128645", "Modelo2", 2023, "Fabricante2", "Cor2")),
    3: (Cliente("123.456.789-00", "Beltrano", "Rua C, 123", "1234-5678", "beltrano@example.com"),
        Veiculo("ABC1234", "Modelo3", 2024, "Fabricante3", "Cor3")),
    4: (Cliente("123.456.789-00", "Fulaninho", "Rua D, 123", "1234-5678", "fulaninho@example.com"),
        Veiculo("ABC1234", "Modelo4", 2025, "Fabricante4", "Cor4")),
    5: (Cliente("123.456.789-00", "Fulanão", "Rua E, 123", "1234-5678", "fulanão@example.com"),
        Veiculo("ABC1234", "Modelo5", 2021, "Fabricante5", "Cor5"))
        }
    
    return clientes_veiculos

if __name__ == "__main__":
    # Instanciando objetos Cliente e Veiculo
    class Cliente:
        def __init__(self, cpf, nome, endereco, telefone, email):
            self.cpf = cpf
            self.nome = nome
            self.endereco = endereco
            self.telefone = telefone
            self.email = email

class Veiculo:
    def __init__(self, placa, modelo, ano, fabricante, cor):
        self.placa = placa
        self.modelo = modelo
        self.ano = ano
        self.fabricante = fabricante
        self.cor = cor

if __name__ == "__main__":
    # Instanciando objetos Cliente e Veiculo
    clientes_veiculos = dados()

    for i in range (1,6):
        # Utilização
        cliente, veiculo = clientes_veiculos[i]
        print("Cliente:", cliente.nome)
        print("Veículo:", veiculo.modelo)
        print()