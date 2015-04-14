package project5;

import javax.swing.*;

public class DirectionMod 
{
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Direction");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame.getContentPane().add(new DirectionPanelMod());
	      
	      frame.pack();
	      frame.setResizable(false);
	      frame.setVisible(true);
	   }
}
