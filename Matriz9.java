public class Matriz9{
	/* 1) Crear una matriz de 7×7 con los números del 1 al 49. 
    Mostrar por pantalla, tal como aparece en la matriz. */
	public static void main(String[] args){
	//Declara la matriz
	int[][] matriz = new int[7][7];
	//Declaramos los indices
	//i = Filas j = Columnas
	int i = 0;
	int j = 0;
	for(i = 0; i<matriz.length;i++){//Contabilizamos Filas
		for(j = 0; j<matriz.length;j++){//Contabilizamos Columnas
          //Llenamos la Matriz
		 matriz[i][j] = (i*matriz.length) + (j+1);
		 System.out.println(matriz[i][j] + " ");	
		}
	}
	System.out.println("");
 }   
}
