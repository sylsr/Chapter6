package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PP610Panel extends JPanel 
{
	private final int HEIGHT = 500;
	private final int WIDTH = 800;
	private int x;
	private int y;
	public PP610Panel()
	{
		addMouseListener(new Listener());
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(x <= WIDTH * 0.5)
		{
			setBackground(Color.red);
		}
		else
		{
			setBackground(Color.green);
		}
		
		
	}
	private class Listener implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent event) 
		{
			if(getX() < 150)
			{
				setBackground(Color.red);
			}
			if(getX() > 150)
			{
				setBackground(Color.green);
			}
			repaint();
			
		}

		@Override
		public void mouseEntered(MouseEvent event) 
		{
			x = event.getX();
			y = event.getY();
			repaint();
			
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) 
		{
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			
			
		}
	}

}
