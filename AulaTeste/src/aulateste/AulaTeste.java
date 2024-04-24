package aulateste;

import java.util.Scanner;


public class AulaTeste {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        Produto produto = new Produto();
        
        
        System.out.print("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();
        produto.setNome(nomeProduto);
        
        System.out.print("Digite o valor do produto:");
        double valorProduto = scanner.nextDouble();
        produto.setValor(valorProduto);
        
        System.out.print("Digite a quantidade em estoque do produto:");
        int quantidadeEmEstoque = scanner.nextInt();
        produto.setQuantidadeEstoque(quantidadeEmEstoque);
        
        System.out.print("Digite a quantidade a ser vendida:");
        int quantidadeVendida = scanner.nextInt();
        
        Vendas.vender(produto, quantidadeVendida);

               
       
    }
    
}
