package ExerciciodeArrays;

import java.util.*;

/* Fa�a um programa que receba 6 n�meros inteiros e mostre:
 � Os n�meros pares digitados;
 � A soma dos n�meros pares digitados;
 � Os n�meros �mpares digitados;
 � A quantidade de n�meros �mpares digitados.
 */
public class ExArrays2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[6];  			// recebe os 6 n�meros digitados
		int[] vetorPar = new int[6];		// alocar s� os n�meros pares
		int[] vetorImpar = new int[6];		// alocar s� os numeros impares 
		
		int i, somaPares=0, contImpar=0, x=-1, y=-1, contPar=0;
		
		for ( i=0; i < 6 ; i++) {						// pedir os n�meros digitados 
			
			System.out.printf("Insira um n�mero %d: ", i+1);
			vetor[i] = sc.nextInt();
			
			if( vetor[i] % 2 == 0) {				// condi��o > coloca os n�meros pares dentro do VetorPAR
				
				x++;
				vetorPar[x] = vetor[i];
				contPar++;
			}
			
			if (vetor[i] % 2 != 0) {				// condi��o > colocar os n�s impares dentro do VetorImpar
				
				y++;
				vetorImpar[y] = vetor[i];			
				contImpar++;
			}
			
		}
		
		for ( i= 0; i < vetorPar.length; i++) {			// responsavel pra fazer a soma 
			
			somaPares = somaPares + vetorPar[i];
			
		}
		
		for ( i=0; i < contPar; i++ ) {
			System.out.println("\nOs n�meros pares digitados foram: " + vetorPar[i]);
		}
		
			System.out.println("\nSoma dos N�s pares: " + somaPares);		// soma dos pares do programa 
		
		for (i=0; i < contImpar; i++) {
			System.out.println("\nOs N�s �mpares digitados: " + vetorImpar[i]);
		}
		
			System.out.println("\nQuantidade de N�s �mpares digitados: " + contImpar);		// numeros impares 
		sc.close();
   }

}
