package project12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RubberbandCirclePanel extends JPanel
{
	private Point point1 = null, point2 = null;
	int radius;
	
	public RubberbandCirclePanel()
	{
		addMouseListener(new RubberbandListener());
	    addMouseMotionListener(new RubberbandListener());
		setPreferredSize(new Dimension(900,900));
		setBackground(Color.cyan);
	}
	
	public void paintComponent(Graphics page)
	   {
	      super.paintComponent(page);
	      if (point1 != null && point2 != null)
	      {
	    	 radius =(int) Math.sqrt((Math.pow(point2.x-point1.x, 2))+(Math.pow(point2.y - point1.y, 2)));
	      	 page.setColor(Color.green);
	         page.fillOval(point1.x-radius, point1.y-radius, radius*2, radius*2);
	      }
	   }
	
	private class RubberbandListener implements MouseListener, MouseMotionListener
	   {
	      
		public void mousePressed(MouseEvent event)
	      {
			
	         point1 = event.getPoint();
	      }

	      public void mouseDragged(MouseEvent event)
	      {
	         point2 = event.getPoint();
	         repaint();
	      }

	      public void mouseClicked(MouseEvent event) {}
	      public void mouseReleased(MouseEvent event) {}
	      public void mouseEntered(MouseEvent event) {}
	      public void mouseExited(MouseEvent event) {}
	      public void mouseMoved(MouseEvent event) {}
	   }
}
