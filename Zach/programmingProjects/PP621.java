package programmingProjects;
import javax.swing.*;
import java.awt.*;

public class PP621 extends JFrame
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("PP6.21");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP621Panel());
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
