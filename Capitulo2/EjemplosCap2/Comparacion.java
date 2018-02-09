/*Sexto programa del libro
  Figura 2.15 Comparacion.java
  Programa que compra enteros utilizando instrucciones if, 
  operadores relacionales y de igualdad
  Autor:Rudin Alexander López Salvatierra
  Fecha: 11/02/2014
  Hora: 15:05
*/
import java.util.Scanner; //El programa utiliza la clase Scanner

public class Comparacion
{
   //El método main empieza la ejecución de la aplicación en Java
   public static void main(String args[])
   {
   //Crea objeto Scanner para obtener la entrada de la ventana de comandos
   Scanner entrada = new Scanner(System.in);
   
   int numE1, //primer número entero a comparar
       numE2; //Segundo número entero a comparar
   
   System.out.print("\nEscriba el primer entero: "); //Indicador
   numE1 = entrada.nextInt(); //Lee el primer número del usuario
   
   System.out.print("Escriba el segunsto entero: "); //Indicador
   numE2 = entrada.nextInt(); //Lee el segundo número del usuario
   
   if(numE1 == numE2)
      System.out.printf("%d es igual a %d\n", numE1, numE2);
	 
   if(numE1 != numE2)
      System.out.printf("%d no es igual a %d\n", numE1, numE2);
   
   if(numE1 < numE2)
      System.out.printf("%d es menor que %d\n", numE1, numE2);
   
   if(numE1 > numE2)
      System.out.printf("%d es mayor que %d\n", numE1, numE2);

   if(numE1 <= numE2)
      System.out.printf("%d es menor o igual que %d\n", numE1, numE2);
	 
   if(numE1 >= numE2)
      System.out.printf("%d es mayor o igual que %d\n", numE1, numE2);
	   
   } //Fin del método main
}//Fin de la clase Comparacion