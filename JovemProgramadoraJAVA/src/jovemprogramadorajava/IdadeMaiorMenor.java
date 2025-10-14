
package jovemprogramadorajava;

import java.util.Scanner;

public class IdadeMaiorMenor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        
        System.out.println("Qual eh a sua idade");
        idade = scan.nextInt();
        
        if(idade >= 18){
            System.out.println("VC EH MAIOR DE IDADE");
        }
        else {
            System.out.println("VC EH MENOR DE IDADE");
        }

    }
    
}
