package project1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class OneToOneHundredPanel extends JPanel
{
	private JButton randomInitializer;
	private double randomNum;
	private JLabel numLabel;
	
	OneToOneHundredPanel()
	{
		randomInitializer = new JButton("Randomize");
		numLabel = new JLabel("A random number between 1 and 100 is: ");
		
		ButtonListener listener = new ButtonListener();
		randomInitializer.addActionListener(listener);
		
		add(numLabel);
		add(randomInitializer);
		
		setBackground(Color.green);
		setPreferredSize(new Dimension(400,100));
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			randomNum = Math.random() * 100 + 1;
			numLabel.setText("A random number between 1 and 100 is: " + randomNum);
		}

	}
}
