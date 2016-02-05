import java.util.Scanner;

public class Ej3 {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);
//Suma y Promedio de 10 numeros ingresados
		double num=0, memoria=0;
		int cont=1;
		System.out.println ("Ingrese el primer numero. ");
		do{
			cont++;
			num = lea.nextDouble(); 
			System.out.println ("Ingrese el siguiente numero. ");
			memoria = memoria + num;

		}while (cont<=10);
		System.out.println ("La suma de sus numeros es: "+memoria);
		System.out.println ("El promedio de sus numeros es: "+memoria/10);
	
		//Renan Zelaya
	} 
}