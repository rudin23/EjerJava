/*Deciomo octavo programa del libro
  Figura 3.3 capitulo 3
  Programa con una clase principal y una clase auxiliar
  Autor: Rudin Alexader López Salvatierra
  Fecha: 13/02/2014
  Hora: 18:00
*/

public class PruebaLibroCalificaciones
{
   
   public static void main(String args[])
   {
      //Crea un objeto LibroCalificaciones y lo asigna a miLibroCalificaciones
	  LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
	  
	  //Llama al método mostrarMensaje de miLibroCalificaciones
	  miLibroCalificaciones.mostrarMensaje();
	  
	  //Llama al método dibujo de miLibroCalificaciones
	  miLibroCalificaciones.dibujo();
   } //Fin del método main
   
} //Fin de la clase PruebaLibroCalificaciones