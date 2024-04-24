
package aulateste;


public class Vendas extends Produto {
    
    public static double vender(Produto produto, int quantidade){
        double valorTotal = 0;
        if (quantidade <= produto.getQuantidadeEstoque()){
            double valorComAcrescimo = produto.getValor() * 1.25;
            valorTotal = quantidade * valorComAcrescimo;
            System.out.println("Produto vendido: " + produto.getNome());
            System.out.println("Valor total da compra: " + valorTotal);
        }else{
            System.out.println("Quantidade insuficiente em estoque!");
        }
        
        return valorTotal;
    }
     

        
    }
    

