package aluno;

import javax.swing.JOptionPane;

public class Aluno {

    public static void main(String[] args) {
        
        int i=1;
        String todos = " ";
        
        notasAlunos n = new notasAlunos();
        faltasAlunos f = new faltasAlunos();
        
        n.setQuantAlunos((Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "))));
        
        do{
            n.exibirAluno();
            n.calculaMedia();
            n.situacaoAluno();
            f.exibirFaltas();
            f.situacaoFaltas();
        
            if((n.getMedia()>=18)&&(f.getQuantFaltas()<5)){
                todos = todos + (n.getNome() + " - Aprovado!\n");
            }else{
                todos = todos + (n.getNome() + "- Reprovado!\n");
            }
            i++;
        }while (i<=n.getQuantAlunos());
      
        JOptionPane.showMessageDialog(null, todos);
        
      
        
        
    }
    
}
