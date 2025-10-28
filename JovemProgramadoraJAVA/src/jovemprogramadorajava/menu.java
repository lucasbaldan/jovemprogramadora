package jovemprogramadorajava;

import java.time.LocalDate;
import java.util.Scanner;


public class menu {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        
        while(opcao != 3){
            System.out.println("DIGITE A OPCAO DESEJADA: ");
            System.out.println("1 - MOSTRAR MENSAGEM \n2 - MOSTRAR DATA DE HOJE\n3 - Sair");
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("CURSO JOVEM PROGRAMADORA");
                    break;
                case 2:
                    LocalDate hoje = LocalDate.now();
                    System.out.println("data de hoje: " + hoje);
                    break;
                case 3:
                    System.out.println("SEU PROGRAMA SERA ENCERRADO");
                    break;
                default:
                    System.err.println("OPCAO INVALIDA");
                    break;
            }
        }
        
    }
    
}
