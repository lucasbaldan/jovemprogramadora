package jovemprogramadorajava;

import java.util.Scanner;

public class NumeroMaior {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o primeiro numero");
        numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero");
        numero2 = scan.nextInt();

        if(numero1 == numero2) {
            System.out.println("Os números sao iguais");
        } else if (numero1 > numero2) {
            System.out.println("O numero " + numero1 + " eh maior do que  o numero " + numero2);
        } else {
            System.out.println("O numero " + numero2 + " eh maior do que  o numero " + numero1);
        }
    }

}
