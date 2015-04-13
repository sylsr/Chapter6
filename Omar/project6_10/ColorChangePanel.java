package project6_10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorChangePanel extends JPanel
{
	private int x = 0, y = 0;
	private final int HEIGHT = 500, WIDTH = 700;
	JLabel label;
	
	public ColorChangePanel()
	{
		label = new JLabel("Hovering mouse over left half turns the background Red.\n Hovering mouse over right half turns"
				+ " the background Green.");
		addMouseMotionListener(new CoordinatesListener());
		
		add(label);
		setBackground(Color.red);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		if(x<=(WIDTH*0.50))
			setBackground(Color.red);
		else
		{
			setBackground(Color.green);
		}
	}
	
	private class CoordinatesListener implements MouseMotionListener
	{
		public void mouseMoved(MouseEvent event)
		{
			x = event.getX();
			y = event.getY();
			
			repaint();
		}
		
		public void mouseDragged(MouseEvent event) {}
	}
}