package PP6_22;

import javax.swing.JFrame;

public class PP6_22
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame("Stopwatch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new StopwatchPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
