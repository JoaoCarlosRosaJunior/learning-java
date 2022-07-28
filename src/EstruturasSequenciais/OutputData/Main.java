package EstruturasSequenciais.OutputData;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Imprimindo int
		int x = 12;
		System.out.println(x);

		// Imprimindo double e suas formatações de casas decimais.
		double y = 32.5467;
		System.out.println(y);
		System.out.printf("%.2f%n", y); // Dessa maneira será impresso a variavel y com 2 casas decimais e irá pular de
										// linha
		// Esse print acima irá imprimir o double com a casa decimal sendo separada por
		// virgula.
		// Para ajustar:
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y); // Dessa maneira será printado com "."

		// Imprimindo char em unicode, '\u0061' == 'a'
		char letraUnicode = '\u0061';
		System.out.println(letraUnicode);

		// Concatenando elementos com printf
		// Sintaxe: System.out.printf("String %s String", variavel(Type String);
		String nome = "João";
		System.out.printf("Meu nome é %s%n", nome);

		// Agora se quisermos concatenar ints ou doubles, a tag muda, exemplo:
		System.out.printf("Variável com 2 casas decimais: %f%n", y);
		System.out.printf("Minha idade é: %d%n", x);

	}

}
