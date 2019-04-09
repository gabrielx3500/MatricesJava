import java.util.*;

public class CMatrizUnidimensional4{
	public static void main(String[] args){
    //Declaracion de variables
	//Declaracion de la matriz prueba2
	int nElementos;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Introducir el numero de elementos de la Matriz: ");
	nElementos = entrada.nextInt();
	//Declaramos la matriz
	int[] prueba2 = new int[nElementos];
	int i = 0;//Declaracion de indice
    //Introducimos los elementos de la Matriz
    System.out.println("Introducir el elemento de la Matriz: ");
    for(i=0;i<nElementos;i++)
     {
      System.out.println("prueba2[" + i + "] = ");
      prueba2[i] = entrada.nextInt();

     }	
     //Visualizamos los resultados
     System.out.println();
     for(i=0; i<prueba2.length;i++)
     	System.out.print(prueba2[i] + "");
        System.out.print("\n\nFin del proceso");


	}
}