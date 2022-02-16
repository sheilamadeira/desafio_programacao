
import java.util.Scanner;

public class desafio_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String validador;
        int resultado;
        String criterios = "([0-9][a-z])";
         System.out.println("Informe a senha: ");
        validador = sc.nextLine();
                    
        if(validador.length() >=6 && validador.matches(criterios)){
        System.out.println("Senha válida!");
         }else {
        if(validador.length() <6){
        System.out.println("Senha inválida!");
        resultado = (6 - validador.length());
        System.out.println("Senha inválida!"+resultado);
         }
        }        
        sc.close();
    }
}

    

