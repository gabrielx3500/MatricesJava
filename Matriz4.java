public class Matriz4{
	/* 1) Crear una matriz de 12×12 con los números del 1 al 144. 
    Mostrar por pantalla, tal como aparece en la matriz. */
	public static void main(String[] args){
    //Creamos la matriz 6x6
	int matriz[][] = new int[12][12];
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