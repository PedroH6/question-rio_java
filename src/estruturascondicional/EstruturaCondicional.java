package estruturascondicional;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior numero é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior numero é: " + numero2);
        } else {
            System.out.println("Os números são iguais!");
        }

        scanner.close();
    }
}
