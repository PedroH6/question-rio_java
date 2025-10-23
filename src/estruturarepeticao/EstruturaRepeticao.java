package estruturarepeticao;

import java.util.Scanner;

public class EstruturaRepeticao {
    public  static void main(String[] args) {





    }

    public static void forCrencente(){
        System.out.println("Se você deseja ver o for crescente, digite 1:");
        Scanner sc = new Scanner(System.in);
        int decisao = sc.nextInt();

        if (decisao == 1) {
            for (int n1 = 0; n1 < 101; n1++) {
                System.out.println("O contador está em:" + n1);
            }
        }
        System.out.println();
    }
    public static void forDescrencente(){
        System.out.println("Se deseja ver o for decrencente, digite 2:");
        Scanner sc = new Scanner(System.in);
        int decisao = sc.nextInt();

        if (decisao == 2){
        for (int n1 = 100; n1 >= 0; n1--){
           System.out.println("O contador está em: " + n1);
        }
        }
        System.out.println();
    }

    public static void whileNumeroDoUsuario() {
        System.out.println("Digite um número maior que 30 para ser exibido. Digite 30 ou um numero menor que 30 para sair:");
        Scanner sc = new Scanner(System.in);
        int numeroDoUsuario = sc.nextInt();

        while (numeroDoUsuario > 30) {
            System.out.println("O número que você digitou é: " + numeroDoUsuario);

            System.out.println("Digite um número maior que 30 para ser exibido. Digite 30 ou um numero menor que 30 para sair:");

            numeroDoUsuario = sc.nextInt();

        }
        sc.close();
        System.out.println("Você saiu!");

    }
}
