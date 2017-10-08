
package invertir_cadena;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Invertir_Cadena {

 
        @SuppressWarnings("empty-statement")
	public static void main(String[] args)
        {
		Scanner scan = new Scanner(System.in);
		int posicion;
		char caracter;
		String original, invertida = new String();;
		System.out.println("Inserta la cadena");
		original = scan.nextLine();
		posicion = original.length() - 1;
		while (posicion >= 0){
			caracter = original.charAt(posicion);
			invertida = invertida + caracter;
			posicion--;
		}
		System.out.println("Cadena invertida es: " + invertida);
                //JOptionPane.showMessageDialog(null,invertida=invertida);
	}
}

    
