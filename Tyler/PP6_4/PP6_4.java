package PP6_4;

import javax.swing.JFrame;

public class PP6_4
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new Fahrenheit());
		
		frame.pack();
		frame.setVisible(true);
	}

}
