package programmingProjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class PP61Panel extends JPanel 
{
	private int count;
	private JLabel label;
	
	public PP61Panel()
	{
		Random rand = new Random();
		label = new JLabel("Number: " +count);
		JButton button = new JButton("Button");
		button.addActionListener(new ButtonListener());
		add(button);
		add(label);
		setPreferredSize(new Dimension(300, 40));
	}
		
		private class ButtonListener implements ActionListener
		{
			public void actionPerformed (ActionEvent event)
			{
				Random rand = new Random();
				count = rand.nextInt(100) +1;
				label.setText("Number: "+count);
				
			}
			
		}
		
		
	}


