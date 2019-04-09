import java.util.*;
public class CMatrizUnidimensional2{
	public static void main(String[] args){
	//Declaracion de variables
	//Declaracion de la matriz
	Scanner entrada = new Scanner(System.in);	
	int nElementos;
	System.out.println("Numero de elementos de la matriz: ");
	nElementos = entrada.nextInt();
    //Declaramos la matriz prueba
    int[] prueba = new int[nElementos];
    //declaracion del subindice
    int i = 0;
    //Introducir los valores
    //de cada uno de los elementos de la matriz
    System.out.println("Introducir los valores de la Matriz: ");
    for(i = 0; i < nElementos; i++ ){
      System.out.print("prueba[" + i + "] = ");
      prueba[i] = entrada.nextInt();

    }
      
	//Visualizar los elementos de la Matriz
	/*
    System.out.println();
    for(i = 0; i< nElementos; i++)
     System.out.print(prueba[i] + "");	
     System.out.println("\n\nFin del Proceso. ");
     */
    System.out.println();
    for(i = 0; i< prueba.length; i++)
     System.out.print(prueba[i] + "");	
     System.out.println("\n\nFin del Proceso. ");
   }
  } 