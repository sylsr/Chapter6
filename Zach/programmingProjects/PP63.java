package programmingProjects;
import java.awt.*;
import javax.swing.*;

public class PP63 {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PP63Panel panel = new PP63Panel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		



	}

}
