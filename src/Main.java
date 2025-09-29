import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha restante

        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite seu peso: ");
        float peso = scanner.nextFloat();

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();
        scanner.nextLine(); // Consome a quebra de linha restante

        System.out.print("Digite seu estado civil: ");
        String civil = scanner.nextLine();


        System.out.println("\n--- INFORMAÇÕES ---");
        System.out.println("Olá, " + nome + "!");
        System.out.println("Você tem " + idade + " anos.");
        System.out.println("Seu CPF é: " + cpf);
        System.out.println("Seu peso é: " + peso + " kg");
        System.out.println("Sua altura é: " + altura + " m");
        System.out.println("Estado civil: " + civil);

        scanner.close();

    }
}