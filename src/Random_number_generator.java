/**
 * 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;

/**
 * @author Andres
 *
 */
public class Random_number_generator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("random.txt"));
			for(int i=0;i<3000;i++) {
				bw.write((int)(Math.random()*(3000-0+1)+0)+"\n");
			}
				bw.close();
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error de tipo: "+e);
		}
	}

}
