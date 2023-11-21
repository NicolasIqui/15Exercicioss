package Exerciciodif;

public class Exercicio6 {
	public static void main(String[] args) {
		final int TAM=11;
		int a[],b=2,b1=1,i;
		a=new int[TAM];
		for(i=0; i<TAM; i++) {
		b1=b*b1;
		a[i]=b1;
		}
		a[0]=1;
		System.out.print("o valor  do vetor a= [" );
		for(i=0; i<TAM;i++) {
		System.out.print(" "+a[i] );	
		}
		System.out.println(" ] ");

	}

}
