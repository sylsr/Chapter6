package project6_21;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CatchTheCreaturePanel extends JPanel 
{
	private JLabel label;
	private boolean on = false;
	private Timer delayTimer, creatureTimer;
	private final int WIDTH = 1903, HEIGHT = 985;
	private int count=0, x=0, y=0;
	private ImageIcon creature;
	private final int DELAY = 4000;
	
	public CatchTheCreaturePanel()
	{
		delayTimer = new Timer(DELAY,new TimerListener());
		label = new JLabel("Total catches: " + count);
		label.setForeground(Color.white);
		creature = new ImageIcon("CREATURE.GIF");
		addMouseListener(new CreatureListener());
		
		add(label);
		setBackground(Color.black);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		
		if(!on)
			delayTimer.start();
	}
	
	public void creatureAppear(boolean creature)
	{
		on = creature;
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		
		if(on)
		{
			x=(int) (Math.random()*1800+10);
			y=(int) (Math.random()*930+10);
			creature.paintIcon(this, page, x,y);
		}
	}
	
	private class CreatureListener implements MouseListener
	{
		public void mousePressed(MouseEvent event) 
		{ 
			if(event.getX() >= x-20 && event.getX() <= x+20 && event.getY()<=y+20 && event.getY()>= y-20)
			{	
				count++;
				label.setText("Total catches: " + count);
			}
		}
		
		public void mouseClicked(MouseEvent event) {}
		public void mouseEntered(MouseEvent event) {}
		public void mouseReleased(MouseEvent event) {}
		public void mouseExited(MouseEvent event) {}
	}
	
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			delayTimer.stop();
			creatureAppear(true);
			
			if(on)
			{
				creatureTimer = new Timer((int)(Math.random()*3901+100), new TimerListener1());
				creatureTimer.start();
			}
			repaint();
		}
	}
	
	private class TimerListener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			creatureTimer.stop();
			creatureAppear(false);
			delayTimer.start();
			repaint();
		}
	}
}