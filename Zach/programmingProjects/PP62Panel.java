package programmingProjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PP62Panel extends JPanel 
{
	private int count = 50;
	private JLabel label;
	private JButton increment;
	private JButton decrement;
	public PP62Panel()
	{
		label = new JLabel("Number: " +count);
		JButton increment = new JButton("Increment");
		JButton decrement = new JButton("Decrement");
		increment.addActionListener(new ButtonListener());
		decrement.addActionListener(new ButtonListener1());
		add(increment);
		add(decrement);
		add(label);
		setPreferredSize(new Dimension(500, 100));
		
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			count++;
			label.setText("Number: " +count);
			
		}
	}
	private class ButtonListener1 implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			count--;
			label.setText("Number: " +count);
			
		}
	}

}
