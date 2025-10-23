package estruturarepeticao;

public class EstruturaRepeticao {
    public  static void main(String[] args) {
        forCrencente();
        forDescrencente();
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
