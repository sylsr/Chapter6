package programmingProjects;
import java.awt.*;

import javax.swing.*;
public class PP64 extends JFrame
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PP64Panel panel = new PP64Panel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
		

	}

}