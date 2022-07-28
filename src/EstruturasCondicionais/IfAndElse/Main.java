package EstruturasCondicionais.IfAndElse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Esse parte é bem simples, as estruturas condicionais if/else são bem
        // semelhantes em sintaxe com o javascript
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x == y) {
            System.out.println("X é igual a Y");
        } else if (x > y) {
            System.out.println("X é maior que Y");
        } else {
            System.out.println("X é menor que Y");
        }

        sc.close();
    }
}