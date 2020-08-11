

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[8];

		numeros[0] = 1;
		numeros[1] = -2;
		numeros[2] = 3;
		numeros[3] = -4;
		numeros[4] = 5;
		numeros[5] = -6;
		numeros[6] = 7;
		numeros[7] = -8;
		
		java.util.Arrays.sort(numeros);
		//java.util.Arrays.sort(numeros,0,4); //subarray classificado
		
		for (int num : numeros) {
			System.out.println(num);
			}

	}

}
