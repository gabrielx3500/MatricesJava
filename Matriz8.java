public class Matriz8 {
	/* 1) Crear una matriz de 6×6 con los números del 1 al 9. 
    Mostrar por pantalla, tal como aparece en la matriz. */
	public static void main(String[] args){
    //Declaramos la matriz
	int[][] matriz = new int[6][6];	
	//i = filas y j = columnas
	//Inicializamos los indices
	i = 0;
	j = 0;
	for(i = 0; i<matriz.length;i++){//Contabilizamos las filas
		for(j = 0; j<matriz.length;j++){//Contabilizamos las columnas
        System.out.println();
        //Llenamos la matriz
        matriz[i][j] = (i * matriz.length) + (j+1);
        }
	}
	System.out.println("");
	}
}