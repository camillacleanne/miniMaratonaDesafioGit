package Lista7Arrays;

import java.util.Scanner;

public class exercicio4 {
/*
4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante 
deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/
	public static void main(String[] args) {		
	
		int linhas,colunas,escolha,cte,preenchimento,range,min;
		
		Scanner entrada = new Scanner(System.in);

//BEM VINDO
		System.out.println("\nOlá, seja bem vindo ao criador de matrizes! Primeiramente, vamos escolher o tamanho das matrizes.");

		
//ESCOLHENDO O TAMANHO DA MATRIZ
		System.out.println("Escolha o número de linhas para as matrizes:");
		linhas = entrada.nextInt();
		
		System.out.println("\nAgora, escolha o número de colunas para as matrizes:");
		colunas = entrada.nextInt();
		
		int matriz1[][] = new int[linhas][colunas];
		int matriz2[][] = new int[linhas][colunas];
		int matrizsoma[][] = new int[linhas][colunas];
		int matrizsub[][] = new int[linhas][colunas];

//AUTOMATICO OU MANUAL?
		System.out.println("\nComo deseja preencher as matrizes: \n1 - Automáticamente\n2 - Manualmente");
		preenchimento = entrada.nextInt();
		
		while(preenchimento<1 || preenchimento>2)
		{
			System.out.println("\nOpçào inválida, por favor digite números entre 1 e 2: n1 - Automáticamente\\n2 - Manualmente\\n"); 
			escolha = entrada.nextInt();
		}

		
//ESCOLHA AUTOMÁTICA
		if(preenchimento==1)
		{
	//INTERVALO DE VALORES
			System.out.println("\nPor favor, escolha o intervalo de valores com qual deseja que cada posição seja preechida.");
			System.out.println("Digite o valor mínimo(inicial) do intervalo: ");
			min = entrada.nextInt();
			System.out.println("\nDigite o valor máximo(final) do intervalo: ");
			range = entrada.nextInt();
				if(min>=0)
				{
					range++;
				}
				else 
				{
					range = (range*2)+1;
				}			
			
			
	//GERAR MATRIZ 1 AUTOMATICAMENTE
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					matriz1[l][c] = (int)(Math.random()*range)+min;
				}
			}
			
	//IMPRIMIR MATRIZ
			System.out.println("\n\tMATRIZ 1 ("+linhas+" X "+colunas+"):\n");
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					System.out.printf("\t %d ",matriz1[l][c]);
				}
				System.out.println("\n");
			}
			
	//GERAR MATRIZ 2 AUTOMATICAMENTE
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					matriz2[l][c] = (int)(Math.random()*range)+min;
				}
			}
			
	//IMPRIMIR MATRIZ 2
			System.out.println("\n\tMATRIZ 2 ("+linhas+" X "+colunas+"):\n");
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					System.out.printf("\t %d",matriz2[l][c]);
				}
				System.out.println("\n");
			}
			
	//MENU USUARIO
			System.out.println("\nEscolha entre uma das opções: \n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda\n3 - Adicionar uma constante as duas matrizes\n"); 
			escolha = entrada.nextInt();
			while(escolha<1 || escolha>3)
			{
				System.out.println("\nOpçào inválida, por favor digite números entre 1 e 3: \n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda\n3 - Adicionar uma constante as duas matrizes\n"); 
				escolha = entrada.nextInt();
			}
			
	//ESCOLHA 1: SOMAR MATRIZES	
			if(escolha==1)
			{
			//SOMAR
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						matrizsoma[l][c] = matriz1[l][c]+matriz2[l][c];
					}
				}
			//IMPRIMIR	
				System.out.println("\n\tMATRIZES SOMADAS ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matrizsoma[l][c]);
					}
					System.out.println("\n");
				}
			}
			
	//ESCOLHA 2: SUBTRAIR M1 da M2
			if(escolha==2)
			{
			//SUBTRAIR
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						matrizsub[l][c] = matriz2[l][c]-matriz1[l][c];
					}
				}
			//IMPRIMIR	
				System.out.println("\n\tSubtração da matriz 1 da matriz 2 ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matrizsub[l][c]);
					}
					System.out.println("\n");
				}
			}
	 
	//ESCOLHA 3: ADICIONAR CONSTANTE AS DUAS MATRIZES
			if(escolha==3)
			{
			//ESCOLHENDO CTE
				System.out.println("\nEscolha uma valor para a constante: ");
				cte = entrada.nextInt();
				
			
			//IMPRIMIR	M1 + CTE
				System.out.println("\n\tMatriz 1 somada com a constante "+cte+" ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matriz1[l][c]+cte);
					}
					System.out.println("\n");
				}
			//IMPRIMIR	M2 + CTE
				System.out.println("\n\tMatriz 2 somada com a constante "+cte+" ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matriz2[l][c]+cte);
					}
					System.out.println("\n");
				}				
			}		
		}
		
//ESCOLHA MANUAL
		else if(preenchimento==2)
		{
	//GERAR MATRIZ 1 MANUALMENTE
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					System.out.println("\nEntre com um valor da matriz 1 para a posição ["+(l+1)+"]["+(c+1)+"]");
					matriz1[l][c] = entrada.nextInt();
				}
			}
			
	//IMPRIMIR MATRIZ
			System.out.println("\n\tMATRIZ 1 ("+linhas+" X "+colunas+"):\n");
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					System.out.printf("\t %d ",matriz1[l][c]);
				}
				System.out.println("\n");
			}
			
	//GERAR MATRIZ 2 MANUALMENTE
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					System.out.println("\nEntre com um valor da matriz 2 para a posição ["+(l+1)+"]["+(c+1)+"]");
					matriz2[l][c] = entrada.nextInt();
				}
			}
			
	//IMPRIMIR MATRIZ 2
			System.out.println("\n\tMATRIZ 2 ("+linhas+" X "+colunas+"):\n");
			for(int l=0;l<linhas;l++)
			{
				for(int c=0;c<colunas;c++)
				{
					System.out.printf("\t %d",matriz2[l][c]);
				}
				System.out.println("\n");
			}
			
	//MENU USUARIO
			System.out.println("\nEscolha entre uma das opções: \n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda\n3 - Adicionar uma constante as duas matrizes\n"); 
			escolha = entrada.nextInt();
			while(escolha<1 || escolha>3)
			{
				System.out.println("\nOpçào inválida, por favor digite números entre 1 e 3: \n1 - Somar as duas matrizes\n2 - Subtrair a primeira matriz da segunda\n3 - Adicionar uma constante as duas matrizes\n"); 
				escolha = entrada.nextInt();
			}
			
	//ESCOLHA 1: SOMAR MATRIZES	
			if(escolha==1)
			{
			//SOMAR
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						matrizsoma[l][c] = matriz1[l][c]+matriz2[l][c];
					}
				}
			//IMPRIMIR	
				System.out.println("\n\tMATRIZES SOMADAS ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matrizsoma[l][c]);
					}
					System.out.println("\n");
				}
			}
			
	//ESCOLHA 2: SUBTRAIR M1 da M2
			if(escolha==2)
			{
			//SUBTRAIR
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						matrizsub[l][c] = matriz2[l][c]-matriz1[l][c];
					}
				}
			//IMPRIMIR	
				System.out.println("\n\tSubtração da matriz 1 da matriz 2 ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matrizsub[l][c]);
					}
					System.out.println("\n");
				}
			}
	 
	//ESCOLHA 3: ADICIONAR CONSTANTE AS DUAS MATRIZES
			if(escolha==3)
			{
			//ESCOLHENDO CTE
				System.out.println("\nEscolha uma valor para a constante: ");
				cte = entrada.nextInt();
				
			
			//IMPRIMIR	M1 + CTE
				System.out.println("\n\tMatriz 1 somada com a constante "+cte+" ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matriz1[l][c]+cte);
					}
					System.out.println("\n");
				}
			//IMPRIMIR	M2 + CTE
				System.out.println("\n\tMatriz 2 somada com a constante "+cte+" ("+linhas+" X "+colunas+"):\n");
				for(int l=0;l<linhas;l++)
				{
					for(int c=0;c<colunas;c++)
					{
						System.out.printf("\t %d",matriz2[l][c]+cte);
					}
					System.out.println("\n");
				}				
			}	
		}
		
		
		
		
	}
}
