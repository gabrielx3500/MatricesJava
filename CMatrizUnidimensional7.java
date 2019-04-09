import java.util.*;
public class CMatrizUnidimensional7{
	public static void main(String[] args){
    //Declaracion de la variable
	//Declaracion de una Matriz
	Scanner entrada = new Scanner(System.in);
	int nElementos = 0;
	System.out.println("Escribe el numero de Elementos de la Matriz");
	nElementos = entrada.nextInt();
	//Declaracion de l aMatriz
	int[] m = new int[nElementos];
	int i = 0;
	System.out.println("Escribe el Elemento de la Matriz");	
	for(i = 0; i < nElementos; i++){
	 System.out.print("m[" + i + "] = ");
	 m[i] = entrada.nextInt();	
	}
	//Visualizamos los elemntos de la Matriz
	System.out.println();
	for(i = 0; i < nElementos; i++){
	System.out.println(m[i] + " ");
	System.out.println("\n\nFin del Proceso");	
	}	
	}
}