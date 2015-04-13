package PP6_9;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DialogBox
{

	public static void main(String[]args)
	{
		int int1, int2, again;
		String rawInput, results;
		do
		{
			rawInput=JOptionPane.showInputDialog("Enter an integer");
			int1=Integer.parseInt(rawInput);
			rawInput=JOptionPane.showInputDialog("Enter another integer");
			int2=Integer.parseInt(rawInput);
			results="The sum is: " + (int1+int2)+". The Products are: "+(int1*int2);
			JOptionPane.showMessageDialog(null, results);
			again=JOptionPane.showConfirmDialog(null, "Go again?");
		}while(again==JOptionPane.YES_OPTION);
		
		
	}
}
