package programmingProjects;
import javax.swing.*;
import java.awt.*;

public class PP67
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("PP6.7");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new PP67Panel());
		
		frame.pack();
		frame.setVisible(true);
		
		

	}

}
