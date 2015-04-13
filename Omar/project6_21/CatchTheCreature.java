package project6_21;
import javax.swing.*;

public class CatchTheCreature 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Catch the Creature");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CatchTheCreaturePanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
