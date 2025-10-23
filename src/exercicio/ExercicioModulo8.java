package exercicio;

import java.util.Scanner;

public class ExercicioModulo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.print("Digite um número positivo: ");
        int n = scanner.nextInt();

        System.out.println("\nNúmeros de 0 até " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nNúmeros de " + n + " até 0:");
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nExibição do nome:");
        if (nome.length() > 6) {
            for (int i = 0; i < n; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println(nome);
        }

        scanner.close();

    }
}
