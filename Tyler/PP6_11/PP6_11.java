package PP6_11;

import javax.swing.JFrame;

public class PP6_11
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new Odometer());
	
		frame.pack();
		frame.setVisible(true);
	}
}
