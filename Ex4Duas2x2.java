package arrays;
import java.util.Scanner;

public class Ex4Duas2x2 {
	
	public static Scanner s = new Scanner(System.in);
	public static double product;
	public final static int length = 2;

	public static void main(String[] args) {
		/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes
		(2) subtrair a primeira matriz da segunda
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
		da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/
		double m1[][] = new double [length][length];
		double m2[][] = new double [length][length];
		int C;
		int opcao;
		System.out.println("Entre com a matriz 1 ");
		
		for(int i=0;i<length;i++) {
			leVetorDouble(m1[i],length);
		}
		
		System.out.println("Entre com a matriz 2 ");
		
		for(int i=0;i<length;i++) {
			leVetorDouble(m2[i],length);
		}
		System.out.println("Opções: \n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
		System.out.println("Para sair digite outro número");
		opcao = s.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("\tm1 + m2: ");
			System.out.println();
			for(int i=0;i<length;i++) {
				printaSoma(m1[i],m2[i],length);
			}
			break;
		case 2:
			System.out.println("\tm2 - m1: ");
			System.out.println();
			for(int i=0;i<length;i++) {
				printaMenos(m2[i],m1[i],length);
			}
			break;
		case 3:
			System.out.print("Digite a constante: ");
			System.out.println();
			C = s.nextInt();
			System.out.println("\tm1 + "+C+": ");
			System.out.println();
			for(int i=0;i<length;i++) {
				printaConstante(m1[i],length,C);
			}
			System.out.println();
			System.out.println("\tm2 + "+C+": ");
			System.out.println();
			for(int i=0;i<length;i++) {
				printaConstante(m2[i],length,C);
			}
			break;
		case 4:
			System.out.println("\tm1: ");
			System.out.println();
			for(int i=0;i<length;i++) {
				printaVetor(m1[i],length);
			}
			System.out.println();
			System.out.println("\tm2: ");
			System.out.println();
			for(int i=0;i<length;i++) {
				printaVetor(m2[i],length);
			}
			break;
		default:
			System.out.println("\nEncerrando programa...");
			break;
		}
		
	}
	
	public static void leVetorDouble(double vetor[], int comprimento) {
		for(int i=0;i<comprimento;i++)
			vetor[i] = s.nextDouble();
	}
	
	public static void printaSoma(double vet1[], double vet2[], int n){
		System.out.printf("|\t");
		for(int i=0;i<n;i++){
			product = (vet1[i]+vet2[i]);
			System.out.printf("%.2f\t",product);
		}
		System.out.printf("|\n");
	}
	
	public static void printaMenos(double vet1[], double vet2[], int n){
		System.out.printf("|\t");
		for(int i=0;i<n;i++){
			product = (vet1[i]-vet2[i]);
			System.out.printf("%.2f\t",product);
		}
		System.out.printf("|\n");
	}
	
	public static void printaConstante(double vet[], int n, int C){
		System.out.printf("|\t");
		for(int i=0;i<n;i++){
			System.out.printf("%.2f\t",(vet[i]+C));
		}
		System.out.printf("|\n");
	}
	
	public static void printaVetor(double vet[], int n){
		System.out.printf("|\t");
		for(int i=0;i<n;i++){
			System.out.printf("%.2f\t",vet[i]);
		}
		System.out.printf("|\n");
	}

}
