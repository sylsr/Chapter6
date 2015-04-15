package project22;

import javax.swing.*;

public class Stopwatch 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Stopwatch");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    frame.getContentPane().add(new StopwatchPanel());
	    
	    frame.pack();
	    frame.setResizable(false);
	    frame.setVisible(true);
	}
}
