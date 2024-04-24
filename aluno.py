from time import sleep

class Pessoa:
    def __init__(self, nome, idade):
        self._nome = nome
        self._idade = idade

    def get_nome(self):
        return self._nome

    def set_nome(self, nome):
        self._nome = nome

    def get_idade(self):
        return self._idade

    def set_idade(self, idade):
        self._idade = idade

    def __str__(self):
        return f"Nome: {self._nome}, Idade: {self._idade}"


class Aluno(Pessoa):
    def __init__(self, nome, idade, matricula, curso):
        super().__init__(nome, idade)
        self.__matricula = matricula
        self.__curso = curso

    def get_matricula(self):
        return self.__matricula

    def set_matricula(self, matricula):
        self.__matricula = matricula

    def get_curso(self):
        return self.__curso

    def set_curso(self, curso):
        self.__curso = curso

    def estudar(self, horas):
        print(f"{self._nome} está estudando {horas} horas.")

    def __str__(self):
        return f"{super().__str__()}, Matrícula: {self.__matricula}, Curso: {self.__curso}"


def salvar_alunos(alunos):
    with open("alunos.txt", "a") as file:
        for aluno in alunos:
            file.write(str(aluno) + "\n")


def carregar_alunos():
    alunos = []
    with open("alunos.txt", "r") as file:
        for line in file:
            data = line.strip().split(", ")
            nome = data[0].split(": ")[1]
            idade = int(data[1].split(": ")[1])
            matricula = data[2].split(": ")[1]
            curso = data[3].split(": ")[1]
            aluno = Aluno(nome, idade, matricula, curso)
            alunos.append(aluno)
    return alunos


def cadastrar_aluno():
    nome = input("\nDigite o nome do aluno: ")
    idade = int(input("\nDigite a idade do aluno: "))
    matricula = input("\nDigite a matrícula do aluno: ")
    curso = input("\nDigite o curso do aluno: ")
    aluno = Aluno(nome, idade, matricula, curso)
    return aluno


def main():
    while True:
        print('\n---- SISTEMA DE GERENCIAMENTO DE ALUNOS ----\n')
        sleep(1)
        print(' [1] Cadastrar Alunos \n [2] Exibir lista de alunos \n [3] Sair')
        opcao = int(input("Digite o Nº desejado: "))  # converter para inteiro

        controle = [1, 2, 3]
        
        if opcao not in controle:
            print("Opção inválida. Digite novamente.")
            continue

        elif opcao == 1:
            aluno = cadastrar_aluno()  # salvar aluno retornado
            salvar_alunos([aluno])  # Salvar lista atualizada
             
        elif opcao == 2:
            alunos = carregar_alunos()  # Atribuir a lista de alunos carregados à variável alunos
            print("Lista de Alunos:\n")
            for aluno in alunos:
                print(aluno)
    
        elif opcao == 3:
            print('Volte Sempre!')
            sleep(1)
            break  # Sair do loop

        
if __name__ == "__main__":
    main()
