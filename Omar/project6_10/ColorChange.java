package project6_10;
import javax.swing.*;

public class ColorChange 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Color Change");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ColorChangePanel());
		
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
}