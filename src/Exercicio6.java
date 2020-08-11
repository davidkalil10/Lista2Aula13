import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {

		double[] nums = new double[5];

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));

		if (codigo == 1 || codigo == 2) {

			JOptionPane.showMessageDialog(null, "Digite os inputs do array: ");
			nums[0] = Double.parseDouble(JOptionPane.showInputDialog("1: "));
			nums[1] = Double.parseDouble(JOptionPane.showInputDialog("2: "));
			nums[2] = Double.parseDouble(JOptionPane.showInputDialog("3: "));
			nums[3] = Double.parseDouble(JOptionPane.showInputDialog("4: "));
			nums[4] = Double.parseDouble(JOptionPane.showInputDialog("5: "));

			if (codigo == 1) {
				String vazio = "";
				for (double num : nums) {
					vazio += num + " ,";
				}
				JOptionPane.showMessageDialog(null, vazio);

			} else if (codigo == 2) {
				String vazio = "";
				for (int i=nums.length-1;i>=0;i--) {
					vazio += nums[i] + " ,";
				}
				JOptionPane.showMessageDialog(null, vazio);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Código inválido palhaço");
		}

	}
	
	

}
