package PP6_6;

import java.awt.Dimension;


import javax.swing.JFrame;


public class PP6_6 
{
	
	public static void main(String[]args)
	{
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(500,600));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		frame.getContentPane().add(new Direction());
		
		frame.pack();
		frame.setVisible(true);
	}
}