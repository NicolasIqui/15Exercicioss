		package Exercicios15;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		final int TAM=5;
		int i;
		long a[],b[],fator=0;
		a=new long[TAM];
		b=new long[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("digite o  "+(i+1)+" valor" );
			a[i]=ler.nextInt();	
		}
		for(i=0; i<TAM; i++) {
			
			b[i]=a[i]; 
			for(fator=b[i]-1; fator>1; fator--)
			b[i]=fator*b[i];	
			fator--;
		}
			System.out.print("o valor  do vetor a= [" );
			for(i=0; i<TAM;i++) {
			System.out.print(" "+a[i] );	
			}
			System.out.println(" ] ");
			System.out.print("o valor  do vetor b= [" );
			for(i=0; i<TAM;i++) {
			System.out.print(" "+b[i] );	
			}
			System.out.println(" ] ");
			ler.close();
			}
	}

