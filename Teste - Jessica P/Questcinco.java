/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual 
 * a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/


package Atividade110820;

import java.util.Scanner;

public class Questcinco {
	
		public static void main (String argrs[])
		{
		
			Scanner ler = new Scanner(System.in);
			int n, soma=0; 
					
			do
			{
				
				System.out.println("Entre com um numero :");
				n= ler.nextInt();
				soma= soma+n; 
			}while(n!=0);
			
			System.out.println("O resultado da soma dos numero digitados �: " + soma);

		}
}
