package project6_8;
import javax.swing.*;

public class Email 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Compose an Email");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new EmailPanel());
		
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
}
