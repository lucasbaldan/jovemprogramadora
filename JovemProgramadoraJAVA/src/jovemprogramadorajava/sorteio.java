package jovemprogramadorajava;

import java.util.Random;

public class sorteio {
    public static void main(String[] args) {
        Random gerador = new Random();
        String[] alunas = new String[9];
        int numeroAleatorio;
        
        alunas[0] = "Laura";
        alunas[1] = "Millena";
        alunas[2] = "Monique";
        alunas[3] = "Sara";
        alunas[4] = "Layssa";
        alunas[5] = "Layara";
        alunas[6] = "Gabrielle";
        alunas[7] = "Kerrolyn";
        alunas[8] = "Juliana";
        
        numeroAleatorio = gerador.nextInt(8);
        
        System.out.println("A SORTEADA FOI: " + alunas[numeroAleatorio]);
        
        
        
        
        

    }



}
