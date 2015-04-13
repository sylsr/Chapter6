package PP6_12;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Rubberband extends JPanel
{
	int xCoord1=0, yCoord1=0, xCoord2, yCoord2;
	int radius;
	Rubberband()
	{
		setBackground(Color.PINK);
		setPreferredSize(new Dimension(500,500));
		addMouseListener(new MouseMovement());
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawOval(xCoord1, yCoord1, radius, radius);
		
	}
	

	
	private class MouseMovement implements MouseListener
	{
		public void mouseClicked(MouseEvent e){}	
		public void mouseReleased(MouseEvent e)
		{
			xCoord2=e.getX();
			yCoord2=e.getY();
			
			radius=(int) Math.round(Math.sqrt(Math.pow((xCoord2-xCoord1),2)+Math.pow((yCoord2-yCoord1),2)));
			repaint();
		}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mousePressed(MouseEvent e)
		{
			xCoord1=e.getX();
			yCoord1=e.getY();
		}
		
	}
}
