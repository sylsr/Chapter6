package PP6_1;

import javax.swing.JFrame;

public class PP6_1
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ButtonCounter());
		
		frame.pack();
		frame.setVisible(true);
	}
}
