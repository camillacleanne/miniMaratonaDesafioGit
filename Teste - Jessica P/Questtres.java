/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/



package Atividade120820;

import java.util.*;

public class Questtres {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n[][] = new int[3][3];
		int i, l=0, c=0;
		
		for (l=0;l<=2;l++)
		{
			for (c=0;c<=2;c++)
			{
				System.out.printf("Entre com o valor da [%d][%d] :" ,l,c);
				n[l][c]= ler.nextInt();
			}
		}
		System.out.printf("\n");
		for (l=0;l<=2;l++)
		{
			for (c=0;c<=2;c++)
			{	
			System.out.print("["+n[l][c]+"]");
			} 
			System.out.printf("\n");
		
		}
		
		System.out.printf("\nO numeros digitas miores que 10 são: \n");
		for (l=0;l<=2;l++)
		{
			for (c=0;c<=2;c++)
			{
			 if (n[l][c]>10)
			 {	
				 System.out.println("" + n[l][c]);
			 }
			
			}
		}
		
	}
}
