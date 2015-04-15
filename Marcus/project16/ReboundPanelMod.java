package project16;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class ReboundPanelMod extends JPanel
{
	private final int WIDTH = 1600, HEIGHT = 1000;
	private final int DELAY = 20, IMAGE_SIZE = 35;
	
	private ImageIcon image;
	private Timer timer;
	private int x,y,movex,movey;
	private boolean timerOn = true;
	
	public ReboundPanelMod()
	{
		addMouseListener(new StopListener());
		timer = new Timer(DELAY, new ReboundListener());
		
		image = new ImageIcon("bab.gif");
		
		x = 0;
		y = 40;
		movex = movey = 3;
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.gray);
		timer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
	}
	
	private class ReboundListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			x += movex;
			y += movey;
			
			if (x<=0 || x>= WIDTH-IMAGE_SIZE)
				movex = movex*-1;
			if(y<=0 || y>= HEIGHT-IMAGE_SIZE)
				movey = movey*-1;
			repaint();
		}
		
	}
	
	private class StopListener implements MouseListener
	{
		public void mousePressed(MouseEvent arg0) 
		{
			if(timerOn == true)
			{
				timer.start();
			}
			else
			{
				timer.stop();
			}
			timerOn = !timerOn;
		}
		
		public void mouseClicked(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}
		
	}
}
