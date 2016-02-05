import java.util.Scanner;

public class Ej7 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);
//Factorial numero ingresado
		System.out.println ("Ingrese un numero");
		double num=lea.nextInt();
		double cont=1;
		double conta=1;
		while (cont<num){
			cont++;
			conta=conta*cont;
			
		}

		System.out.println (conta);

	
		//Renan Zelaya
	} 
}