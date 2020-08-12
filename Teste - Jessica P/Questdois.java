/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
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
		
		//Resposta do 1º ponto. 
		System.out.println("\nSegue numeros pares digitasdos e suas respectivas posições: ");
		
		
		for (i=0;i<=5;i++)
		{   
			if (n[i]%2==0)
			{	
			System.out.println("\nPosição " +i+ " = " + "["+ n[i] +"]");
			soma = soma + n[i];
			}
			
		}
		
		//Resposta do 2º ponto. 
		System.out.println("\nSegue soma dos numeros pares: " + soma);
		
		
		//Resposta do 3º ponto. 
		System.out.println("\nSegue numeros impares digitasdos e suas respectivas posições: ");
		
		for (i=0;i<=5;i++)
		{
			if (n[i]%2!=0) 
			{
			System.out.println("\nPosição " +i+ " = " + "["+ n[i] +"]");
			conti++;
			}
		}
	
		//Resposta do 4º ponto. 
		System.out.println("\nForam digitados " + conti + " numeros impares.");
	
	}
}
