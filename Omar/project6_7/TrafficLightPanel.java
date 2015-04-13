package project6_7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLightPanel extends JPanel
{
	private JPanel graphics;
	private Graphics light;
	private JButton change;
	private int count = 0;
	
	public TrafficLightPanel()
	{
		change = new JButton("Change Signal");
		change.addActionListener(new ButtonListener());
		
		add(change);
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300,500));
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		page.setColor(Color.black);
		page.fillRect(100, 100, 110, 300);
		
		page.setColor(Color.gray);
		page.fillOval(121, 140, 70, 70);
		
		page.setColor(Color.gray);
		page.fillOval(121, 300, 70, 70);
		
		page.setColor(Color.gray);
		page.fillOval(121, 220, 70, 70);
		
		if(count==1)
		{
			page.setColor(Color.green);
			page.fillOval(121, 300, 70, 70);
		}
		
		else if(count == 2)
		{
			page.setColor(Color.yellow);
			page.fillOval(121, 220, 70, 70);
		}

		else if(count == 3)
		{
			page.setColor(Color.red);
			page.fillOval(121, 140, 70, 70);
		}
		
		repaint();
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
			if(count == 4)
			{
				count=1;
			}
			repaint();
		}
	}
}
