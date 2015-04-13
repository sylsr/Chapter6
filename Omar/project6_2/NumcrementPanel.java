package project6_2;
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
		increment.addActionListener(new ButtonListener1());
		decrement = new JButton("Decrement Number");
		decrement.addActionListener(new ButtonListener2());
		
		label = new JLabel("The initial value is: " + count);
		
		add(increment);
		add(decrement);
		
		add(label);
		
		setBackground(Color.magenta);
		setPreferredSize(new Dimension(300,75));
	}
	
	private class ButtonListener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
			label.setText("The current value is: " + count);
		}
	}
	
	private class ButtonListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count--;
			label.setText("The current value is: " + count);
		}
	}
}