package Exerciciodif;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		 final int TAM=20;
		 int a[],b[],i;
		 a=new int [TAM];
		 b=new int [TAM];
		 for(i=0; i<TAM; i++) {
				System.out.println("digite o  "+(i+1)+" valor" );

			 a[i]=ler.nextInt();
		 }
		 for(i=0 ; i<TAM; i++ ) {
			if(a[i]%2!=0) {
				b[i]=a[i];
				a[i]=0;
			}
			 
		 }
			System.out.print("o valor  do vetor a= [" );
			for(i=0; i<TAM;i++) {
			System.out.print(" "+a[i] );	
			}
			System.out.println(" ] ");	System.out.print("o valor  do vetor b= [" );
			for(i=0; i<TAM;i++) {
				if(b[i]==0) {
				System.out.print("");
				}else {				
					System.out.print(" "+b[i]+"," );
				}
				}
				System.out.println(" ] ");
		 
		 
		 
	}

}
