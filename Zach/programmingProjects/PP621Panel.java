package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class PP621Panel extends JPanel
{
	private JLabel label;
	private PP621Creature creature;
	Timer time;
	private int count;
	private int life;
	public PP621Panel()
	{
		creature = new PP621Creature();
		label = new JLabel("Times Caught: " +count);
		time = new Timer(800, new CreatureCatch());
		count = 0;
		addMouseListener(new CreatureCatcher());
		
		setPreferredSize(new Dimension(500, 300));
		time.start();
		add(label);
	}
	private class CreatureCatcher implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			count++;
			life = 0;
			label.setText("Times Caught: " +count);
			creature.creatureMove();
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		creature.creature.paintIcon(this, g, creature.creatureX, creature.creatureY);
	}
	private class CreatureCatch implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(life < creature.aliveTime)
			{
				life++;
			}
			else
			{
				creature.creatureMove();
				life = 0;
			}
			repaint();
		}
	}
	
}
