package OOJava.entities;

public class Triangle {
    /*
     * Nesse capítulos vamos falar sobre Orientação a Objetos em Java
     * 
     * Para entender a diferença vamos resolver um desafio utilizando o paradgima de
     * orientação a objetos e depois com o OO
     * 
     * Desafio: Calcular a área de 2 triângulos
     * OBS: aqui vamos calcular utilizando práticas e fundamentos de OO
     */

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
