/*Decimo sexto programa del libro
  Ejercicio 2.30 capitulo 2
  Programa para separar 5 digitos
  Autor: Rudin Alexander López Salvatierra
  Fecha: 13/02/2014
  Hora: 14:40
*/
import java.util.Scanner;

//Inicio de la clase Digitos
public class Digitos
{
   //Inicio del metodo main
   public static void main(String args[])
   {
      //Crear objeto Scanner para obtener la entrada de la ventana de comando
      Scanner lectura = new Scanner(System.in);
      
      int ingreso, //Variable que ingresa el ususuario con 5 digitos
          salida1, //Variable de las decenas de millar
		  salida2, //Variable de las unidades de millar
		  salida3, //Variable de las centenas
		  salida4, //Variable de las decenas
		  salida5; //Variable de las unidades
		  
      System.out.print("\nIngrese un nu'mero de 5 digitos: "); //Indicador
	  ingreso = lectura.nextInt();
	  
	  salida1 = ingreso/10000;
	  salida2 = (ingreso%10000)/1000;
	  salida3 = ((ingreso%10000)%1000)/100;
	  salida4 = (((ingreso%10000)%1000)%100)/10;
	  salida5 = ((((ingreso%10000)%1000)%100)%10);
	  
	  System.out.printf("\n\t\t\t%d   %d   %d   %d   %d\n",
	      salida1, salida2, salida3, salida4, salida5);//Resultado a imprimir
      
	  System.out.printf("\nEl primer numero es:     %d", salida1);
	  System.out.printf("\nEl segundo numero es:    %d", salida2);
	  System.out.printf("\nEl tercer numero es:     %d", salida3);
	  System.out.printf("\nEl cuarto numero es:     %d", salida4);
	  System.out.printf("\nEl quinto numero es:     %d\n", salida5);
   } //Fin del metodo main
} //Fin de la clase Digitos