import java.util.*;
public class NumAleatorio2{
	/* 2) Crear una matriz de 5 filas y n columnas (se pide al usuario). 
 Rellenarlo con números aleatorios entre 0 y 10. */
    public static void main(String[] args){
    //Declaracion de variables
    int filas = 0, columnas = 0;
    Scanner entrada = new Scanner(System.in);
    //Pedimos los datos al usuario
    System.out.println("Cuantas Columnas Quieres?: ");
    columnas = entrada.nextInt();
    //Declaramos la Matriz
    int matriz[][] = new int[5][columnas];
    //Bucle paar recorrer la Matriz
    for(int i = 0; i<matriz.length;i++){
    	for(int j  = 0; j<matriz[0].length;j++){
    	 //Rellenamos la Matriz
    	matriz[i][j] = 	generaNumAleatorio(0,10);
    	System.out.print(matriz[i][j] + " ");

    	}
    	System.out.println("");
    }	
    } 

    //Metodo para crear el numero aleatorio entre 1 y 10
    public static int generaNumAleatorio(int minimo, int maximo){
    	return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    }
}
