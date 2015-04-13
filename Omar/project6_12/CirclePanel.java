package project6_12;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class CirclePanel extends JPanel
{
	private int x, y;
	private int radius;
	private Point point = null;
	JLabel label;
	
	public CirclePanel()
	{
		label = new JLabel("Use the canvas below to draw a circle!");
		addMouseListener(new CircleListener());
		addMouseMotionListener(new CircleListener());
		
		add(label);
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(1200,800));
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		if(point != null)
		{
			radius = (int) (Math.sqrt(Math.pow(point.y-y, 2) + Math.pow(point.x-x, 2)));
			
			page.setColor(Color.green);
			page.fillOval((x-radius), (y-radius), (radius*2), (radius*2));
		}
	}
	
	private class CircleListener implements MouseListener, MouseMotionListener
	{
		public void mousePressed(MouseEvent event)
		{
			x = event.getX();
			y = event.getY();
		}
		
		public void mouseDragged(MouseEvent event)
		{
			point = event.getPoint();
			repaint();
		}
		
		public void mouseClicked(MouseEvent event){}
		public void mouseReleased(MouseEvent event){}
		public void mouseEntered(MouseEvent event) {}
		public void mouseExited(MouseEvent event) {}
		public void mouseMoved(MouseEvent event) {}
	}
}