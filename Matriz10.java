public class Matriz10{
	/* 1) Crear una matriz de 7×7 con los números del 1 al 64. 
    Mostrar por pantalla, tal como aparece en la matriz. */
	public static void main(String[] args){
	//Declara la matriz 
	int matriz[][] = new int[8][8];
	//Declaramos los indices
	//i = Filas j]= Columnas
	int i = 0;
	int j = 0;	
    for(i = 0; i<matriz.length;i++){
    	for(j = 0; j<matriz.length;j++){
    	//Llenamos los elementos de la matriz
    	matriz[i][j] = (i*matriz.length) + (j+1);
    	System.out.println(matriz[i][j] + " ");	
    		
    	}
    	System.out.println("");
    }

	
	}
}