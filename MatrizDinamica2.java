import java.util.*;
public class MatrizDinamica2{
	public static void main(String[] args){
    //Declaracion de las variables
	int filas = 0, columnas = 0, contador = 0;
	Scanner entrada =  new Scanner(System.in);
	//Pedimos los datos por pantalla
	System.out.println("Cuantas Filas desea: ");
	filas = entrada.nextInt();
	System.out.println("Cuantas Columnas desea: ");
	columnas = entrada.nextInt();
	//Declaramos la Matriz dinamica
	int matriz[][] = new int[filas][columnas];
	//Bucle for para construir Matrices
	int i = 0; //Subindice de columnas
	int j = 0; //Subindice de filas
	//Bucle for para construir Matrices
		for(j = 0; j < filas; j++){
          for(i = 0; i < columnas; i++){
             matriz[j][i] = contador;
             contador++;
             System.out.print(matriz[j][i]+" ");

		}
		System.out.println("");
	}

	}
}