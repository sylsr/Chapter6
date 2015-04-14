package programmingProjects;
import javax.swing.*;

import bookExamples.ReboundPanel;


public class PP616 extends JFrame
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP616Panel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}

