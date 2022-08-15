package OOJava.Application;

import java.util.Scanner;
import java.util.Locale;

public class WithoutOO {
    /*
     * Nesse capítulos vamos falar sobre Orientação a Objetos em Java
     * 
     * Para entender a diferença vamos resolver um desafio utilizando o paradgima de
     * orientação a objetos e depois com o OO
     * 
     * Desafio: Calcular a área de 2 triângulos
     */

    public static void main(String[] args) {
        int lA1, lB1, lC1;
        int lA2, lB2, lC2;
        double p1, p2;
        double area1, area2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do primeiro triângulo");
        lA1 = sc.nextInt();
        lB1 = sc.nextInt();
        lC1 = sc.nextInt();
        System.out.println("Digite os lados do segundo triângulo");
        lA2 = sc.nextInt();
        lB2 = sc.nextInt();
        lC2 = sc.nextInt();

        p1 = (double) (lA1 + lB1 + lC1) / 2;

        p2 = (double) (lA2 + lB2 + lC2) / 2;

        area1 = (double) Math.sqrt(p1 * (p1 - lA1) * (p1 - lB1) * (p1 - lC1));

        area2 = (double) Math.sqrt(p2 * (p2 - lA2) * (p2 - lB2) * (p2 - lC2));

        System.out.printf("Área do 1° triângulo: %.2f%n", area1);
        System.out.printf("Área do 2° triângulo: %.2f%n", area2);

        sc.close();

    }
}
