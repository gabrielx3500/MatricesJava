import java.util.*;
public class CMatrizUnidimensional5{
	public static void main(String[] args){
    //Matriz de Notas inicialmente vacia
	ArrayList<Float> notas = new ArrayList<Float>();	
	//Entradda de datos
	int i = 0; //Inicializamos el indice a 0
	System.out.println("Introducir las notas medias: ");
	System.out.printf("Estudiante %3d, nota media:", ++i);
	float nota = Leer.datoFloat();
	while (nota != -1)
	 {
	 	notas.add(nota); //Agregar un elemento
	 	System.out.printf("Estudiante %3d, nota media:", ++i);
	 	nota = Leer.datoFloat();
	 }	
	 //Sumar las notas
	 int nalumnos = notas.size();//Numero de estudiantes
	 float suma = 0; //Suma total de todas las notas medias
	 for(i=0; i<nalumnos; i++)
	  suma += notas.get(i);

	 //Escribir los resultados
	 System.out.printf("\n\nNota media del curso: %5.2f\n", suma / nalumnos); 


	}
}