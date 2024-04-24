
package construtora;

import javax.swing.JOptionPane;

public class VolumeConcreto {
    private double altura;
    private double base;
    private double comprimento;
    
    public void calculaVolume(){
    
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da viga em metros: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base da viga em metros: "));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da viga em metros: "));
    
           this.altura = altura;
           this.base = base;
           this.comprimento = comprimento;
           
           double volume = (this.altura*this.base*this.comprimento);
           
           
          JOptionPane.showMessageDialog(null, "O volume de concreto necessário para a viga é : " + volume +" m3" );
    
    }
    
}
