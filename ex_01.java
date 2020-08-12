package vetor_matriz;

/*1- Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
public class ex_01 {
	public static void main(String[] args) {
		int a=0;
		int vetor[] = {1, 0, 5, -2, -5, 7};
		
		a = vetor[0] + vetor[1] + vetor[5];
		vetor[4] = 100;
		
		
		System.out.println("Soma das 3 posiçoes é: " + a);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("vetor "+i+"  "+vetor[i]);
		}
	}
}
