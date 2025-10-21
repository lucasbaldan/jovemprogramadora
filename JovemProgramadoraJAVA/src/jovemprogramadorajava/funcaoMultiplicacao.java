package jovemprogramadorajava;

import java.util.Scanner;


public class funcaoMultiplicacao {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1;
        int numero2;
        int multiplicao;

        
        System.out.println("DIGITE O PRIMEIRO NUMERO A SER MULTIPLICADO");
        numero1 = scan.nextInt();
        
        System.out.println("DIGITE O SEGUNDO NUMERO A SER MULTIPLICADO");
        numero2 = scan.nextInt();
        
        multiplicao = multiplicaDoisNumeros(numero1, numero2);
        System.out.println("Resultado da multiplicacao: " + multiplicao);
    }
       

    public static int multiplicaDoisNumeros(int num1, int num2){
     
    return num1 * num2;
    }

}   
