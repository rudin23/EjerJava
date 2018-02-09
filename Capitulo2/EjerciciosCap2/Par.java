/*Decimo tercer programa del libro
  Ejercicio 2.25 capitulo 2
  programa para ver si un número es par o impar
  Autor: Rudin Alexander López Salvatierra
  Fecha: 12/02/2014
  Hora: 15:15
*/
import java.util.Scanner; //El programa utiliza la clase Scanner

public class Par
{
   //Inicio del método principal
   public static void main(String args[])
   {
      //Crea un objeto Scanner para obtener la entrada de la ventana de comandos
	  Scanner entrada = new Scanner(System.in);
	  
	  int numE; //Unco numero a evaluar
	  int mod;
	  
	  System.out.print("\nEscriva un numero entero: "); //Indicador
	  numE = entrada.nextInt();
	  
	  mod = numE % 2;
	  
	  if(mod == 0)
	     System.out.println("El nu'mero es par!");
      
	  if(mod != 0)
	     System.out.println("El nu'mero es impar!");
	  
   } //Fin del método main
} //Fin de la clase Par