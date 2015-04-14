package project10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class MouseLocationColorChangePanel extends JPanel
{
	int half;
	
	public MouseLocationColorChangePanel()
	{	
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(600, 600));
		addMouseMotionListener(new LocationListener());
	}
	
	
	public void setHalf(int currentHalf)
	{
		half = currentHalf;
	}
	
	private class LocationListener implements MouseMotionListener
	{
		public void mouseMoved(MouseEvent event) 
		{
			
	    	  if(event.getX() >= 301)
	    	  {
	    		  setBackground(Color.green);
	    	  }
	    	  else if(event.getX() < 301)
	    	  {
	    		 setBackground(Color.red);
	    	  }
	    	  else
	    	  {
	    		  setBackground(Color.black);
	    	  }
		}

		public void mouseDragged(MouseEvent arg0) {}
	}
}



