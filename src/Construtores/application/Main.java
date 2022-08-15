package Construtores.application;

import Construtores.entities.*;
import java.util.Scanner;

public class Main {
    /*
     * Construtores em Java são operadores exclusivos de Classes em Java. Ele
     * atribui valores para os atributos do objeto na sua inicialização e garante
     * que o objeto receba dados/dependências durante a sua instanciação(injeção de
     * dependências).
     */

    /*
     * Vamos importar a entidade produto para exemplifiar como criar o objeto que
     * possui construtor
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();

        Product produto = new Product(name, price);

        produto.ShowData();

        sc.close();
    }
}
