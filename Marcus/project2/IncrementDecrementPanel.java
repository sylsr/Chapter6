package project2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncrementDecrementPanel extends JPanel
{
	private JButton increment, decrement;
	private JLabel currentValueLabel;
	private int currentValue = 50;
	private JPanel buttonPanel;
	
	IncrementDecrementPanel()
	{
		increment = new JButton("Increment");
		decrement = new JButton("Decrement");
		currentValueLabel = new JLabel("The initial value is: " + currentValue);
		
		ButtonListener incrementListener = new ButtonListener();
		ButtonListener2 decrementListener = new ButtonListener2();
		
		increment.addActionListener(incrementListener);
		decrement.addActionListener(decrementListener);
		
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
		}
	}
	
	private class ButtonListener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == decrement)
			{
				currentValue = currentValue - 1;
				currentValueLabel.setText("The current value is: "+ currentValue);
			}
		}
	}
	
}
