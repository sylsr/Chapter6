package project6;

import javax.swing.*;

public class DirectionMod2 
{
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Direction");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame.getContentPane().add(new DirectionPanelMod2());
	      
	      frame.pack();
	      frame.setResizable(false);
	      frame.setVisible(true);
	   }
}
