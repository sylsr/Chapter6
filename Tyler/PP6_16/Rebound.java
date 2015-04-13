package PP6_16;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Rebound extends JPanel
{
	private final int WIDTH=300, HEIGHT =100;
	private final int DELAY=20, IMAGE_SIZE=35;
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;
	
	public Rebound()
	{
		addMouseListener(new StopStart());
		
		timer = new Timer(DELAY, new ReboundListener());
		
		image = new ImageIcon("happyFace.gif");
		
		x=0;
		y=40;
		moveX=moveY=3;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		timer.start();
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
	}
	private class ReboundListener implements ActionListener
	{
		
		public void actionPerformed(ActionEvent event)
		{
			x+=moveX;
			y+=moveY;
			if(x<=0||x>WIDTH-IMAGE_SIZE)
			{
				moveX=moveX*-1;
			}
			if(y<=0||y>HEIGHT-IMAGE_SIZE)
			{
				moveY=moveY*-1;
			}
			repaint();
			
		}
	}
	private class StopStart implements MouseListener
	{

		public void mouseClicked(MouseEvent e)
		{
			if(timer.isRunning()==true)
			{
				timer.stop();
			}
			else
			{
				timer.start();
			}
		}
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		
	}

}
