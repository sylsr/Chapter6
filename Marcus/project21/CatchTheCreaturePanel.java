package project21;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class CatchTheCreaturePanel extends JPanel
{
	private ImageIcon image;
	private int x = 1, y = 1, delay = 500, caught = 0;
	private Timer timer;
	private JLabel timesCaught;
	
	Random rand = new Random();
	
	public CatchTheCreaturePanel()
	{
		delay = rand.nextInt(1000) + 500;
		timer = new Timer(delay, new CatchListener());
		
		addMouseListener(new CaughtListener());
		
		timesCaught = new JLabel("You have caught the WEEABOO: " + caught + " times!!!");
		
		setPreferredSize(new Dimension(1200,900));
		setBackground(Color.pink);
		
		add(timesCaught);
		
		image = new ImageIcon("bab.gif");		
		timer.start();
	}
	
	public void paintComponent(Graphics pic) 
	 {
	        super.paintComponent(pic);
	        image.paintIcon(this, pic, x, y);
	 }
	
	private class CatchListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			x = (int) rand.nextInt(1071) + 1;
			y = (int) rand.nextInt(747) + 1;
			repaint();
			
		}
	}
	
	private class CaughtListener implements MouseListener
	{
		public void mousePressed(MouseEvent event) 
		{
			if(event.getX() <= x+129 && event.getX() >= x)
			{
				if(event.getY() <= y+153 && event.getY() >= y)
				{
					caught++;
					timesCaught.setText("You have caught the WEEABOO: " + caught + " times!!!");
				}
			}
		}
		
		public void mouseClicked(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}
		
	}
}
