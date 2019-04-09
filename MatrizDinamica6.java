import java.util.*;
public class MatrizDinamica6{
	public static void main(String[] args){
	//Declaramos variables
	int filas = 0, columnas = 0, contador = 0;
	Scanner entrada = new Scanner(System.in);
	//Solicitamos datos al usuario
	System.out.println("Escribe el numero de Filas: ");
	filas = entrada.nextInt();
	System.out.println("Escribe el numero de Columnas: ");
	columnas = entrada.nextInt();
	//Creamos la Matriz
	int matriz[][] = new int[filas][columnas];
	//Declaramos los subindices
	int j = 0;
	int i = 0;
	for(j = 0; j<filas;j++){
		for(i = 0; i<columnas; i++){
		//Llenamos la Matriz
		matriz[j][i] = contador;
		contador++;
		//Visualizamos los datos
		System.out.print(matriz[j][i] + "");	
		}
		System.out.println("");
	}



	}

}