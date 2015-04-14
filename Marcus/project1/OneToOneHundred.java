package project1;

import javax.swing.*;

public class OneToOneHundred 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Project 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new OneToOneHundredPanel());
		
		frame.pack();
		frame.setVisible(true);
	}

}
