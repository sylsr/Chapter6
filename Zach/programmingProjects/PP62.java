package programmingProjects;
import java.awt.*;
import javax.swing.*;

public class PP62 {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PP62Panel panel = new PP62Panel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		



	}

}
