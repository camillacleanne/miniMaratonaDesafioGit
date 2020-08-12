/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e 
o resultado da adição da constante deve ser armazenado na própria matriz.
*/


package Atividade120820;

import java.util.*;
import java.util.Random;
import java.math.*;
import java.text.DecimalFormat;

public class Questquatro {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float m1[][] = new float[2][2];
		float m2[][] = new float[2][2];
		float m3so[][] = new float[2][2];
		float m3sub[][] = new float[2][2];
		Random random = new Random();
		int l=0, c=0, op;
		
		System.out.printf("Escolha uma opção: \n(1) somar as duas matrizes. \r" + 
		"\n(2) subtrair a primeira matriz da segunda. \r" + "\n(3) adicionar uma constante as duas matrizes.\r" + 
		"\n(4) imprimir as matrizes. \n\n Digite a opção escolhida:");
		op = ler.nextInt();
		
		//Matriz um
		
		for (l=0;l<=1;l++)
		{
			for (c=0;c<=1;c++)
			{
				
				m1[l][c]= random.nextInt();
			}
		}
		
	
		
		

		//Matriz dois
		
		
		for (l=0;l<=1;l++)
		{
			for (c=0;c<=1;c++)
			{
				m2[l][c]= random.nextInt();
			}
		}
		
		
		switch(op)
		{
		case 1:
			//Matriz Três - somar as duas matrizes - ok
			
			System.out.printf("\n\tMatriz 03 soma\n");
			
			for (l=0;l<=1;l++)
			{
				for (c=0;c<=1;c++)
				{
					m3so[l][c]= m2[l][c]+m1[l][c];
				}
			
			}
			
			System.out.printf("\n");
			
			for (l=0;l<=1;l++)
			{
				for (c=0;c<=1;c++)
				{
					System.out.printf("\t[" + m3so[l][c] +"]\t");
				}
				System.out.printf("\n");
			}break;
				
	
	
		case 2:
			
			//Matriz três - subtrair a primeira matriz da segunda - ok
			
			System.out.printf("\n\tMatriz 03 subtração\n");
								
				for (l=0;l<=1;l++)
				{
					for (c=0;c<=1;c++)
					{
						m3sub[l][c]= m2[l][c]-m1[l][c];
					}
					System.out.printf("\n");
				}
				
				for (l=0;l<=1;l++)
				{
					for (c=0;c<=1;c++)
					{
						System.out.printf("\t[" + m3sub[l][c] +"]\t");
					}
					System.out.printf("\n");
			
		
				}break;
				
		case 3:
			
			//adicionar uma constante as duas matrizes
			break;
			

		case 4:
			//imprimir as matrizes - ok
			
			System.out.printf("\n\tMatriz 01\n");
		
			for (l=0;l<=1;l++)
			{
				for (c=0;c<=1;c++)
				{
					System.out.printf("\t[" + m1[l][c] +"]\t");
				}
				System.out.printf("\n");
			}
			
			
			
			System.out.printf("\n\tMatriz 02\n");
			for (l=0;l<=1;l++)
			{
				for (c=0;c<=1;c++)
				{
					System.out.printf("\t[" + m2[l][c] +"]\t");
				}
				System.out.printf("\n");
			}break;
			
			
		
		
	
			}	
		
	}
}

