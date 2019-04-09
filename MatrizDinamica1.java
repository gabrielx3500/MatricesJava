import java.util.*;
public class MatrizDinamica1{
	
	public static void main(String[] args)
	{
		//Declaracion de variables
		int filas = 0, columnas = 0, contador = 0;
		Scanner entrada = new Scanner(System.in);

		//Pedimos datos por pantalla
		System.out.println("Cuantas Filas desea?");
		filas = entrada.nextInt();
		System.out.println("Cuantas Columnas desea?");
		columnas = entrada.nextInt();

		//Declaramos la matriz dinamica
		int numeros[][] = new int[filas][columnas];

		//Bucle for para construir Matrices
		for(int i = 0; i < filas; i++){
          for(int j = 0; j < columnas; j++){
             numeros[i][j] = contador;
             contador++;
             System.out.print(numeros[i][j]+" ");
          }
          System.out.print("");
      }
	}

}