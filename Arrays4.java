package arrays;
import java.util.Scanner;

//Exercício 4 - Arrays
//Carolina Mira

public class Arrays4 {
	
	public static void main(String[] args) {
		
		int i1, j1, i2, j2, option, i, j, cte;
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		
		Scanner entrada = new Scanner(System.in);
		
		//leitura dos valores para a matriz m1
		for(i1=0; i1<2; i1++) {
			for(j1=0; j1<2; j1++) {
			System.out.printf("Digite o elemento M1[%d][%d]: ", i1+1, j1+1);
			m1[i1][j1] = entrada.nextFloat();			
		}
	}
		//leitura dos valores para a matriz m2
				for(i2=0; i2<2; i2++) {
					for(j2=0; j2<2; j2++) {
					System.out.printf("Digite o elemento M2[%d][%d]: ", i2+1, j2+1);
					m2[i2][j2] = entrada.nextFloat();			
				}
			}
		
		System.out.println("\nEscolha uma opção: ");
		System.out.printf("1 -- Soma as matrizes.\n2 -- Subtrai as matrizes.\n3 -- Adicionar uma constante para as duas matrizes.\n4 -- Imprimir as matrizes.");
		option = entrada.nextInt();
				
		switch(option) {
			
		case 1:
			for(i=0; i<2; i++) {
				for(j=0; j<2; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];	
				}			
			}
			System.out.println("\nMatriz M3 resultante da soma:");
			for(i=0; i<2; i++) {
			for(j=0; j<2; j++) {
			System.out.printf(" %f ", m3[i][j]);
				}
			System.out.println("");
			}
		
		break;
		
		case 2:
			
			for(i=0; i<2; i++) {
				for(j=0; j<2; j++) {
				m3[i][j] = m2[i][j] - m1[i][j];	
				}			
			}
			
			System.out.println("\nMatriz M3 resultante da subtração:");
			for(i=0; i<2; i++) {
			for(j=0; j<2; j++) {
			System.out.printf(" %f ", m3[i][j]);
					
				}
			System.out.println("");
			}
		
		break;
		
		case 3:
			
			System.out.println("Digite um valor para a constante: ");
			cte = entrada.nextInt();
			
			for(i=0; i<2; i++) {
				for(j=0; j<2; j++) {
				m1[i][j] = m1[i][j] + cte;	
				m2[i][j] = m2[i][j] + cte;
				}			
			}
			
			//exibindo a matriz m1
			System.out.println("\nMatriz resultante M1:");
			for(i1=0; i1<2; i1++) {
			for(j1=0; j1<2; j1++) {
			System.out.printf(" %f ", m1[i1][j1]);
					
				}
			System.out.println("");
			}
				
			//exibindo a matriz m2
			System.out.println("\nMatriz resultante M2:");
			for(i2=0; i2<2; i2++) {
			for(j2=0; j2<2; j2++) {
			System.out.printf(" %f ", m2[i2][j2]);
					
					}
			System.out.println("");
				}	
			
		break;
		case 4:
		
		//exibindo a matriz m1
		System.out.println("\nMatriz resultante M1:");
		for(i1=0; i1<2; i1++) {
		for(j1=0; j1<2; j1++) {
		System.out.printf(" %f ", m1[i1][j1]);
				
			}
		System.out.println("");
		}
			
		//exibindo a matriz m2
		System.out.println("\nMatriz resultante M2:");
		for(i2=0; i2<2; i2++) {
		for(j2=0; j2<2; j2++) {
		System.out.printf(" %f ", m2[i2][j2]);
				
				}
		System.out.println("");
			}	
		break;
		
		default:
		
		System.out.println("Opção inválida! Escolha entre uma das opções.");
		break;
		
		}
		
	}
	
}
		


