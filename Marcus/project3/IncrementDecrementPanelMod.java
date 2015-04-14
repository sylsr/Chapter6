package project3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncrementDecrementPanelMod extends JPanel
{
	private JButton increment, decrement;
	private JLabel currentValueLabel;
	private int currentValue = 50;
	private JPanel buttonPanel;
	
	IncrementDecrementPanelMod()
	{
		increment = new JButton("Increment");
		decrement = new JButton("Decrement");
		currentValueLabel = new JLabel("The initial value is: " + currentValue);
		
		ButtonListener listener = new ButtonListener();
		
		increment.addActionListener(listener);
		decrement.addActionListener(listener);
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(400, 40));
		buttonPanel.setBackground(Color.gray);
		buttonPanel.add(increment);
		buttonPanel.add(decrement);
		
		setPreferredSize(new Dimension(400,80));
		setBackground(Color.red);
		add(currentValueLabel);
		add(buttonPanel);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == increment)
			{
				currentValue++;
				currentValueLabel.setText("The current value is: "+ currentValue);
			}
			else if(event.getSource() == decrement)
			{
				currentValue = currentValue - 1;
				currentValueLabel.setText("The current value is: "+ currentValue);
			}
		}
	}
	
}
