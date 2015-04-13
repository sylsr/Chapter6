package project6_12;
import javax.swing.*;

public class Circle 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Drawing a Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CirclePanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}