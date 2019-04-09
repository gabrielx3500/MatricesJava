import java.util.*;
public class Ejercicio3{
	/* Crear dos matrices de nxn y sumar sus valores, 
    los resultados se deben almacenar en otra matriz. 
    Los valores y la longitud, seran insertados por el usuario. 
    Mostrar las matrices originales y el resultado.*/
	public static void main(String[] args){
    //Declaramos las variables y las matrices
	Scanner entrada = new Scanner(System.in);
	int tamanio = 0;
	//Solicitamos los datos al Usuario
	System.out.println("Escribe la dimension de la Matriz: ");
	tamanio = entrada.nextInt();
	//Declaramos la matriz 1
	int matriz1[][] = new int[tamanio][tamanio];
	//Declaramos la Matriz 2
	int matriz2[][] = new int[tamanio][tamanio];
	//Declaramos la Matriz Resultado
	int resultado[][] = new int[tamanio][tamanio];

	//Construimos el bucle
	for(int i = 0; i<matriz1.length; i++){
		for(int j = 0; j<matriz1.length;j++){
			//Solicitamos valores para i
		System.out.println("Escribe el valor para la fila " + i + "y la columnas" + j + " de la Matriz1");
	    matriz1[i][j] = entrada.nextInt();
        System.out.println("Escribe el valor para la fila " + i + "y la columnas" + j + " de la Matriz2");
	    matriz2[i][j] = entrada.nextInt();
	    //Guardamos los resultados en la matriz Resultado
	    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
		}
	}	

	//Mostramos las matrices
    System.out.println("Matriz 1");
    muestraMatriz(matriz1);

    System.out.println("Matriz 2");
    muestraMatriz(matriz2);

    System.out.println("Resultado");
    muestraMatriz(resultado);
	}
	public static void muestraMatriz(int[][] matriz){
		for(int i = 0; i<matriz.length;i++){
			for(int j = 0; j<matriz.length;j++){
				System.out.print(matriz[i][j] + "");
			}
			System.out.println("");
		}
	}
}