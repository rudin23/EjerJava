/*Noveno programa del libro
  Ejercicio 1.15 capitulo 2
  programa para realizar las operaciones básicas
  Autor: Rudin Alexander López Salvatierra
  Fecha: 12/02/2014
  Hora: 11:20
*/
import java.util.Scanner; //El programa utiliza la clase Scannner

public class OperBas
{
   //Aqui comienza el metodo main(principal)
   public static void main(String args[])
   {
      //Crear el objeto Scanner para obtener la entrada de la ventana de comandos
	  Scanner entrada = new Scanner(System.in);
	 
	  int numE1, //Primer número entero a operar
	      numE2, //Segundo número entero a operar
		  suma, //Suma de numE1 y numE2
		  resta, //Resta de numE1 y numE2
		  multi, //Multiplicación de numE1 y numE2
          division; //División de numE1 y numE2
       
      System.out.print("\nIntroduzca el primer nu'mero a operar: "); //indicador para el usuario
	  numE1 = entrada.nextInt();
	  
	  System.out.print("Introduzca el segundo nu'mero a perar: "); //Indicador para el usuario
	  numE2 = entrada.nextInt();
	  
	  suma = numE1 + numE2;
	  resta = numE1 - numE2;
	  multi = numE1 * numE2;
	  division = numE1 / numE2;
	  
	  System.out.printf("\nLa suma de los nu'meros es %d\n", suma); //Envia la suma de numE1 y numE2
	  System.out.printf("La resta de los nu'meros es %d\n", resta); //Envia la resta de numE1 y numE2
	  System.out.printf("La multiplicación de lo nu'meros es %d\n", multi); //Envia la multiplicación de numE1 y numE2
	  System.out.printf("La dvisio'n de lon nu'meros es %d\n", division); //Envia la división de numE1 y numE2
	  
   } //Fin del método main
} //Fin del la clase OperBas