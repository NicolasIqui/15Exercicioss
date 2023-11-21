package Exercicios;
	import java.util.Scanner;
	public class Exercicio5 {
	 public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
			final int TAM=10;
			int a[],i,j;
			a=new int[TAM];
	for(i=0; i<TAM; i++) {
		System.out.print("digite o  " +(i+1)+"º valor" );
		a[i]=ler.nextInt();					
			}
			System.out.print("o valor  do vetor a= [" );
			for(i=0; i<TAM;i++) {
				System.out.print(" "+a[i] );			

		}
			System.out.println("]");
			for(i=0;  i<TAM   ; i++){
				System.out.println(" o valor do vetor " +(i+1)+ " em relação ao seus divisores " );
	            for (j=1;   j<a[i]; j++) {
					if(a[i]%j==0) {
						System.out.print(" "+j );	
					
					}
			}
					
				}
				}
					
					}
					
				
	
					
					