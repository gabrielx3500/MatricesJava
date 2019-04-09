import java.util.*;
public class CMatrizUnidimensional9{
	public static void main(String[] args){
	//Declaramos variables y Matriz
	int nElementos = 0;
	System.out.println("Escribe el numero de Elementos de la Matriz");
	nElementos = entrada.nextInt();
	//Declaramos la matriz
	int[] m = new int[nElementos];
	int i = 0;
    System.out.println("Escribe el Elemento de la Matriz");
    for(i = 0; i < nElementos; i++){
     System.out.println("m[" + i + "] = ");	
     m[i] = entrada.nextInt();
    }
    //Visualizar elemntos de l aMatriz
     System.out.println();
     for(i = 0; i < m.lenght; i++)
     System.out.println(m[i] = " ");
     System.out.orintln("\n\nFin del proceso");	
	}
}