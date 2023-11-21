package Exerciciodif;
import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		 final int TAM=5;
		 int a[],b[],soma,i;
		 a=new int [TAM];
		 b=new int [TAM];
		 for(i=0; i<TAM; i++) {
				System.out.println("digite o  "+(i+1)+" valor" );

			 a[i]=ler.nextInt();
		 }
		 for(i=0;i<TAM;i++) {
			 soma=i;
			 for(;soma<TAM; soma++) {
				 b[i]=b[i]+a[i];
			 }
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
			
			 
		 }
	}
	
