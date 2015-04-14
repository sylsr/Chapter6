package programmingProjects;
import javax.swing.*;

public class PP611 extends JFrame
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("PP6.11");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP611Panel());
		
		frame.pack();
		frame.setVisible(true);
		
		

	}

}
