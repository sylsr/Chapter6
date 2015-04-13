package PP6_3;

import javax.swing.JFrame;

public class PP6_3 
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
