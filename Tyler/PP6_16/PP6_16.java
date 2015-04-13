package PP6_16;

import javax.swing.JFrame;

public class PP6_16 
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new Rebound());
		
		frame.pack();
		frame.setVisible(true);
	}
}

