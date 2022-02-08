/**
 * 
 */

/**
 * @author Andres
 *
 */
public class NumberCompareDesc implements IComparator{

	@Override
	public int Compare(int number1, int number2) {
		int numero1 = (int) number1; 
		int numero2 = (int) number2; 
		if(numero1>numero2)
			return -1;
		else if(numero2 > numero1)
			return 1;
		else 
			return 0;
	}

}
