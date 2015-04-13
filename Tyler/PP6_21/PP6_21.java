package PP6_21;

import javax.swing.JFrame;

public class PP6_21
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new GamePanel());
		
		frame.pack();
		frame.setVisible(true);

	}

}
