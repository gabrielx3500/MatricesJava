public class Matriz11{
	/* 1) Crear una matriz de 7×7 con los números del 1 al 64. 
    Mostrar por pantalla, tal como aparece en la matriz. */
    public static void main(String[] args){
    //Declaramos la Matriz
    int matriz[][]	= new int[9][9];
    //Declaramos los indices
    int i = 0;
    int j = 0;
    //Recorremos las matrices y columnas
    for(i = 0; i<matriz.length;i++){
      for(j = 0; j<matriz.length;j++){
      	//Llenamos la matriz
       matriz[i][j] = (i*matriz.length)+(j+1);
       System.out.println(matriz[i][j] + "");
      }
      System.out.println("");
    
    }
    
    }
}