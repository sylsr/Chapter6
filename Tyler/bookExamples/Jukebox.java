package bookExamples;

import javax.swing.JFrame;

public class Jukebox
{
	

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Java Juke Box");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JukeBoxControls());
		frame.pack();
		frame.setVisible(true);

	}

}
