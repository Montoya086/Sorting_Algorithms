/**
 * 
 */

/**
 * @author Andres
 *
 */
public class Sorting {
	NumberCompareDesc compare;
	
	public Sorting() {
		compare =  new NumberCompareDesc();
	}
	
	public void bubleSort(int[] array) {
		for (int i=0;i<array.length-1;i++) {					
			for (int j=i+1;j<array.length;j++) {				
				if (compare.Compare(array[i], array[j])>0) {    
					int tempo = array[i];								
					array[i] = array[j];							
					array[j] = tempo;									
				}
			}
		}
	}
	
	public void quickSort(int[] array, int inf, int sup) {
			int i = inf -1;
			int j = sup;
			boolean ban = true;
			int tempo;	   		   
			if (inf >= sup) {
				return;
			}
			int div_element = array[sup];
			while (ban) {
				while(compare.Compare(array[++i], div_element) < 0); 
				while((compare.Compare(array[--j], div_element) > 0)  && (j > inf));				
				if (i < j) {
					tempo = array[i];
					array[i] = array[j];
					array[j] = tempo;
			  	} else {
			  		ban = false;
			  	}
			}	   
			tempo=array[i];
			array[i]=array[sup];
			array[sup]=tempo;
			quickSort(array,inf, i-1);
			quickSort(array,i+1,sup);
	   }
}
