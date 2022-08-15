package EstruturasRepetitivas.While;

public class Main {
    public static void main(String[] args) {
        // Nesse capítulos vamos ver a estrutura de repetição While
        // Muito parecido com Javascript

        // Usa-se While quando não sabe quantas repetições serão necessárias
        int i = 0;
        int j = 0;
        // Para exemplo vamos fazer apenas um contador de 0 até 10, para entender a
        // sintaxe

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // OBS: podemos realizar o do/while também, que realizar a verficação no final e
        // executa os comandos ao menos uma vez

        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
