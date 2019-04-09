import java.util.*;
public class Ejercicio5{
		/* Crear dos matrices de nxn y sumar sus valores, 
    los resultados se deben almacenar en otra matriz. 
    Los valores y la longitud, seran insertados por el usuario. 
    Mostrar las matrices originales y el resultado.*/
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int tamanio = 0;
    //Solicitamos datos al usuario
    System.out.println("Escribe la dimension de las Matrices: ");
    tamanio = entrada.nextInt();
    //Declaramos las matrices
    int matriz1[][] = new int[tamanio][tamanio];
    int matriz2[][] = new int[tamanio][tamanio];
    int resultado[][] = new int[tamanio][tamanio];
    //Bucle para recoorer las matrices
    for(int i = 0; i<matriz1;i++){
    	for(int j = 0; j<matriz1;j++){
    		 System.out.println("Escribe la fila : " + i + " y la columna" + j + "de la Matriz 1");
             matriz1[i][j] = entrada.nextInt();
             System.out.println("Escribe la fila : " + i + " y la columna" + j + "de la Matriz 2");
             matriz2[i][j] = entrada.nextInt();
             //Sumamos las matrices
             resultado[i][j] = matriz1[i][j] +   matriz2[i][j];

    	}
    }
    //Visualizamos las Matrices
    System.out.println("Matriz 1");
    muestraMatriz(matriz1);

    System.out.println("Matriz 2");
    muestraMatriz(matriz2);

    System.out.println("Resultado");
    muestraMatriz(resultado);


    }
    //Metodo paar Visualizar la matriz
    public static void muestraMatriz(int[][] matriz){
    	for(int i = 0; i<matriz.length; i++){
    		for(int j = 0; j<matriz.length; j++){
    			System.out.print(matriz[i][j] + "");
    		}
    		System.out.println("");
    	}
    }
}