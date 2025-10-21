
package jovemprogramadorajava;

import java.util.Scanner;


public class funcoesSistema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        
        System.out.println("DIGITE SEU NOME: ");
        nome = scan.nextLine();
        
        System.out.println("SEU NOME EM MAIUSCULO: " + nome.toUpperCase());
        System.out.println("SEU NOME EM MINUSCULO: " + nome.toLowerCase());
        System.out.println("TAMANHO DO SEU NOME: " + nome.length());
        
    }
}
