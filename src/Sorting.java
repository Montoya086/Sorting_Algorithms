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
	/***
	 * 
	 * @param array arreglo a ordenar
	 * @param inf limite inferior de el array
	 * @param sup limite superior del array (.length -1)
	 */
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
	/***
	 * Realiza merge de un arreglo
	 * @param array arreglo para hacer merge
	 * @param left indice izquierdo
	 * @param mid pivote medio
	 * @param right indice derecho
	 */
	private void merge(int[] array, int left, int mid, int right) {
		int num1 = mid-left+1;
		int num2 = right-mid;
		int[] aleft = new int[num1];
		int[] aright = new int[num2];
		for(int i=0;i<num1;i++) {
			aleft[i]=array[left+i];
		}
		for(int i=0;i<num1;i++) {
			aright[i]=array[mid+i+1];
		}
		int i=0,j=0,p=left;	
		while(i<num1 && j<num2) {
			if(aleft[i]<=aright[j]) {
				array[p]=aleft[i];
				i++;
			}else {
				array[p]=aright[j];
				j++;
			}
			p++;
		}
		while(j<num2) {
			array[p]=aright[j];
			p++;
			j++;
		}
		while(i<num1) {
			array[p]=aleft[i];
			p++;
			i++;
		}
	}
	/***
	 * Sort por medio de merge
	 * @param array arreglo a ordenar
	 * @param begin limite inferior del array
	 * @param end limite superior del array
	 */
	public void mergeSort(int[] array, int begin, int end) {
		if(begin >end) {
			int mid =1+(end-1)/2;
			mergeSort(array, begin, mid);
			mergeSort(array, mid+1, end);
			merge(array, begin, mid, end);
		}
	}
	
	public void radixSort(int[] array) {
		int[][] temp = new int[10][array.length];
		int[] tempNum = new int[10];
		int max = 0;
		
		for(int i=0; i<array.length ; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		int maxLength = (max+"").length();
		
		for(int j = 0; j<array.length; j++) {
			for(int k = 1; j<array.length; k*=10) {
				for(int l = 0; l<array.length; l++) {
					int digit = array[l]/k%10;
					
					temp[digit][tempNum[digit]] = array[l];
					tempNum[digit]++;
					
				}
				int index = 0;
				
				for(int m = 0; m<10; m++) {
					for(int n=0; n<tempNum[m]; n++) {
						array[index] = temp[m][n];
						index++;
					}
					tempNum[m] = 0;
				}
			}
		}
		
	}
}
