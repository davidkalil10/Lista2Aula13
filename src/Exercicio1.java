
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerosInteiros = new int[9];

		numerosInteiros[0] = 1;
		numerosInteiros[1] = 2;
		numerosInteiros[2] = 3;
		numerosInteiros[3] = 4;
		numerosInteiros[4] = 5;
		numerosInteiros[5] = 6;
		numerosInteiros[6] = 7;
		numerosInteiros[7] = 8;
		numerosInteiros[8] = 9;

		// Checar se é numero primo

		for (int i = 0; i < numerosInteiros.length; i++) {

			if (verificaPrimo(numerosInteiros[i])) {
				System.out.println("O numero " + numerosInteiros[i] + " da posição " + i + " é primo");
			}
			;

		}

	}
	
	private static boolean verificaPrimo(int numero) {
		// TODO Auto-generated method stub
		
		for (int i=2; i<numero; i++) {
			if(numero%i == 0) {
				return false;
			}
			
		}
		return true;		
	}



}
