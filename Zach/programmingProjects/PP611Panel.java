package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PP611Panel extends JPanel
{
	private Point point = null;
	private Point point2 = null;
	private double odo;
	private double distance;
	
	public PP611Panel()
	{
		addMouseMotionListener(new Listener());
		setPreferredSize(new Dimension(300, 200));
		
		
		
	}
	private class Listener implements MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent e) 
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) 
		{
			if(point == null)
			{
				point = e.getPoint();
			}
			if(point2 == null)
			{
				point2 = e.getPoint();
			}
			else
			{
				point = point2;
				point2 = e.getPoint();
				repaint();
			}
			
			
		}

	}
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		if(point != null && point2 != null)
		{
			distance = Math.sqrt(Math.pow(point2.y-point.y, 2) + Math.pow(point2.x-point.x, 2));
		}
		odo += distance;
		g.drawString("Distance: " +odo, 20, 20);		
	}
}
