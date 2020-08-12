package ExerciciodeArrays;

import java.util.*;

/* Faça um programa que receba 6 números inteiros e mostre:
 • Os números pares digitados;
 • A soma dos números pares digitados;
 • Os números ímpares digitados;
 • A quantidade de números ímpares digitados.
 */
public class ExArrays2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[6];  			// recebe os 6 números digitados
		int[] vetorPar = new int[6];		// alocar só os números pares
		int[] vetorImpar = new int[6];		// alocar só os numeros impares 
		
		int i, somaPares=0, contImpar=0, x=-1, y=-1, contPar=0;
		
		for ( i=0; i < 6 ; i++) {						// pedir os números digitados 
			
			System.out.printf("Insira um número %d: ", i+1);
			vetor[i] = sc.nextInt();
			
			if( vetor[i] % 2 == 0) {				// condição > coloca os números pares dentro do VetorPAR
				
				x++;
				vetorPar[x] = vetor[i];
				contPar++;
			}
			
			if (vetor[i] % 2 != 0) {				// condição > colocar os n°s impares dentro do VetorImpar
				
				y++;
				vetorImpar[y] = vetor[i];			
				contImpar++;
			}
			
		}
		
		for ( i= 0; i < vetorPar.length; i++) {			// responsavel pra fazer a soma 
			
			somaPares = somaPares + vetorPar[i];
			
		}
		
		for ( i=0; i < contPar; i++ ) {
			System.out.println("\nOs números pares digitados foram: " + vetorPar[i]);
		}
		
			System.out.println("\nSoma dos N°s pares: " + somaPares);		// soma dos pares do programa 
		
		for (i=0; i < contImpar; i++) {
			System.out.println("\nOs N°s ímpares digitados: " + vetorImpar[i]);
		}
		
			System.out.println("\nQuantidade de N°s ímpares digitados: " + contImpar);		// numeros impares 
		sc.close();
   }

}
