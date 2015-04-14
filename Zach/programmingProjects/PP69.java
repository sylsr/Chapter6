package programmingProjects;
import java.awt.Component;

import javax.swing.*;

public class PP69
{

	public static void main(String[] args) 
	{
		String strNum1;
		String strNum2;
		String results;
		int num1;
		int num2; 
		int sum;
		int answer;
		int product;
		
		do
		{
			strNum1 = JOptionPane.showInputDialog("Enter an Integer: ");
			num1 = Integer.parseInt(strNum1);
			strNum2 = JOptionPane.showInputDialog("Enter a Second Integer: ");
			num2 = Integer.parseInt(strNum2);
			
			sum = num1 + num2;
			product = num1 * num2;
			
			results = "The Sum of the two Integers is " +sum+ "\nThe Product of the two Integers is " +product;
			JOptionPane.showMessageDialog(null, results);
			
			answer = JOptionPane.showConfirmDialog(null, "Would you like to do this again?");
					
			
		}
		while (answer == JOptionPane.YES_OPTION);
		
		

	}

}
