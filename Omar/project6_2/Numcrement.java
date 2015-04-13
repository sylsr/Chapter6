package project6_2;
import javax.swing.*;

public class Numcrement 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Increment/Decrement");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new NumcrementPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
