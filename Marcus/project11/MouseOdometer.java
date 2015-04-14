package project11;

import javax.swing.JFrame;

public class MouseOdometer 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Project 10");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MouseOdometerPanel());
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
