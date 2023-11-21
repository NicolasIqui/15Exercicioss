package Exercicios15;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		final int TAM=5;
		int a[],n,i,j;
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
	
	for(i=0; i<TAM; i++) {
		for(j=2; j<=a[i] && a[i] % j !=0; j++) {
			
			
		}
		if(j>a[i]/2){
		System.out.println("o numero  "+a[i]+" e  primo");
		   } else {
               System.out.println("O número  " + a[i] + " não	 é primo.");
           }
       }
   }
}
		
	

		
				

	

