package PP6_11;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Odometer extends JPanel
{
	static int x1, x2, y1, y2;
	static double accumulativeDistance=0;
	JLabel distance;
	boolean firstTime=true;
	public double distanceFormula(int x1, int x2, int y1, int y2)
	{
		int yDistance=(y2-y1);
		int xDistance=(x2-x1);
		double yDistanceSquared=Math.pow(yDistance, 2);
		double xDistanceSquared=Math.pow(xDistance, 2);
		double toBeSquared=(yDistanceSquared+xDistanceSquared);
		accumulativeDistance+=Math.sqrt(toBeSquared);
		return accumulativeDistance;
	}
	public Odometer()
	{
		setPreferredSize(new Dimension(500,500));
		distance=new JLabel("Distance travelled: "+accumulativeDistance);
		addMouseMotionListener(new MouseOdometer());
		add(distance);
	}
	private class MouseOdometer implements MouseListener, MouseMotionListener
	{
		
		public void mouseMoved(MouseEvent e)
		{
			if(firstTime==true)
			{
				x1=e.getX();
				y1=e.getY();
				firstTime=false;
			}
			if(firstTime==false)
			{
				x2=e.getX();
				y2=e.getY();
				
				distanceFormula(x1, x2, y1, y2);
				x1=x2;
				y1=y2;
				
			}
			distance.setText("Distance travelled: "+accumulativeDistance);
			repaint();
		}
		public void mouseClicked(MouseEvent e){}
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e) {}
		public void mouseDragged(MouseEvent e){}
		
	}
}
