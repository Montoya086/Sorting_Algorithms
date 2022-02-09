/**
 * Class NumberCompareDesc
 * 
 * Realiza la comparacion de dos numeros, implementa a IComparator
 * 
 * @version 1.0, 08/02/2022
 * 
 * @author 
 * Andres E. Montoya W. - 21552
 * Diego E. Lemus L. - 21469
 * Fernanda Esquivel - 21542
 *
 */

public class NumberCompareDesc implements IComparator{

	@Override
	/**
	 * Compara dos numeros y devuelve un valor en base a la comparacion
	 * @param int number1: numero a comparar
	 * @param int number2: numero a comparar
	 * @return int (-1,0,1)
	 */
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
