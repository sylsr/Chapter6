package programmingProjects;
import javax.swing.*;

public class PP622 extends JFrame
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("PP6.22");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP622Panel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
