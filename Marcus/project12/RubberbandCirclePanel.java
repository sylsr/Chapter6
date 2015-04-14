package project12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RubberbandCirclePanel extends JPanel
{
	private Point point1 = null, point2 = null;
	
	public RubberbandCirclePanel()
	{
		setPreferredSize(new Dimension(900,900));
		setBackground(Color.red);
		
		  RubberbandListener listener = new RubberbandListener();
	      addMouseListener(listener);
	      addMouseMotionListener(listener);
	}
	
	public void paintComponent(Graphics page)
	   {
	      super.paintComponent(page);

	      page.setColor (Color.black);
	      if (point1 != null && point2 != null)
	         page.fillOval(point1.x, point1.y, point2.x, point2.y);
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
