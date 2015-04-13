package PP6_3;

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
		increment.addActionListener(new ButtonListener());
		
		decrement=new JButton("Decrement");
		decrement.addActionListener(new ButtonListener());
		
		number=new JLabel(""+startingVal);
		
		add(increment);
		add(decrement);
		add(number);
	}
	
	private class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==increment)
			{
				startingVal=1+startingVal;
				number.setText(""+startingVal);
			}
			else
			{
				startingVal=startingVal-1;
				number.setText(""+startingVal);
			}
			repaint();
		}
		
	}
}
