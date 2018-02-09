/*Septimo programa del libor
  Auto evaluación capitulo 1
  programa para calcular e imprimir el producto de tres numero enteros
  Autor: Rudin Alexander López Salvatierra
  Fecha: 12/02/2014
  Hora: 9:50
*/
import java.util.Scanner; //el programa utiliza la clase Scanner

public class Producto
{
   //el método main empieza la ejecuación de la aplicación
   public static void main (String args[])
   {
      //Crea un objeto Scanner para obtener la entrada de la ventano de comandos
	  Scanner entrada = new Scanner(System.in);
	  
	  int x, //Primer número a multiplicar
	      y, //Segundo número a multiplicar
		  z, //Tercer número a multiplicar
		  resultado; //Multiplicación de x,y,z
      
	  System.out.print("Escriba el primer nu'mero"); //indicador
	  x = entrada.nextInt(); //Lee el primer número del usuario
	  
	  System.out.print("Escriba el segundo nu'mero"); //indicador
	  y = entrada.nextInt(); // Lee el segundo número del usuario
	  
	  System.out.print("Escriba el tercer nu'mero");// indicador
	  z = entrada.nextInt(); //Lee el tercer número del usuario
	  
	  resultado = x*y*z; //multiplica los números
	  
	  System.out.printf("El resultado es %d\n", resultado);// Imprime el resultado 
	  
	  
   }//Fin de la método main
}  //Fin de la clase Producto