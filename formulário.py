def files():
    with open('cadastro-alunos.txt', 'r') as file:
        for line in file:
            print(line.strip())  
    file.close()


def aluno():
    aluno = []
    nome = input('Digite seu nome: ')
    end = input('Digite seu endereço: ')
    tel = input('Digite seu telefone: ')
    email = input('Digite seu e-mail: ')
    matricula = input('Digite sua matricula: ')

    aluno.append(nome)
    aluno.append(end)
    aluno.append(tel)
    aluno.append(email)
    aluno.append(matricula)

    with open('cadastro-alunos.txt', 'a') as file:
        file.write(','.join(aluno))
        file.write('\n')


def main():
    print('---- FORMULÁRIO DE CADASTRO -----')
    menu = int(input('''\n[1] Cadastrar
[2] Exibir Alunos
[3] Sair

Digite o nº: '''))

    while menu != 3:
        if menu == 1:
            aluno()
        elif menu == 2:
            files()
        else:
            print('Opção inválida')

        menu = int(input('''\n[1] Cadastrar
[2] Exibir Alunos
[3] Sair

Digite o nº: '''))

    print('Volte sempre')


if __name__ == '__main__':
    main()
