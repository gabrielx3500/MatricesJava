public class CMatrizAsociativa{
	public static void main(String[] args){
	//Frecuencia con la que aparecen las letras de un texto

	int[] c = new int['z'-'a'+1];
	char car;//Sunindice
	final char eof = (char)-1;
	//Entrada de datos y calculo de la tabla de frecuencia
	System.out.println("Introducir un texto");
	System.out.println("Para finalizar presionar [Ctrl][Z]\n");
	try{
	 //Leer el siguiente caracter del texto
	 while ((car = (char)System.in.read()) !=eof)
	 {
	 	if(car >= 'a' && car <= 'z')
	 	 c[car - 'a']++;	
	 }	
	}
	catch(IOException ignorada){}
	//Mostrar la tabla de frecuencia
	System.out.println("\n");
	//Visualizar la cabecera "a b c..."
    for(car = 'a'; car <= 'z'; car++)
    	System.out.println("\n-----------------------------------------" + 
    		"-------------------------------------------------------------");
    //Visualizar la frecuencia con la que han aaprecido os caracteres
    for(car = 'a'; car<= 'z'; car++)
    	System.out.println("" + c[car - 'a']);
	}
}