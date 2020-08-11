
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numerosPrimos = new int[10];
		int contador=0;
		
		for (int i=100;contador<= 9;i++) {
			
			if(verificaPrimo(i)) {
				numerosPrimos[contador]= i;
				contador++;
				
			}
			
		}
		
		for(int num : numerosPrimos) {
			System.out.println(num);
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
