package project6_11;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class OdometerPanel extends JPanel 
{
	private Point point1 = null, point2=null;
	private double distance = 0;
	private double odometer;
	
	public OdometerPanel()
	{
		addMouseMotionListener(new OdometerListener());
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(1000,800));
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		if(point1 != null && point2 != null)
			distance = Math.sqrt(Math.pow(point2.y-point1.y, 2) + Math.pow(point2.x-point1.x, 2));
		
		odometer += distance;
		page.setColor(Color.red);
		
		page.drawString(("Current Odometer: " + odometer),15,15);
	}
	
	private class OdometerListener implements MouseMotionListener
	{
		public void mouseMoved(MouseEvent event)
		{
			if(point1==null)
				point1 = event.getPoint();
			else if(point2==null)
				point2 = event.getPoint();
			else
			{
				point1 = point2;
				point2 = event.getPoint();
				repaint();
			}
		}
		
		public void mouseDragged(MouseEvent event) {}
		public void mouseEntered(MouseEvent event) {}
		public void mouseClicked(MouseEvent event) {}
		public void mouseExited(MouseEvent event) {}
		public void mouseReleased(MouseEvent event) {}
	}
}