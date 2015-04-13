package project6_9;
import javax.swing.*;

public class DialogSum
{
	public static void main(String[] args) 
	{
		String numStr1, numStr2, result;
		int num1, num2, sum, product, again;
		
		do
		{
			numStr1 = JOptionPane.showInputDialog("Enter an integer value: ");
			num1 = Integer.parseInt(numStr1);
			
			numStr2 = JOptionPane.showInputDialog("Enter another integer value: ");
			num2 = Integer.parseInt(numStr2);
			
			sum = num1+num2;
			product = num1*num2;
			
			result = "The sum of the two values is: " + sum + "\nThe product of the two values is: " + product;
			
			JOptionPane.showMessageDialog(null, result);
			again = JOptionPane.showConfirmDialog(null, "Again?");
		}
		while(again == JOptionPane.YES_OPTION);
	}
}