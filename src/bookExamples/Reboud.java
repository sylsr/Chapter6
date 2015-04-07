package bookExamples;

import javax.swing.JFrame;

public class Reboud
{
	public static void main(String[]args)
	{
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new ReboundPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
