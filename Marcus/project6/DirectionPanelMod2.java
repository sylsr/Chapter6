package project6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DirectionPanelMod2 extends JPanel
{
	 private final int WIDTH = 600, HEIGHT = 400;
	   private final int JUMP = 10;  

	   private final int IMAGE_SIZE = 31;

	   private ImageIcon up, down, right, left, upRight, upLeft, downRight, downLeft, currentImage;
	   private int x, y;

	   public DirectionPanelMod2()
	   {
	      addKeyListener (new DirectionListener());

	      x = WIDTH / 2;
	      y = HEIGHT / 2;

	      up = new ImageIcon("arrowUp.gif");
	      down = new ImageIcon("arrowDown.gif");
	      left = new ImageIcon("arrowLeft.gif");
	      right = new ImageIcon("arrowRight.gif");
	      upRight = new ImageIcon("arrowDiagonalUpRight.gif");
	      upLeft = new ImageIcon("arrowDiagonalUpLeft.gif");
	      downRight = new ImageIcon("arrowDiagonalDownRight.gif");
	      downLeft = new ImageIcon("arrowDiagonalDownLeft.gif");

	      currentImage = right;
	      
	      setBackground(Color.black);
	      setPreferredSize(new Dimension(WIDTH, HEIGHT));
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
	         switch (event.getKeyCode())
	         {
	            case KeyEvent.VK_UP:
	               currentImage = up;
	               if(y >= 3)
	               y -= JUMP;
	               break;
	            case KeyEvent.VK_U:
	            	currentImage = upRight;
		               if(y >= 0)
		               y -= JUMP;
		               if(x <= WIDTH-24)
		            	   x += JUMP;
		               break;
	            case KeyEvent.VK_DOWN:
	               currentImage = down;
	               if(y <= HEIGHT-24)
	               y += JUMP;
	               break;
               case KeyEvent.VK_G:
	               currentImage = downLeft;
	               if(y <= HEIGHT-24)
	               y += JUMP;
	               if(x >= 0)
	            	   x -=JUMP;
	               break;
	            case KeyEvent.VK_LEFT:
	               currentImage = left;
	               if(x >= 3)
	               x -= JUMP;
	               break;
	            case KeyEvent.VK_T:
		               currentImage = upLeft;
		               if(x >= 0)
		               x -= JUMP;
		               if(y >= 0)
		               y-= JUMP;
		               break;
	            case KeyEvent.VK_RIGHT:
	               currentImage = right;
	               if(x <= WIDTH-24)
	               x += JUMP;
	               break;
	            case KeyEvent.VK_J:
		               currentImage = downRight;
		               if(x <= WIDTH-24)
		               x += JUMP;
		               if( y <= HEIGHT-24)
		               y += JUMP;
		               break;
	         }

	         repaint();
	      }

	      public void keyTyped(KeyEvent event) {}
	      public void keyReleased(KeyEvent event) {}
	   }
}
