package arrays1;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class classe1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int x=0;

		System.out.println("Matriz [3][3] \n");
		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = ler.nextInt();
			}
		}

		System.out.println("\nA Matriz ficou: \n");
		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println();
		}
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				if (matriz[a][b] > 10) {
					x++;
				}
			}
		}
		System.out.println("\nNúmeros maiores que 10: "+x);
	}
}
