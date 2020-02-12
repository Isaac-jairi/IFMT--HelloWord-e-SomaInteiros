package somainteiros;
import javax.swing.JOptionPane;
public class SomaInteiros {
    public static void main(String[] args) {
        
        String primeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro Numero Inteiro");
        String segundoNumero = JOptionPane.showInputDialog("Digite o Segundo Numero Inteiro");
        
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        
        int sum = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null,"A soma dos dois números inteiros é: " + sum);
    }
    
}
