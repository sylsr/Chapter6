package programmingProjects;
import javax.swing.*;

public class PP612 extends JFrame
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("PP6.12");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP612Panel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
