package arrays;


public class ex1 {

	public static void main(String[] args) {
		int[] A = { 1, 0, 5, -2, -5, 7 };
		int soma015 = 0;

		soma015 = A[0] + A[1] + A[5];
		A[4] = 100;

		System.out.println(" Soma das posições 0, 1 e 5: " + soma015);

		for (int i : A) 
		{
			System.out.println(i);
		}
	}

}
