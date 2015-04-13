package project6_3;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class NumcrementPanel extends JPanel 
{
	private int count;
	private JLabel label, heading;
	private JButton increment, decrement;
	
	public NumcrementPanel()
	{
		count = 50;
		increment = new JButton("Increment Number");
		increment.addActionListener(new ButtonListener());
		decrement = new JButton("Decrement Number");
		decrement.addActionListener(new ButtonListener());
		
		label = new JLabel("The initial value is: " + count);
		
		add(increment);
		add(decrement);
		
		add(label);
		
		setBackground(Color.magenta);
		setPreferredSize(new Dimension(300,75));
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == increment)
			{
				count++;
				label.setText("The current value is: " + count);
			}
			
			else
			{
				count--;
				label.setText("The current value is: " + count);
			}
		}
	}
}