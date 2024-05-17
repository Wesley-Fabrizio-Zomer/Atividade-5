import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner estoque = new Scanner(System.in);
        System.out.println("Digite o valor mínimo de peças no estoque:");
        int estoqueMinimo = estoque.nextInt();
        System.out.println("Digite o valor máximo de peças no estoque:");
        int estoqueMaximo = estoque.nextInt();
        int estoqueMedia = (estoqueMinimo + estoqueMaximo) / 2;
        System.out.println("O estoque médio é de " + estoqueMedia + " peças");
    }
}