package project3;

import javax.swing.*;

import project2.IncrementDecrementPanel;

public class IncrementDecrementMod 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Increment, Decrement");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new IncrementDecrementPanelMod());
		
		frame.pack();
		frame.setVisible(true);
	}

}
