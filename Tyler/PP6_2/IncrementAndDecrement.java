package PP6_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncrementAndDecrement extends JPanel
{
	JButton increment, decrement;
	JLabel number;
	static int startingVal=50;
	public IncrementAndDecrement()
	{
		increment=new JButton("Increment");
		increment.addActionListener(new FirstButtonListener());
		
		decrement=new JButton("Decrement");
		decrement.addActionListener(new SecondButtonListener());
		
		number=new JLabel(""+startingVal);
		
		add(increment);
		add(decrement);
		add(number);
	}
	
	private class FirstButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) 
		{
		
				startingVal=1+startingVal;
				number.setText(""+startingVal);
		
			repaint();
		}
		
	}
	private class SecondButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) 
		{
		
				startingVal=startingVal-1;
				number.setText(""+startingVal);
		
			repaint();
		}
		
	}
}
