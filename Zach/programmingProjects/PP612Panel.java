package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PP612Panel extends JPanel
{
	private int x;
	private int y;
	private Point point;
	private int radius;
	public PP612Panel()
	{
		point = null;
		addMouseListener(new Listener());
		addMouseMotionListener(new Listener());
		setPreferredSize(new Dimension(1500, 900));
		
		
	}
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		if(point != null)
		{
			radius = (int) (Math.sqrt(Math.pow(point.y - y,  2) + Math.pow(point.x - x, 2)));
			g.setColor(Color.blue);
			g.fillOval((x - radius), (y - radius), (radius * 2), (radius * 2));
		}
	}
	private class Listener implements MouseListener, MouseMotionListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mousePressed(MouseEvent event) 
		{
			y = event.getY();
			x = event.getX();
			
			
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mouseDragged(MouseEvent event) 
		{
			point = event.getPoint();
			repaint();
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) 
		{
			
			
		}
		
	}

}
