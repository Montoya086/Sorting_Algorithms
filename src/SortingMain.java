import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author
 * Andres E. Montoya W. - 21552
 * Diego E. Lemus L. - 21469
 * Fernanda Esquivel - 21542
 *
 */
public class SortingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[300000];
		boolean flag = false;
		int opt1 =0;
		while(flag == false) {
			System.out.println("1. Abrir numeros random");
			System.out.println("2. Abrir numeros ordenados");
			opt1 = Integer.parseInt(scanner.nextLine());
			if (opt1 == 1 || opt1 == 2) {
				flag = true;
			}
			else {
				System.out.println("Esa opcion no existe, intentelo de nuevo.");
				flag = false;
			}	
		}		
		try {
			FileReader r;
			if(opt1==1) {
				r = new FileReader("src//random.txt");
			}else {
				r = new FileReader("src//sortednumbers.txt");
			}
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
		long strTime=0;
		long endTime=0;
		long time=0;
		opt = Integer.parseInt(scanner.nextLine());
		flag = true;
		switch (opt) {
		case 1: 
			strTime=System.currentTimeMillis();
			sorting.bubleSort(array);
			endTime=System.currentTimeMillis();
			break;
		case 2: 
			strTime=System.currentTimeMillis();
			sorting.quickSort(array, 0, array.length-1);
			endTime=System.currentTimeMillis();
			break;
		case 3: 
			strTime=System.currentTimeMillis();
			sorting.mergeSort(array, 0, array.length-1);
			endTime=System.currentTimeMillis();
			break;
		case 4: 
			strTime=System.currentTimeMillis();
			sorting.radixSort(array, array.length);
			endTime=System.currentTimeMillis();
			break;	
		case 5: 
			strTime=System.currentTimeMillis();
			sorting.gnomeSort(array, array.length);
			endTime=System.currentTimeMillis();
			break;	
		default:
			System.out.println("Esa opcion no existe, intentelo de nuevo.");
			flag = false;
			break;
		}
		if (flag == true) {
			System.out.println(endTime-strTime+"ms");
			try {
				//Sobreescribe el archivo
				BufferedWriter bw = new BufferedWriter(new FileWriter("src//Sortednumbers.txt"));
				for(int i=0;i<array.length;i++) {
					bw.write(array[i]+"\n");
				}
					bw.close();
					System.out.println("numeros guardados");
			}catch (Exception e) {
				System.out.println("Ha ocurrido un error de tipo: "+e);
			}
		}	

	}

}
