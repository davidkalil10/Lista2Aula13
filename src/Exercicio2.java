
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numeros = new int[8];
		int[] numerosPositivos = new int[8];
		int[] numerosNegativos = new int[8];


		numeros[0] = 1;
		numeros[1] = -2;
		numeros[2] = 3;
		numeros[3] = -4;
		numeros[4] = 5;
		numeros[5] = -6;
		numeros[6] = 7;
		numeros[7] = -8;
		
		for(int i=0;i<numeros.length; i++) {
			
			if (numeros[i]>0) {
				numerosPositivos[i] = numeros[i];
			} else {
				numerosNegativos[i] = numeros[i];
			}
			
		}
		System.out.println("Positivos: ");
		imprimir(numerosPositivos);
		System.out.println("Negativos: ");
		imprimir(numerosNegativos);
		
		
		
		
	}

	public static void imprimir(int[] arrayNumeros) {
		// TODO Auto-generated method stub
		for (int i =0; i<arrayNumeros.length;i++ ) {
			 System.out.println(arrayNumeros[i]);
		}
		
	}
	
	

}
