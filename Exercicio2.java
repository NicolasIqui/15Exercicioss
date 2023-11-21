package Exercicios15;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		final int TAM=5;
		int i,a[],t;
		a=new int[TAM];

		for(i=0; i<TAM; i++) {
			System.out.println("digite o  "+(i+1)+" valor" );
			a[i]=ler.nextInt();
			
		}
		System.out.print("o valor do vetor A=[");
		for(i=0; i<TAM; i++) {
			System.out.print(" "+a[i] );			
			
		}
		System.out.println("]");
		System.out.println("primeiro numero");
		for(i=0; i<10; i++) {
			t=a[0]*(i+1);
			System.out.println(a[0]+"x"+(i+1)+"="+t);
	}
		System.out.println("segundo numero");

		for(i=0; i<10; i++) {
			t=a[1]*(i+1);
			System.out.println(a[1]+"x"+(i+1)+"="+t);
		}
		System.out.println("terceiro numero");

		for(i=0; i<10; i++) {
			t=a[2]*(i+1);
			System.out.println(a[2]+"x"+(i+1)+"="+t);
		}
		System.out.println("quarto numero");

		for(i=0; i<10; i++) {
			
			t=a[3]*(i+1);
			System.out.println(a[3]+"x"+(i+1)+"="+t);
		}
		System.out.println("quinto numero");

		for(i=0; i<10; i++) {
			t=a[4]*(i+1);
			System.out.println(a[4]+"x"+(i+1)+"="+t);
			
		
		
		

	}
	}
}


