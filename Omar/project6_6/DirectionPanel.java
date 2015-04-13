package project6_6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DirectionPanel extends JPanel
{
	private final int JUMP = 10;
	
	private final int WIDTH = 200, HEIGHT = 300, IMAGE_SIZE = 31;
	
	private ImageIcon up, down, right, left, currentImage;
	private int x, y;
	
	public DirectionPanel()
	{
		addKeyListener (new DirectionListener());
		
		x = WIDTH / 2;
		y = HEIGHT / 2;
		
		up = new ImageIcon("arrowUp.gif");
		down = new ImageIcon("arrowDown.gif");
		left = new ImageIcon("arrowLeft.gif");
		right = new ImageIcon("arrowRight.gif");
		
		currentImage = right;
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(HEIGHT, WIDTH));
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
				if(y>=0)
				{
					currentImage = up;
					y -= JUMP;
				}
				break;
			case KeyEvent.VK_DOWN:
				if(y<=WIDTH-IMAGE_SIZE)
				{
					currentImage = down;
					y += JUMP;
				}
				break;
			case KeyEvent.VK_LEFT:
				if(x>=0)
				{
					currentImage = left;
					x -= JUMP;
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(x<=HEIGHT-IMAGE_SIZE)
				{
					currentImage = right;
					x += JUMP;
				}
				break;
				
			case KeyEvent.VK_T:
				if(y>=0 && x>=0)
				{
					currentImage = left;
					x-=JUMP;
					y-=JUMP;
				}
				break;
				
			case KeyEvent.VK_U:
				if(y>=0 && x<=HEIGHT-IMAGE_SIZE)
				{
					currentImage = right;
					y-=JUMP;
					x+=JUMP;
				}
				break;
				
			case KeyEvent.VK_G:
				if(x>= 0 && y<=WIDTH-IMAGE_SIZE)
				{
					currentImage = left;
					x-=JUMP;
					y+=JUMP;
				}
				break;
				
			case KeyEvent.VK_J:
				if(x<=HEIGHT-IMAGE_SIZE && y<=WIDTH-IMAGE_SIZE)
				{
					currentImage = right;
					x+=JUMP;
					y+=JUMP;
				}
				break;
			}
			repaint();
		}
		
		public void keyTyped(KeyEvent event) {}
		public void keyReleased(KeyEvent event) {}
	}
}