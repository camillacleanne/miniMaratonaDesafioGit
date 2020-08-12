package ex4_matrizMenu;

import java.util.Scanner;

public class MatrizMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int ln = 2, cl = 2;
		
		float[][] m1 = new float[ln][cl];
		float[][] m2 = new float[ln][cl];
		float[][] m3 = new float[ln][cl];
		float valor = 0; 
		int x,y,op = 0;
		char sair = ' ';
		
		System.out.println("Digite os numeros da matriz 1: "); // Recebe a matriz 1
		for (x=0; x < ln; x++) {
			for (y=0; y < cl; y++) {
				System.out.printf("Nº %dx%d: ", x+1 ,y+1);
				m1[x][y] = sc.nextFloat();
			}
		}
		
		System.out.println("Digite os numeros da matriz 2: "); // Recebe a matriz 2
		for (x=0; x < ln; x++) {
			for (y=0; y < cl; y++) {
				System.out.printf("Nº %dx%d: ", x+1 ,y+1);
				m2[x][y] = sc.nextFloat();
			}
		}
		
		
		while(op != 9) {
			System.out.println("\nEscolha: \n(1) Somar Matrizes \n(2) Subtrair a Matriz 1 da MAtriz 2"
								+"\n(3) adicionar constante as  2 matrizes\n(4) Imprimir Matrizes \n(9) Sair"); // Menu
			op = sc.nextInt();// Recebe a opção do usuario
					
			switch(op) {  // seleciona as opções
				
			case 1:
				for (x=0; x < ln; x++) { // corre as matrizes
					for (y=0; y < cl; y++) {
						m3[x][y] = m1[x][y] + m2[x][y]; // soma a matriz 1 e matriz 2 salvando na matriz 3
					}
				}
				
				for (x=0; x < ln; x++) {
					for (y=0; y < cl; y++) {
						System.out.printf("%.1f ", m3[x][y]); // mostra a matriz 3
					}
					System.out.println(" ");
				}
				
				break;
				
			case 2:
				for (x=0; x < ln; x++) { // corre a matriz
					for (y=0; y < cl; y++) {
						m3[x][y] = m1[x][y] - m2[x][y]; // subtrai a matriz 1 da matriz 2 salvando na matriz 3
					}
				}
				
				for (x=0; x < ln; x++) {
					for (y=0; y < cl; y++) {
						System.out.printf("%.1f ", m3[x][y]); // mostra a matriz 3
					}
					System.out.println(" ");
				}
				break;
				
			case 3:
				System.out.println("Digite o valor: ");
				valor = sc.nextFloat();
				
				for (x=0; x < ln; x++) { // corre a matriz
					for (y=0; y < cl; y++) {
						m3[x][y] = m3[x][y] + valor; // Soma a contante nos valores da matriz 3
					}
				}
				
				for (x=0; x < ln; x++) {
					for (y=0; y < cl; y++) {
						System.out.printf("%.1f ", m3[x][y]); // imprime a matriz 3
					}
					System.out.println(" ");
				}
				
				
				break;
			case 4:
				System.out.println("\nMatriz 1: \n");
				for (x=0; x < ln; x++) {
					for (y=0; y < cl; y++) {
						System.out.printf("%.1f ", m1[x][y]); // imprime a matriz 1
					}
					System.out.println(" ");
				}
				
				System.out.println("\nMatriz 2: \n");
				for (x=0; x < ln; x++) {
					for (y=0; y < cl; y++) {
						System.out.printf("%.1f ", m2[x][y]); // imprime a matriz 2
					}
					System.out.println(" ");
				}
				
				System.out.println("\nMatriz 3: \n");
				for (x=0; x < ln; x++) {
					for (y=0; y < cl; y++) {
						System.out.printf("%.1f ", m3[x][y]); // imprime a matriz 3
					}
					System.out.println(" ");
				}
				
				break;
				
			default:
				System.out.println("Opção Incorreta");
			}
			
			System.out.println("Deseja continuar??(S/N)"); // 0 volta ao menu e 9 sai do while
			sair = sc.next().charAt(0);
			if(sair == 's' || sair == 'S') {
				op = 9;
				System.out.println("Saindo.....");
			}
			
		}
		sc.close();
	}

}
