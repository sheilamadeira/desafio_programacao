import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class desafio_Q1{
    public static void main(String[] args) {
        int i;
        String sc;

        JTextArea texto = new JTextArea(30,30);
        sc ="Escadaria";

        for(i=0;i<6;i++){
            if(i==0)
            sc+="       *\n";
                 
            if(i==1)
            sc+="     **\n";
              
            if(i==2)
            sc+="    ***\n";
              
            if(i==3)
            sc+="  ****\n";
              
            if(i==4)
            sc+=" *****\n";
              
            if(i==5)
            sc+="******\n";
   
        }

        texto.setText(sc);
        JOptionPane.showMessageDialog(null,texto);
        

    }

}