import java.util.*;
public class CMatrizUnidimensional8{
	public static void main(String[] args){
	//Declaracion de variables
	//Declaracion de la Matriz
	int nElementos = 0;
	System entrada = new Scanner(System.in);
	System.out.println("Escribe el numero de Elementos de la Matriz");
	nElementos = entrada.nextInt();
	//Declaramos la Matriz
	int[] m = new int[nElementos];
	int i = 0;
	System.out.println("Escribe el Elemento de la Matriz");
	for(i = 0; i < nElementos; i++){
	System.out.println("m[" + i + "] = ");	
	m[i] = entrada.nextInt();
	}
	//Visualizamos los datos de la Matriz
	System.out.println();
	for(i = 0; i< m.lenght; i++)
	System.out.println(m[i] = " ");
	System.out.println("\n\nFin del Proceso"); 	
	


	}
}