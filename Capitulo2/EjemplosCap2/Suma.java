/*Quinto programa del libro
  Figura 2.7 Suma.java
  Programa que muestra la suma de dos enteros
  Autor: Rudin Alexander López Salvatierra
  Fecha: 11/02/2014
  Hora: 13:00
*/
import java.util.Scanner;//el programa usa la clase Scanner

public class Suma
{
   //El método main empieza la ejecución de la aplicación en Java
   public static void main(String args[])
   {
      //crea el objeto Scanner para obtener la entrada de la ventana de comandos
	  Scanner entrada = new Scanner(System.in);
	  
	  int numE1,
		  numE2,
		  suma;
	  
	  System.out.print("\nEscriba el primer nu'mero entero: "); //indicador
	  numE1 = entrada.nextInt(); //Lee el primer número del usuario
	  
	  System.out.print("Escriba el segundo nu'mero entero: "); //indicador
	  numE2 = entrada.nextInt(); //Lee el segundo número del usuardio
	  
	  suma = numE1 + numE2; //suma los enteros
	  
	  System.out.printf("\t\t\tLa suma es %d\n", suma); //Muestra la suma
   }//Fin del método main
}//Fin de la clase Suma