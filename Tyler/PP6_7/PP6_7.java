package PP6_7;

import javax.swing.JFrame;

public class PP6_7 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new TrafficLight());
		
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);

	}

}
