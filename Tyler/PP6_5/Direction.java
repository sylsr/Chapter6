package PP6_5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Direction extends JPanel
{
	
	private int WIDTH = 300;
	private int HEIGHT =200;
	private int JUMP = 10;
	private final int IMAGE_SIZE=31;
	private ImageIcon up, down , right , left, currentImage;
	private int x, y;
	public Direction()
	{
		addKeyListener(new DirectionListener());
		x=WIDTH/2;
		y=HEIGHT/2;
		
		up= new ImageIcon("arrowUp.gif");
		down=new ImageIcon("arrowDown.gif");
		left= new ImageIcon("arrowLeft.gif");
		right= new ImageIcon("arrowRight.gif");
		
		currentImage =right;
		
		setBackground(Color.black);
		
		//setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		currentImage.paintIcon(this, page, x, y);
	}
	private class DirectionListener implements KeyListener
	{
		public void keyPressed(KeyEvent event)
		{
			switch(event.getKeyCode())
			{
			case KeyEvent.VK_UP:
					currentImage=up;
					if(y>0)
					{
						y-=JUMP;
					}
					break;
			case KeyEvent.VK_DOWN:
					currentImage=down;
					if(y<getHeight()-IMAGE_SIZE)
					{
						y+=JUMP;
					}
					break;
			case KeyEvent.VK_LEFT:
					currentImage=left;
					if(x>0)
					{
						x-=JUMP;
					}
					break;
			case KeyEvent.VK_RIGHT:
					currentImage=right;
					if(x<getWidth()-IMAGE_SIZE)
					{
						x+=JUMP;
					}
					break;
			}
			repaint();
		}
		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent e) {}
	}
}
