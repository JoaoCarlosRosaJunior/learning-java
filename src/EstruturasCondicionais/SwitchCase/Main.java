package EstruturasCondicionais.SwitchCase;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Quando temos casos de vários ifs/elses encadeados, podemos utilizar o switch
        // case.

        // Exemplo: Temos que receber de input um número de 1 a 7 e dizer o dia da
        // semana correspondente.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int dia;
        String valor;

        dia = sc.nextInt();

        switch (dia) {
            case 1:
                valor = "Domingo";
                break;
            case 2:
                valor = "Segunda";
                break;
            case 3:
                valor = "Terça";
                break;
            case 4:
                valor = "Quarta";
                break;
            case 5:
                valor = "Quinta";
                break;
            case 6:
                valor = "Sexta";
                break;
            case 7:
                valor = "Sabado";
                break;
            default:
                valor = "Dia Invalido";
                break;
        }

        System.out.println(valor);
        sc.close();
    }
}
