import java.util.*;
public class CMatrizUnidimensional6{
	public static void main(String[] args){
	//Declaracion de una matriz unidimensional
	//Declaracion de variables
	Scanner entrada = new Scanner(System.in);
	int nElementos;
	System.out.println("Numero de elementos de la Matriz");
	nElementos = entrada.nextInt();
	//Declaracion  de la Matriz m
	int[] m = new int[nElementos];
	int i = 0; //Subindice
	System.out.println("Introducir valores de la Matriz:");	
	for( i = 0; i < nElementos; i++){
      System.out.println("m[" + i + "] = ");
      m[i] = entrada.nextInt();
	}
	 //Visualizar los elementos de la Matriz
	 System.out.println();
	 for(i = 0; i < nElementos; i++)
	 	System.out.println(m[i] + " ");
	    System.out.println("\n\nFin del Proceso");


	}
	
}