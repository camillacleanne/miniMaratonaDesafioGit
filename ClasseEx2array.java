package PacoteJAVAexerciciosVetores;
 import java.util.Scanner;
public class ClasseEx2array {
	 public static void main(String[] args) {
		
		 int vetor [] = new int[6], somapar=0,quantimpar=0;
		 Scanner ler = new Scanner(System.in);
		 
		 
		 for (int x=0; x<6; x++) {
			 System.out.println("\nDigite um valor: ");
			 vetor[x]= ler.nextInt();
			 if(vetor[x]%2==0) {
				 System.out.println(" Valor par: " +vetor[x]);
				 somapar = somapar+vetor[x];
				 
			 }else {
				 System.out.println(" Valor ímpar: " +vetor[x]);
				 quantimpar++;
			 }
			 
		 }
		 System.out.println("Soma de núemros pares: "+somapar);
		 System.out.println("Quantidade de ímpares: "+ quantimpar);
	 }	
	 
}
