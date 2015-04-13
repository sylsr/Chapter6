package project6_1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RandomAppPanel extends JPanel
{
	private int num;
	private JLabel label;
	private JButton push; 
	
	public RandomAppPanel()
	{
		num = 0;
		push = new JButton("Click me");
		push.addActionListener(new ButtonListener());
		
		label = new JLabel("Random Number (between 1-100): " + num);
		
		add(push);
		add(label);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(250,75));
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			num = (int) (Math.random()*100 + 1);
			label.setText("Random Number (between 1-100): " + num);
		}
	}
}
