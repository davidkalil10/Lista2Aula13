import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperaturas = new int[12];
		String[] mesesAno = new String[12];
		mesesAno[0] = "Janeiro";
		mesesAno[1] = "Fevereiro";
		mesesAno[2] = "Março";
		mesesAno[3] = "Abril";
		mesesAno[4] = "Maio";
		mesesAno[5] = "Junho";
		mesesAno[6] = "Julho";
		mesesAno[7] = "Agosto";
		mesesAno[8] = "Setembro";
		mesesAno[9] = "Outubro";
		mesesAno[10] = "Novembro";
		mesesAno[11] = "Dezembro";

		JOptionPane.showMessageDialog(null, "Digite as temperaturas para cada mês: ");
		temperaturas[0] = Integer.parseInt(JOptionPane.showInputDialog("Janeiro: "));
		temperaturas[1] = Integer.parseInt(JOptionPane.showInputDialog("Fevereiro: "));
		temperaturas[2] = Integer.parseInt(JOptionPane.showInputDialog("Março: "));
		temperaturas[3] = Integer.parseInt(JOptionPane.showInputDialog("Abril: "));
		temperaturas[4] = Integer.parseInt(JOptionPane.showInputDialog("Maio: "));
		temperaturas[5] = Integer.parseInt(JOptionPane.showInputDialog("Junho: "));
		temperaturas[6] = Integer.parseInt(JOptionPane.showInputDialog("Julho: "));
		temperaturas[7] = Integer.parseInt(JOptionPane.showInputDialog("Agosto: "));
		temperaturas[8] = Integer.parseInt(JOptionPane.showInputDialog("Setembro: "));
		temperaturas[9] = Integer.parseInt(JOptionPane.showInputDialog("Outubro: "));
		temperaturas[10] = Integer.parseInt(JOptionPane.showInputDialog("Novembro: "));
		temperaturas[11] = Integer.parseInt(JOptionPane.showInputDialog("Dezembro: "));

		int valorMin = temperaturas[0];
		int valorMax = temperaturas[0];
		String mesMax = mesesAno[0];
		String mesMin = mesesAno[0];

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] >= valorMax) {
				valorMax = temperaturas[i];
				mesMax = mesesAno[i];
			}
			if (temperaturas[i] <= valorMin) {
				valorMin = temperaturas[i];
				mesMin = mesesAno[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Máxima: " +mesMax +" com " +valorMax + " graus");
		JOptionPane.showMessageDialog(null, "Mínima: " +mesMin +" com " +valorMin + " graus");
	}


}
