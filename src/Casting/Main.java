package Casting;

public class Main {
    public static void main(String[] args) {
        // Nessa parte vamos estudar um pouco sobre o casting, que é a definição
        // explicíta de tipos.
        // Digamos que tenhas que dividir o número 5 pelo número 2, ambos são inteiros e
        // o resultado seria um número decimal(double)
        // Mas, se apenas fizermos a divisão, isso não dará certo.

        int a, b;
        double resultado, resultadoCasting;
        a = 5;
        b = 2;
        resultado = a / b;
        System.out.printf("O resultado da operação sem casting: %f%n", resultado);
        // Nesse exemplo o resultado deu como 2,0000. Isso acontece pq na operação
        // inteiro/inteiro, o compilador entende que o resultado será um inteiro
        resultadoCasting = (double) a / b;
        System.out.printf("O resultado da operação com casting: %f%n", resultadoCasting);
        // Nesse caso inserimos o termo (double) antes, que sinalizou pro compilador
        // qual o tipo da operação que estamos realizando. Isso se chama casting.
    }
}
