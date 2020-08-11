import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random dado = new Random();
		int[] numerosSorteados = new int[20];

		for (int i = 0; i < 20; i++) {
			numerosSorteados[i] = dado.nextInt(6) + 1; // vai de 0 a 5 +1
			System.out.println(numerosSorteados[i]);

		}

		// Apuração
		for (int i = 1; i < 7; i++) {
			int contador =0;
			for (int num: numerosSorteados) {
				if (i == num) {
					contador++;
				}
			}

			System.out.println("Quantidade de " + i + ": " + contador);
		}

	}

}
