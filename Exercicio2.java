package Array;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) 
	{
		/*(Vetor)Faça um programa que receba 6 números inteiros e mostre: 
		 * • Os números pares digitados;  
		 * • A soma dos números pares digitados; 
		 * • Os números ímpares digitados; 
		 * • A quantidade de números ímpares digitados.*/
		
		Scanner ler = new Scanner(System.in);
		
		final int tamanho = 6;
		int[] vetor = new int[tamanho];
		int[] vetorp = new int[tamanho];
		int[] vetori = new int[tamanho];
		int i,somap=0,ni=0;
		
		for(i=0; i<tamanho; i++) 
		{
			System.out.println("Digite um valor: ");
			vetor[i] = ler.nextInt();
		}        
        System.out.printf("\nNúmeros pares: ");
        for(i=0; i<tamanho; i++) 
        {
            if(vetor[i] % 2 == 0) 
            {
                vetorp[i] = vetor[i];
            	System.out.printf(" %d \t",vetorp[i]);
                somap = somap + vetorp[i];
            }
        }
        System.out.printf("\nSoma dos valores pares: %d ",somap);
        System.out.printf("\nNúmeros ímpares: ");
        for(i=0; i<tamanho; i++) 
        {
            if(vetor[i] % 2 != 0) 
            {
                vetori[i] = vetor[i];
            	System.out.printf(" %d \t",vetori[i]);
                ni++;
            }
        }
        System.out.printf("\nQuantidade de números ímpares: %d ",ni);
	}

}
