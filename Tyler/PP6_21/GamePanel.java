package PP6_21;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel
{
	private TheCreature creature;
	Timer time;
	int lifeTimeOfCreature=0;
	int timesCaught=0;
	JLabel numOfPoints;
	public GamePanel()
	{
		numOfPoints= new JLabel("You have caught the creature: "+ timesCaught +" times");
		time=new Timer(1000, new CreatureCatcher());
		
		creature = new TheCreature();
		addMouseListener(new CreatureCatch());
		
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.black);
		time.start();
		add(numOfPoints);
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		creature.theCreature.paintIcon(this, page, creature.creatureX, creature.creatureY);
	}
	private class CreatureCatch implements MouseListener
	{

		public void mouseClicked(MouseEvent e)
		{
			boolean test =creature.catchAttempt(e.getX(), e.getY());
			System.out.println(test);
			if(test!=false)
			{
				timesCaught++;
				lifeTimeOfCreature=0;
				creature.moveCreature();
				numOfPoints.setText("You have caught the creature: "+ timesCaught +" times");
			}
			
		}
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		
	}
	private class CreatureCatcher implements ActionListener
	{
		
		public void actionPerformed(ActionEvent e)
		{
			if(lifeTimeOfCreature<creature.timeAlive)
			{
				lifeTimeOfCreature++;
			}
			else
			{
				creature.moveCreature();
				lifeTimeOfCreature=0;
			}
			repaint();
		}
		
	}

}
