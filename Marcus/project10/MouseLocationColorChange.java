package project10;

import javax.swing.*;

public class MouseLocationColorChange 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Project 10");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MouseLocationColorChangePanel());
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
