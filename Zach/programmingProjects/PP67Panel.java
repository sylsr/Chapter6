package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PP67Panel extends JPanel
{
	private JButton change;
	private int count = 0;
	public PP67Panel()
	{
		change = new JButton("Change Traffic Signal");
		change.addActionListener(new ButtonListener());
		
		setBackground(Color.orange);
		add(change);

		setPreferredSize(new Dimension(300, 500));
		
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
			if(count == 4)
			{
				count = 1;
			}
			repaint();
		}
	}
	public void painComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		
		g.fillRect(200, 200, 210, 300);
		
		g.setColor(Color.gray);
		
		g.fillOval(220, 245, 170, 70);
		
		g.setColor(Color.gray);
		
		g.fillOval(220, 300, 170, 70);
		
		g.setColor(Color.gray);
		
		g.fillOval(220, 220, 170, 70);
		if (count == 1)
		{
			g.setColor(Color.green);
			
			g.fillOval(220, 220, 170, 70);
		}
		if (count == 2)
		{
			g.setColor(Color.yellow);
			
			g.fillOval(220, 300, 170, 70);
		}
		if (count == 3)
		{
			g.setColor(Color.red);
			
			g.fillOval(220, 245, 170, 70);
			
		}
		repaint();
		
		
	}

}
