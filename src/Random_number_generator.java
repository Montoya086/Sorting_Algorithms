import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;

/**
 * Class Random_number_generator
 * 
 * Encargada de leer/escribir el archivo y mostrar la informacion ordenada al usuario
 * 
 * @version 1.0, 08/02/2022
 * 
 * @author 
 * Andres E. Montoya W. - 21552
 * Diego E. Lemus L. - 21469
 * Fernanda Esquivel - ¿?
 *
 */

public class Random_number_generator {
	/**
	 * Metodo Main
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//Sobreescribe el archivo
			BufferedWriter bw = new BufferedWriter(new FileWriter("src//random.txt"));
			for(int i=0;i<300000;i++) {
				bw.write((int)(Math.random()*(3000-0+1)+0)+"\n");
			}
				bw.close();
				System.out.println("numeros guardados");
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error de tipo: "+e);
		}
	}

}
