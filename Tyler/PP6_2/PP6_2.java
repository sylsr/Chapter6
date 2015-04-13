package PP6_2;

import javax.swing.JFrame;

public class PP6_2 
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new IncrementAndDecrement());
		
		frame.pack();
		frame.setVisible(true);

	}

}
