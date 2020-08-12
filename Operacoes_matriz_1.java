package Exercicios_Entrega;


import java.util.Scanner;

public class Operacoes_matriz_1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int [][] matriz1 = new int[2][2];
		int [][] matriz2 = new int[2][2];
		int [][] matriz3 = new int[2][2];
		int op;
		int c;
		
		for(int linha=0; linha<2; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.printf("Insira o elemento matriz1[%d][%d]: ", linha, coluna);
				matriz1[linha][coluna]=entrada.nextInt();
			}
		}
		System.out.println("\n");
		for(int linha=0; linha<2; linha++) {
			for(int coluna = 0; coluna<2; coluna++) {
				System.out.printf("Insira o elemento matriz2[%d][%d]: ", linha, coluna);
				matriz2[linha][coluna]=entrada.nextInt();
			}
		}
				
		System.out.println("\nO que gostaria de fazer com as duas matrizes? \n\n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
		op = ler.nextInt();
		switch (op) {
			case 1:
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						matriz3[linha][coluna]= matriz1[linha][coluna]+matriz2[linha][coluna];;
					}
				}
				System.out.printf("\nMatriz resultante: \n");
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
						System.out.println(matriz3[linha][coluna]);
						
					}
				}
				break;
				
			case 2:
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						matriz3[linha][coluna]= matriz2[linha][coluna]-matriz1[linha][coluna];;
					}
				}
				System.out.printf("\nMatriz resultante: \n");
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
						System.out.println(matriz3[linha][coluna]);
						
					}
				}
				break;
				
			case 3:
				System.out.println("\nDigite um número para a constante: ");
				c = ler.nextInt();
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						matriz1[linha][coluna]= matriz1[linha][coluna]+c;
					}
				}
				System.out.printf("\nMatriz 1 corrigida: \n");
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
						System.out.println(matriz1[linha][coluna]);
					}
				}
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						matriz2[linha][coluna]= matriz2[linha][coluna]+c;
					}
				}
				System.out.printf("\nMatriz 2 corrigida: \n");
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
						System.out.println(matriz2[linha][coluna]);
					}
				}
				break;
				
			case 4:
				System.out.println("\n-Matriz 1: ");
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
						System.out.println(matriz1[linha][coluna]);
					}
				}
				System.out.println("\n-Matriz 2: ");				
				for(int linha=0; linha<2; linha++) {
					for(int coluna = 0; coluna<2; coluna++) {
						System.out.printf("\nM[%d][%d]: ",linha,coluna, ":");
						System.out.println(matriz2[linha][coluna]);
					}
				}
				break;
				default:
					System.out.println("Opção inválida, por favor, reinicie com uma opção válida.");
				
		}
			
				
	}
}
