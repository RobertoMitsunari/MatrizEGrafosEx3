package controller;

import javax.swing.JOptionPane;

public class GrafoController {
	public int[][] carregaMatriz() {
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de linhas"));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de colunas"));
		int num;
		boolean conexo = false;
		int matriz[][] = new int[x][y];

		for (int l = 0; l < x; l++) {
			for (int c = 0; c < y; c++) {
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da linha " + l + ", coluna " + c));
				if(num > 0) {
					conexo = true;
				}
				matriz[l][c] = num;
			}
			if(!conexo) {
				JOptionPane.showMessageDialog(null,"O ponto " + l + " deve ser conectada a pelo menos um ponto");
				l--;
			}else {
				conexo = false;
			}
		}
		return matriz;

	}
	
	public void mostraArestas(int matriz[][]) {
		int l = matriz.length;
		int c = matriz[0].length;

		for (int x = 0; x < l; x++) {
			for (int y = 0; y < c; y++) {
				if (matriz[x][y] >= 1) {
					JOptionPane.showMessageDialog(null,"(" + x + " , " + y +") peso: " + matriz[x][y]);
				}
			}
		}
	}
}
