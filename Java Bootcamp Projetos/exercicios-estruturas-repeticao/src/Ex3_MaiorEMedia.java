import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a media desses números
 */

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            if (numero > maior) maior = numero;

            count = count + 1;
        }while (count <5);

        System.out.println("Maior número: " + maior);
        System.out.println("A média dos números: " + (soma / 5));

    }
}
