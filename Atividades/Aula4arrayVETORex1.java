package PacoteJava;

import java.util.Scanner;

public class Aula4arrayVETORex1 {
public static void main(String args[])
{
	int [] a = new int [6];
	int i,soma=0;
	Scanner ler = new Scanner(System.in);
	
	for (i=0;i<6;i++)
	{
		System.out.print("Digite um n�mero: ");
		a[i]=ler.nextInt();
	}
	
	soma = a[0]+a[1]+a[5];
	
	for (i=0;i<6;i++)
	{
		System.out.println("\n"+"posi��o "+(i+1)+" = "+a[i]);
	}
	
	System.out.print("A soma dos de posi��o 1,2 e 6 �: "+soma);
	
}
}
