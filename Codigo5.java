package revisionCodigoOtros5;

import java.util.Scanner; //Faltaba el paquete scanner

public class Codigo5 {
public static void main(String[] args) { // se agregó el main
	  Scanner s = new Scanner(System.in ); //faltaba System.in
	    System.out.print("Introduzca un número: "); // se cambió ' por "
	    int ni = s.nextInt();
	    int  c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;  
	    }
	      ni /= 10; // esto estaba dentro del else y debe de ir fuera
	    }
	      if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado."); //Se puso println
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    s.close(); // Se cierra el Scanner

}  
}