package view;

import controller.GrafoController;

public class Principal {

	public static void main(String[] args) {
		//int matriz[][] = {{5,6,0,0,1},{11,12,13,14,15},{0,20,0,15,0},{0,8,7,0,0},{6,2,0,0,0}};
		int matriz[][];
		GrafoController g = new GrafoController();
		matriz = g.carregaMatriz();
		g.mostraArestas(matriz);

	}

}
