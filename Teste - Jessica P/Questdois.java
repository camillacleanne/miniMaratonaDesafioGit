/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/


package Atividade120820;

import java.util.Scanner;

public class Questdois {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n[] = new int[6];
		int b=2, i, soma=0, conti=0;
		
		
		for (i=0;i<=5;i++)
		{
			System.out.println("Entre com um numero: ");
			n[i] = ler.nextInt();
		}
		
		//Resposta do 1� ponto. 
		System.out.println("\nSegue numeros pares digitasdos e suas respectivas posi��es: ");
		
		
		for (i=0;i<=5;i++)
		{   
			if (n[i]%2==0)
			{	
			System.out.println("\nPosi��o " +i+ " = " + "["+ n[i] +"]");
			soma = soma + n[i];
			}
			
		}
		
		//Resposta do 2� ponto. 
		System.out.println("\nSegue soma dos numeros pares: " + soma);
		
		
		//Resposta do 3� ponto. 
		System.out.println("\nSegue numeros impares digitasdos e suas respectivas posi��es: ");
		
		for (i=0;i<=5;i++)
		{
			if (n[i]%2!=0) 
			{
			System.out.println("\nPosi��o " +i+ " = " + "["+ n[i] +"]");
			conti++;
			}
		}
	
		//Resposta do 4� ponto. 
		System.out.println("\nForam digitados " + conti + " numeros impares.");
	
	}
}
