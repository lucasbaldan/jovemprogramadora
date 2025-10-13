
package jovemprogramadorajava;

import java.util.Scanner;


public class inputNome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("DIGITE PRIMEIRO SEU NOME E DEPOIS SUA IDADE");
        nome = scan.nextLine();
        idade = scan.nextInt();
        
        System.out.println("Seu nome eh " + nome.toUpperCase() + " e sua idade eh " + idade);
    
    
    }
}
