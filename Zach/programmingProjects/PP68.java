package programmingProjects;
import javax.swing.*;

public class PP68 extends JFrame 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("PP6.8");
		PP68Panel panel = new PP68Panel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
