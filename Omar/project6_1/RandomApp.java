package project6_1;
import java.awt.*;
import javax.swing.*;

public class RandomApp 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Random Number Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new RandomAppPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
