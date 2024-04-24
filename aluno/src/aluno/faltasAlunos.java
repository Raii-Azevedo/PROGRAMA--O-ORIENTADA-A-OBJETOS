
package aluno;

import javax.swing.JOptionPane;

public class faltasAlunos {
    
    private int quantFaltas;
    private String situacaoFalta;

    public int getQuantFaltas() {
        return quantFaltas;
    }

    public String getSituacaoFalta() {
        return situacaoFalta;
    }

    public void setQuantFaltas(int quantFaltas) {
        this.quantFaltas = quantFaltas;
    }

    public void setSituacaoFalta(String situacaoFalta) {
        this.situacaoFalta = situacaoFalta;
    }
    
    public void exibirFaltas(){
        setQuantFaltas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas do aluno: ")));
    }
    
    public void situacaoFaltas(){
        if(getQuantFaltas()>5){
            setSituacaoFalta("Reprovado por falta!");
            JOptionPane.showMessageDialog(null, "O aluno está "+ getSituacaoFalta());
        }else{
            setSituacaoFalta("Aprovado por falta!");
            JOptionPane.showMessageDialog(null, "O aluno está "+ getSituacaoFalta());
        }
    }
          
    
    
}
