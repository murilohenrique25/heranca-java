package executavel;

import javax.swing.JOptionPane;

public class ArrayVector {
	
	public static void main(String[] args) {
		String posicoes = JOptionPane.showInputDialog("Qauntas posi��es deseja ter?");
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o:  "+pos);
			
			notas[pos] = Double.valueOf(valor);
		}
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � " +notas[pos]);
		}
	}
}
