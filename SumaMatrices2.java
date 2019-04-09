import java.util.*;
public class SumaMatrices2{
	/* Crear dos matrices de nxn y sumar sus valores, 
    los resultados se deben almacenar en otra matriz. 
    Los valores y la longitud, seran insertados por el usuario. 
    Mostrar las matrices originales y el resultado.*/
	public static void main(String[] args){
	//Declaramos varaibles y Matrices
	int dimension = 0; //Esta es la dimension de cada una de las matrices
	Scanner entrada = new Scanner(System.in);
	//Pedimos datos al usuario
	System.out.println("Dimension de la Matriz");
	dimension = entrada.nextInt();
	//Declaramos la Matriz A
    int matriz1[][] = new int[dimension][dimension];
	//Declaramos la Matriz B
    int matriz2[][] = new int[dimension][dimension];
	//Declaramos la Matriz Resultado de la suma A + B	
    int resultado[][] = new int[dimension][dimension];
    //Bucle para recorrer la Matriz
    for(int i = 0; i<matriz1.length;i++){
      for(int j = 0; j<matriz1.length;j++){
      	//Solicitamos al Usuario que introduzca 
        //el tamaño de la Matriz 1
        System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1");
        matriz1[i][j] = entrada.nextInt();
        //Solicitamos al Usuario que introduzca 
        //el tamaño de la Matriz 2
        System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2");
        matriz2[i][j] = entrada.nextInt();
        //Matriz resultado
        resultado[i][j] = matriz1[i][j] + matriz2[i][j];

      }	
    }//Cerramos los bucles For
    System.out.println("Matriz1");
    muestraMatriz(matriz1);
    System.out.println("Matriz 2");
    muestraMatriz(matriz2);
    System.out.println("Resultado");
    muestraMatriz(resultado);

	}

     public static void muestraMatriz(int[][] matriz){
     	for(int i = 0; i<matriz.length;i++){
     	 for(int j = 0; j<matriz.length;j++){
           System.out.print(matriz[i][j] + " ");
     	 }	
     	 System.out.println("");
     	}
     }  


	
}