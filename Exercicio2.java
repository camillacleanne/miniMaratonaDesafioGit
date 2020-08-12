package PacoteJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		int td,dia,mes,ano;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com sua idade em dias:");
		td = ler.nextInt();
		ano = td/365;
		mes = (td%365)/30;
		dia = (td%365)%30;
		System.out.println("Eu tenho: "+ano+" ano(s) e "+mes+" mês(es) e "+dia+" dias de vida !");
		
		
		
		
	}

}
