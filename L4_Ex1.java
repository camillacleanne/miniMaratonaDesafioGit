/* L4_Ex1
Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
O programa deve executar os seguintes passos: 

(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
 
(b) Armazene em uma variável inteira (simples) a soma entre os 
	valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
	 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */


package Lista4;

import java.util.*;

public class L4_Ex1
{
	public static void main (String args[])
	{
		Scanner read = new Scanner(System.in);
		
		int [] A = new int[6];
		int [] B = {1, 0, 5, -2, -5, 7};
		int soma015 = 0, i;
	
		
		for(i=0; i<6; i++)
		{
			System.out.printf("A[%d] <=== B[%d] = %2d\n", i, i, B[i]);
			A[i] = B[i];
			
			if( i == 0 || i == 1 || i == 5)
			{
				soma015 = soma015+A[i];
			}
		}
		System.out.printf("Soma: A[0] + A[1] + A[5] = %d", soma015);
		
		A[4] = 100;
		System.out.printf("\nValores do vetor:");		
		
		for(i=0; i<6; i++)
		{
			System.out.printf("[%d]",A[i]);
		}
		
	}
	
}
