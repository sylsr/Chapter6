package project12;

import javax.swing.*;

public class RubberbandCircle 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Rubberband Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new RubberbandCirclePanel());
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
