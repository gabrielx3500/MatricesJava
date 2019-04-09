
import java.util.*;
public class CMatrizUnidimensional3{
	public static void main(String[] args){
    //Declaracion de varaibles
	//Declaracion de la Matriz
	Scanner entrada = new Scanner(System.in);
	int nElementos;
	System.out.println("Introduzca el numero de elementos de la matriz");
	nElementos = entrada.nextInt();
	//Declaracion de la Matriz chocolate
	int[] chocolate = new int[nElementos];
	//Declaramos el indice
	int i = 0;
	//Introducir los valores
    //de cada uno de los elementos de la matriz
	System.out.println("Introduzca los valores de la Matriz: ");
	for(i=0; i<nElementos; i++){
	 System.out.println("chocolate[" + i + "]");
	 chocolate[i] = entrada.nextInt();	
	}
	//Visualizamos los resultados
	System.out.println();
	for(i = 0; i<chocolate.length; i++)
	 System.out.print(chocolate[i] + "");
	 System.out.print("\n\nFin del proceso");	




	}
}