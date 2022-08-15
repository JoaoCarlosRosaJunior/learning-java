package OOJava.Application;

import OOJava.entities.*;
import java.util.Locale;
import java.util.Scanner;

public class WithOO {
    /*
     * Nesse capítulos vamos falar sobre Orientação a Objetos em Java
     * 
     * Para entender a diferença vamos resolver um desafio utilizando o paradgima de
     * orientação a objetos e depois com o OO
     * 
     * Desafio: Calcular a área de 2 triângulos
     * OBS: aqui vamos calcular utilizando práticas e fundamentos de OO
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        double Ax, Ay;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle 1: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle 1: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        Ax = x.area();
        Ay = y.area();

        System.out.printf("Área do triângulo 1: %f%n", Ax);
        System.out.printf("Área do triângulo 2: %f%n", Ay);

        sc.close();

    }
}
