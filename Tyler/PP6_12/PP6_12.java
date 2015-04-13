package PP6_12;

import javax.swing.JFrame;

public class PP6_12 
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new Rubberband());
		
		frame.pack();
		frame.setVisible(true);
	}
}
