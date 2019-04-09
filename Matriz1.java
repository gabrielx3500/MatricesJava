public class Matriz1{
	 /* 1) Crear una matriz de 3×3 con los números del 1 al 9. 
    Mostrar por pantalla, tal como aparece en la matriz. */
	public static void main(String[] args){
		//Declaracion de la Matriz 3x3
		int matriz[][] = new int[3][3];
        //i = filas y j = columnas
        for(int i=0;i<matriz.length;i++){//Contabilizando las filas
        	for(int j=0;j<matriz.length;j++){//Contabilizando las columnas
            //Llenando los elementos de la Matriz
        	matriz[i][j] = (i*matriz.length)+(j+1);
        	System.out.print(matriz[i][j] + "  ");	

        	}
        	System.out.println("");
        }
	}
}