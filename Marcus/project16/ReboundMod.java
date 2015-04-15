package project16;

import javax.swing.*;


public class ReboundMod 
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ReboundPanelMod());
		
		frame.pack();
		frame.setVisible(true);
	}

}
