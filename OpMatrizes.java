/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante 
deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.*/

package Arrays;

import java.util.Scanner;

public class OpMatrizes {
	public static void main (String[]args)
	{
		Scanner ler = new Scanner(System.in);
		
		double [][]mat1 = new double [2][2];
		double [][]mat2 = new double [2][2];
		double [][]sumOrSub = new double [2][2];
		int x, i, j;
				
		for (i=0;i<2;i++) 
		{
			for(j=0;j<2;j++) 
			{
				System.out.printf("Digite o valor de mat 1 [%d][%d]%n", i+1, j+1);
				mat1[i][j]=ler.nextDouble();
			}
		}
		
		for (i=0;i<2;i++) 
		{
			for(j=0;j<2;j++) 
			{
				System.out.printf("Digite o valor de mat 2 [%d][%d]%n", i+1, j+1);
				mat2[i][j]=ler.nextDouble();
			}
		}
		
		do
		{
			System.out.printf("%nDigite a uma op��o:%n1--Somar as duas matrizes%n2--Subtrair a primeira matriz da segunda%n3--Adcionar uma constante as duas matrizes%n4--Imprimir as matrizes%n5--Sair%n");
			x = ler.nextInt();
		
			switch(x) 
			{
			case 1:
				System.out.println("A soma das matrizes �: ");
				for (i=0;i<2;i++)
				{
					for (j=0;j<2;j++)
					{
						sumOrSub[i][j] = mat1[i][j]+mat2[i][j];
						System.out.printf("%d|%d = [%.2f]%n",i+1, j+1, sumOrSub[i][j]);
					}
				}
				break;
			case 2:
				System.out.println("A Subtra��o das matrizes �: ");
				for (i=0;i<2;i++)
				{
					for (j=0;j<2;j++)
					{
						sumOrSub[i][j] = mat1[i][j]-mat2[i][j];
						System.out.printf("%d|%d = [%.2f]%n",i+1, j+1, sumOrSub[i][j]);
					}
				}
				break;
			case 3:
				System.out.println("Digite a constante que deseja adicionar: ");
				double n = ler.nextDouble();
				
				for (i=0;i<2;i++)
				{
					for (j=0;j<2;j++)
					{
						mat1[i][j] = mat1[i][j] + n; 
						mat2[i][j] = mat2[i][j] + n; 
		
						System.out.printf("%d|%d = [%.2f]%n",i+1,j+1, mat1[i][j]);
						System.out.printf("%d|%d = [%.2f]%n",i+1,j+1, mat2[i][j]);
					}
				}
				break;
			case 4:
				System.out.println("O valor contido nas matrizes � de: ");
				for (i=0;i<2;i++)
				{
					for (j=0;j<2;j++)
					{
						System.out.printf("Matriz 1: %n%d|%d = [%.2f]%n",i+1,j+1, mat1[i][j]);
						System.out.printf("Matriz 2: %n%d|%d = [%.2f]%n",i+1,j+1, mat2[i][j]);
					}
				}
			break;
			default:
				if(x!=5) {
				System.out.println("Op��o invalida, digite novamente.");
				}
			}
			
		}while(x!=5);
	}
}
