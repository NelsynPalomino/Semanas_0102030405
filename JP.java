package S0101;

import javax.swing.JOptionPane;

public class JP {

	public static void main(String[] args) {

		String firstNumber, secondNumber;
		int number1, number2, sum;

		firstNumber = JOptionPane.showInputDialog( "Enter first integer" );

		secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );

		sum = number1 + number2;

		JOptionPane.showMessageDialog( null, "The sum is " + sum,
				"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
	}  
}
