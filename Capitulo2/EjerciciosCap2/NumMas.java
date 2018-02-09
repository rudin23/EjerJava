/*Decimo programa del libro
  Ejercicio 2.16 capitulo 2
  Programa para verivicar que número es mas grande o si son iguales
  Autor:Rudin Alexander López Salvatierra
  Fecha: 12/02/2014
  Hora: 14:10
*/
import java.util.Scanner; //EL programa utiliza la clase Scanner

public class NumMas
{
   //Inicio del metodo main(principal)
   public static void main(String args[])
   {
      //Crear el objeto Scanner para obtener la entrada de la vantana de comandos
	  Scanner entrada = new Scanner(System.in);
	  
	  int numE1,//El primer número para verificar
	      numE2;//El segundo número para verificar
		  
      System.out.print("\nIntroduzca el primer nu'mero: ");//Indicador
	  numE1 = entrada.nextInt();
	  
	  System.out.print("Introduzca el segundo nu'mero: "); //Indicador
	  numE2 = entrada.nextInt();
	  
	  if(numE1 > numE2)
	     System.out.printf("\n\tEl nu'mero %d es ma's grande\n", numE1);//La primera evaluación con numE1
		 
      if(numE1 < numE2)
	     System.out.printf("\n\tEl nu'mero %d es ma's grande\n", numE2);//La segunda evaluación con numE2
	  
	  if(numE1 == numE2)
	     System.out.print("\n\tLos nu'meros son iguales\n");//La ultima evaluación si son iguales
   }//Fin del método main
}//Fin de la clase NumMas 