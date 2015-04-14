package programmingProjects;
import javax.swing.*;


public class PP61 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PP61Panel panel = new PP61Panel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
