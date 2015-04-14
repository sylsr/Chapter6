package project11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseOdometerPanel extends JPanel
{
	double x1, x2, y1, y2, distance1, distanceTotal = 0;
	boolean firstTime = true;
	JLabel odometerLabel;
	
	public MouseOdometerPanel()
	{
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(600,600));
		addMouseMotionListener(new DistanceListener());
		
		odometerLabel = new JLabel("Distance traveled: " + distanceTotal);
		add(odometerLabel);
		
	}
	
	private class DistanceListener implements MouseMotionListener
	{
		public void mouseMoved(MouseEvent event) 
		{
			
			if(firstTime == true)
			{
				x1 = event.getX();
				y1 = event.getY();
				firstTime = false;
			}
			if(firstTime == false)
			{
				x2 = event.getX();
				y2 = event.getY();
				
				double x = (Math.pow(x2-x1, 2));
				double y = (Math.pow(y2-y1, 2));
				
				distance1 = Math.sqrt(x+y);
				distanceTotal = distanceTotal + distance1;
			}
			odometerLabel.setText("Distance traveled: " + distanceTotal);
		}

		public void mouseDragged(MouseEvent arg0) {}
	}
}
