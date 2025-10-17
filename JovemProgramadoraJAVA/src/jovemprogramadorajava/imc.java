package jovemprogramadorajava;

import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso, altura, imc;
        char sexo;

        System.out.println("DIGITE O SEU GENERO - H PARA HOMEM E M PARA MULHER");
        sexo = scan.next().charAt(0);

        if (sexo != 'h' && sexo != 'H' && sexo != 'M' && sexo != 'm') {
            System.err.println("VOCE DIGITOU UM SEXO INVALIDO");
            System.exit(0);
        }
        
        System.out.println("DIGITE SEU PESO");
        peso = scan.nextDouble();

        System.out.println("DIGITE SUA ALTURA");
        altura = scan.nextDouble();

        imc = peso / (altura * altura); 
         
        System.out.println("Seu imc calculado eh: " + imc);
        if (sexo == 'H' || sexo == 'h') {
            
            if(imc > 39.0){
                System.out.println("SEU INDICE EH OBESIDADE MORBIDA");
            } else if(imc >= 30 && imc <= 39) {
                System.out.println("SEU INDICE EH OBESIDADE MODERADA");
            } else if(imc >= 25 && imc <= 29.9) {
                System.out.println("SEU INDICE EH OBESIDADE LEVE");
            } else if(imc >= 20 && imc <= 24.9) {
                System.out.println("SEU INDICE EH NORMAL");
            } else {
                System.out.println("SEU INDICE EH ABAIXO DO NORMAL");
            }
        } else {
            if(imc > 38.9){
                System.out.println("SEU INDICE EH OBESIDADE MORBIDA");
            } else if(imc >= 29 && imc <= 38.9) {
                System.out.println("SEU INDICE EH OBESIDADE MODERADA");
            } else if(imc >= 24 && imc <= 28.9) {
                System.out.println("SEU INDICE EH OBESIDADE LEVE");
            } else if(imc >= 19 && imc <= 23.9) {
                System.out.println("SEU INDICE EH NORMAL");
            } else {
                System.out.println("SEU INDICE EH ABAIXO DO NORMAL");
            }
        }

    }

}
