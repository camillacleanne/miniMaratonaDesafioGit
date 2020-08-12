package LaçosArrays;

import java.util.Scanner;

public class Ex1Array {
	
	public static void main (String args[]) {
		
		int i,soma=0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros inteiros");
		
		
		int [] A = new int[6];
		
		for (i=0;i<A.length;i++) {
			A[i]= sc.nextInt();
			
		}
		
		soma =soma + A[0]+A[1]+A[5];
		
		System.out.println(" A soma dos valores dos indices  A[0]+A[1]+A[5] é: " + soma);
		
		A[4] =100;
		
		System.out.println("O valor do indice 4 foi alterado para  " + A[4] );
		
		System.out.println("todos valor de A");
		 for(i=0; i<A.length;i++) {
			 
			 System.out.println(A[i]);
			 
		
		 }	 
		
		
	}
	
		
		
		
	}
	

