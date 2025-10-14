package jovemprogramadorajava;

import java.util.Scanner;

public class verificarVotacao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        char brasileiro;

        System.out.println("OLA, VAMOS VER SE VC PODE VOTAR");
        System.out.println("DIGITE PRIMEIRO A SUA IDADE!");
        idade = scan.nextInt();

        System.out.println("AGORA INOFRME SE VC EH BRASILEIRO");
        System.out.println("APERTE S PARA SIM E N PARA NAO");
        brasileiro = scan.next().charAt(0);

        if (idade >= 16 && (brasileiro == 's' || brasileiro == 'S')) {
            System.out.println("VC PODE VOTAR");
        }
                System.out.println("VC NAO PODE VOTAR!");
        }

    }
}
