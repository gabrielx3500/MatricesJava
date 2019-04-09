public class Matriz3{
	/* 1) Crear una matriz de 6×6 con los números del 1 al 36. 
    Mostrar por pantalla, tal como aparece en la matriz. */
	public static void main(String[] args){
    //Creamos la matriz 6x6
	int matriz[][] = new int[6][6];
	//Recorremos los elementos de las filas y columnas
	for(int i = 0; i<matriz.length;i++){
	 for(int j = 0; j<matriz.length;j++){
	 	//Llenamos la matriz
	 	matriz[i][j] = (i*matriz.length)+(j+1);
	 	System.out.print(matriz[i][j] + " ");
	 }	
	 System.out.println();
	}	
  }
}