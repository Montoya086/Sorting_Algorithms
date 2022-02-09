import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Andres
 *
 */
public class SortingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[3000];
		try {
			FileReader r = new FileReader("src//random.txt");
			BufferedReader br = new BufferedReader(r);
			String num;
			int i=0;
			while((num=br.readLine())!=null){
				array[i]=Integer.parseInt(num);
				i++;
			}
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error de tipo: "+e);
		}
		System.out.println("1. Bubble Sort");
		System.out.println("2. Quick Sort");
		System.out.println("3. Merge Sort");
		System.out.println("4. Radix Sort");
		System.out.println("5. Gnome Sort");
		int opt =0;
		opt = Integer.parseInt(scanner.nextLine());
		switch (opt) {
		case 1: 
			sorting.bubleSort(array);
			break;
		case 2: 
			sorting.quickSort(array, 0, array.length-1);
			break;
		case 3: 
			sorting.mergeSort(array, 0, array.length-1);
			break;
		case 4: 
			sorting.radixSort(array, array.length);
			break;	
		default:
			break;
		}
		System.out.println("Ingrese cualquier caracter para imprimir");
		scanner.next();
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
