package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int ano,mes,dia,dias;
		System.out.println("Entre com o ano: ");
		ano = ler.nextInt();
		System.out.println("Entre com o mês: ");
		mes = ler.nextInt();
		System.out.println("Entre com o dia: ");
		dia = ler.nextInt();
		dias = ano*365 + mes*30 + dia;
		System.out.print("O número de dias é: "+ dias+".");
		
		
		
	}
}
