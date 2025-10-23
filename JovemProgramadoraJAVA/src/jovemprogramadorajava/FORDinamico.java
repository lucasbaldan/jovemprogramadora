package jovemprogramadorajava;

import java.util.Scanner;

public class FORDinamico {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int inicio, termino;
        
        System.out.println("DIGITE O INICIO DA CONTAGEM");
        inicio = scan.nextInt();
        
        System.out.println("DIGITE O TERMINO DA CONTAGEM");
        termino = scan.nextInt();
        
        for(int i = inicio; i <= termino; i++){
            System.out.print(i + " - ");
        }
        
    }
    
}
