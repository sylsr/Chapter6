package project9;

import javax.swing.JOptionPane;

public class SumProductDialogBoxes 
{

	public static void main(String[] args) 
	{
		String stringNum1, stringNum2, result;
		int num1, num2, sum, product, again;
		
		do
		{
			stringNum1 = JOptionPane.showInputDialog("Enter an integer:");
			num1 = Integer.parseInt(stringNum1);
			
			stringNum2 = JOptionPane.showInputDialog("Enter another integer:");
			num2 = Integer.parseInt(stringNum2);
			
			sum = num1 + num2;
			product = num1 * num2;
			
			result = "The sum of " + num1 + " and " + num2 + " is " + sum + "\n The product of " + num1 + " and " + num2 + " is " + product;
			
			JOptionPane.showMessageDialog(null, result);
			
			again = JOptionPane.showConfirmDialog(null, "Do Another?");
		}
		while(again == JOptionPane.YES_OPTION);
	}

}
