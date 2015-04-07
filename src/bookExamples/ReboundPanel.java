package bookExamples;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;

public class ReboundPanel extends JPanel
{
	private final int WIDTH = 1920, HEIGHT =1080;
	private final int DELAY=20, IMAGE_SIZE=35;
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;
	
	public ReboundPanel()
	{
		timer = new Timer(DELAY, new ReboundListener());
		image = new ImageIcon("happyFace.gif");
		x = 0;
		y=40;
		moveX = moveY=3;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.cyan);
		timer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		image.paintIcon(this,  page, x, y);
	}
	
	private class ReboundListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			x += (5*moveX);
			y += (5*moveY);
			
			if(x<= 0 || x>= WIDTH-IMAGE_SIZE)
			{
				moveX=moveY*-1;
				
			}
			if(y<=0||y>=HEIGHT-IMAGE_SIZE)
			{
				moveY=moveY*-1;
				
			}
			repaint();
		}
	}
}