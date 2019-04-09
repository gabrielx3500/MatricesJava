import java.util.*;
public class Ejercicio4{
	/* Crear dos matrices de nxn y sumar sus valores, 
    los resultados se deben almacenar en otra matriz. 
    Los valores y la longitud, seran insertados por el usuario. 
    Mostrar las matrices originales y el resultado.*/
	public static void main(String[] args){
    //Declaramos variables
	int tamanio = 0;
	Scanner entrada = new Scanner(System.in);
	//Solicitamos datos al usuario
	System.out.println("Escribe las dimensiones de las Matrices: ");
	tamanio = entrada.nextInt();
	//Declaramos la Matriz 1
	int matriz1[][] = new int[tamanio][tamanio];
	//Declaramos la Matriz 2
	int matriz2[][] = new int[tamanio][tamanio];
	//Declaramos la Matriz Resultado
	int resultado[][] = new int[tamanio][tamanio];
	//Creamos el bucle paar recorrer las matrices
    for(int i = 0; i<matriz1.length; i++){
    	for(int j = 0; j<matriz1.length; j++){
    	System.out.println("Escribe los valores de la fila: " + i + "y la columna" + j + "de la Matriz 1");
	    matriz1[i][j] = entrada.nextInt();	
	    System.out.println("Escribe los valores de la fila: " + i + "y la columna" + j + "de la Matriz 2");
	    matriz2[i][j] = entrada.nextInt();
	    //Guardamos los resultados en la Matriz Resultado
	    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
    	}
    }

	//Visualizamos las matrices
    System.out.println("Matriz 1");
    muestraMatriz(matriz1);

     System.out.println("Matriz 2");
    muestraMatriz(matriz2);

     System.out.println("Resultado");
    muestraMatriz(resultado);

	}

	//metodo para mostrar los valores de las matrices
	public statict void muestraMatriz(int[][] matriz){
		for(int i = 0; i<matriz.length; i++){
			for(int j = 0; j<matriz.length;j++){
				System.out.print(matriz[i][j] + "");
			}
			System.out.println("");
		}
	}
	

}