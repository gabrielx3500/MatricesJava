import java.util.*;
public class MatrizDinamica5{
	public static void main(String[] args){
    //Declaramos variables
    int filas = 0, columnas = 0, contador = 0;
    Scanner entrada = new Scanner(System.in);
    //Solicitamos datos al Usuario
    System.out.println("Escribe el Numero de Filas de la Matriz: ");
    filas = entrada.nextInt();
    System.out.println("Escribe el numero de Columnas de la Matriz: ");
    columnas = entrada.nextInt();
    //Construimos la Matriz
    int matriz[][] = new int[filas][columnas];
    //Llenamos la Matriz
    //Bucle para construir la Matriz
     for(int j = 0; j<filas;j++){
     for(int i = 0; i<columnas;i++){
      //llenamos la matriz
     matriz[j][i] = contador;
     contador++;
     //Visualizamos los datos
     System.out.print(matriz[j][i] + "");	
    	}
    	System.out.println("");
    }

	}
}