import java.util.*;
public class MatrizDinamica3{
	public static void main(String[] args){
	//Declaramos variables
	int filas = 0, columnas = 0, contador = 0;
	Scanner entrada = new Scanner(System.in);
	//Solicitamos las dimensiones de la Matria al Usuario
	System.out.println("Escriba el numero de filas de la Matriz: ");
	filas = entrada.nextInt();
	System.out.println("Escriba el numero de columnas de la Matriz: ");
	columnas = entrada.nextInt();
	//Declaramos la Matriz
	int matriz[][] = new int[filas][columnas];
	//Bucle para constrauir la Matriz
	//Inicializamos los subindices
	//j = filas, i = columnas
	int j = 0;
	int i = 0;
	//Bucle for para construir Matrices
	for(j = 0; j < filas; j++){
      for(i = 0; i < columnas; i++){
        matriz[j][i] = contador;
        contador++;
        System.out.print(matriz[j][i] + " ");
      }
      System.out.println("");
	}


	}
}