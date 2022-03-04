import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class desafio1{
    public static void main(String[] args) {
        int i, n;
        String sc;

        JTextArea texto = new JTextArea(30,30);
        sc ="Escadaria";
        n = 6;

        for(i=0;i<n;i++){
            sc = ("" +  (n - 1) + "*" + i);
            System.out.println(sc);   
        }
        texto.setText(sc);
        JOptionPane.showMessageDialog(null,texto);     
    }
}
