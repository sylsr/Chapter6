package project8;

import javax.swing.*;

public class PrototypeEmail 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Prototype Email");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PrototypeEmailPanel());
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
