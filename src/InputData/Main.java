package InputData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nessa parte vamos tratar da entrada e captura de dados com Java pelo
        // terminal. Como se fosse o input do python
        // Para isso iremos utilizar um módulo do java utils chamado Scanner
        Scanner sc = new Scanner(System.in);

        String nome;

        nome = sc.next();

        // Se quisermos ler do terminal um número inteiro, as coisas mudam um pouquinho,
        // veja o exemplo abaixo.
        int idade;

        idade = sc.nextInt();

        System.out.printf("%s tem %d anos%n", nome, idade);

        // Para ler um texto até a quebra de linha podemos utilizar o nextLine(), isso
        // quer dizer que a variavel que está recebendo o input vai armazenar o que
        // escrevemos até darmos enter
        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("1° string: " + s1);
        System.out.println("2° string: " + s2);
        System.out.println("3° string: " + s3);

        // Esse objeto Scanner reque que encerremos ele quando não formos mais usar com
        // sc.close()
        sc.close();
    }
}
