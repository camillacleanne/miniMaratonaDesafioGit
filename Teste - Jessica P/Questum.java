/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. // ok 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. // ok
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/



package Atividade120820;

import java.util.Scanner;

public class Questum {

	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a[] = new int[6];
		int b=2, i;
	 
		
		//Resposta letra a
		System.out.println("\n\nResposta letra a: \n");

		for (i=0;i<=5;i++)
		{
			System.out.println("Entre com o valor estipulado: ");
			a[i] = ler.nextInt();
		}
		//Resposta letra b
		System.out.println("\n\nResposta letra b: \n");

		a[0]= a[0]+b;
		a[1]= a[1]+b;
		a[5]= a[5]+b;
		
		//Resposta letra c
		
		
		a[4]=100;
		
		//Resposta letra d
		System.out.println("\n\nResposta letra d: \n");
		for (i=0;i<=5;i++)
		{
			System.out.println("\n["+a[i]+"]");
		}
		
	}
	
	
}
