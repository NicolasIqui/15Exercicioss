package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, j;
		a = new int[TAM];
		for (i = 0; i < TAM; i++) {
			System.out.print("digite o  " + (i + 1) + "� valor");
			a[i] = ler.nextInt();
		}
		System.out.print("o valor  do vetor a= [");
		for (i = 0; i < TAM; i++) {
			System.out.print(" " + a[i]);

		}
		System.out.println("]");
		for (i = 0; i < TAM; i++) {
			System.out.println(" o valor do vetor " + (i + 1) + " em rela��o ao seus pares");
			for (j = 0; j <= a[i] && a[i] % 2 == 0; j++) {
				if (j % 2 == 0) {
					System.out.print(" " + j);

				}
			}

		}
	}

}
