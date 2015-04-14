package project5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DirectionPanelMod extends JPanel
{
	   private final int WIDTH = 600, HEIGHT = 400;
	   private final int JUMP = 10;  

	   private final int IMAGE_SIZE = 31;

	   private ImageIcon up, down, right, left, currentImage;
	   private int x, y;

	   public DirectionPanelMod()
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
	            case KeyEvent.VK_DOWN:
	               currentImage = down;
	               if(y <= HEIGHT-24)
	               y += JUMP;
	               break;
	            case KeyEvent.VK_LEFT:
	               currentImage = left;
	               if(x >= 3)
	               x -= JUMP;
	               break;
	            case KeyEvent.VK_RIGHT:
	               currentImage = right;
	               if(x <= WIDTH-24)
	               x += JUMP;
	               break;
	         }

	         repaint();
	      }

	      public void keyTyped(KeyEvent event) {}
	      public void keyReleased(KeyEvent event) {}
	   }
}
