package PP6_10;

import javax.swing.JFrame;

public class PP6_10 
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new WhatSide());
		
		frame.pack();
		frame.setVisible(true);

	}
	

}
