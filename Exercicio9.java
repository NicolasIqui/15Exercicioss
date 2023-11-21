package Exerciciodif;
import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {
		

	Scanner ler=new Scanner(System.in);
	final int TAM=10;
	int a[],b[],c[],i;
	a=new int[TAM];
	b=new int [TAM];
	c=new int [TAM];
	for(i=0; i<TAM; i++) {
		System.out.println("digite o  "+(i+1)+" valor" );
		a[i] = ler.nextInt();
	}
	for(i=0; i<TAM; i++) {
		System.out.println("digite o  "+(i+1)+" valor" );
		b[i] = ler.nextInt();
	}
	for(i=0; i<TAM; i++) {
		if(a[i]==b[i]) {
			c[i]=a[i];
		}else {
			c[i]=0;
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
	System.out.print("o valor  do vetor c= [" );
	for(i=0; i<TAM;i++) {
	System.out.print(" "+c[i] );		
}
	System.out.println("]");
	
	
	}
}
