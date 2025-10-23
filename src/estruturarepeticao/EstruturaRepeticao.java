package estruturarepeticao;

import java.util.Scanner;

public class EstruturaRepeticao {
    public  static void main(String[] args) {
        System.out.println("Se você deseja ver o for crescente, digite 1:\nSe deseja ver o for decrencente, digite 2: ");

        Scanner sc = new Scanner(System.in);
        int decisao = sc.nextInt();

        if (decisao == 1){
            forCrencente();
        } else if (decisao == 2) {
            forDescrencente();
        } else {
            System.out.println("Decição inválida: \n");
        }

    }

    public static void forCrencente(){
        System.out.println("FOR CRESCENTE:\n");
        for (int n1 = 0; n1 < 101; n1++) {
            System.out.println("O contador está em:" + n1);
        }
        System.out.println();
    }
    public static void forDescrencente(){
        System.out.println("FOR DECRESCENTE:\n");
        for (int n1 = 100; n1 >= 0; n1--){
           System.out.println("O contador está em: " + n1);
        }
        System.out.println();
    }
}
