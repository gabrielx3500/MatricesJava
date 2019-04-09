import java.util.*;
public class Matriz6{
	public static void main(String[] args){
		//Declaracion de una matriz
		//Declaracion de variables
		Scanner entrada = new Scanner (System.in);
		int nElementos;
		System.out.println("Introduce las dimensiones de la matriz: ");
		nElementos = entrada.nextInt();
		//Declaramos el subindice
		int i = 0;
		//Construimos la matriz
		int lista[] = new int[nElementos];
		//Llenamos los elementos de la lista
		System.out.println("Introduce laos elementos de la matriz: ");
		for(i = 0; i<nElementos; i++){
		  System.out.print("m[" + i + "] = ");
		  lista[i] = entrada.nextInt();
		}
		

	    //Mostramos datos por pantalla
	    System.out.println();
	   for(i = 0; i < nElementos; i++)
	   System.out.printf("lista[" + i + "] = " + lista[i] + " ");
	   System.out.println("\n\nFin del Proceso. ");
	  

	}
}