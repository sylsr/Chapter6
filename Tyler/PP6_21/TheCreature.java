package PP6_21;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TheCreature
{
	ImageIcon theCreature;
	private Random rand = new Random();
	int creatureX, creatureY, timeAlive;
	public TheCreature()
	{
		theCreature = new ImageIcon("theCreature.gif");
	}
	public void moveCreature()
	{
		this.creatureX = rand.nextInt(999)+1;
		this.creatureY = rand.nextInt(999)+1;
		this.timeAlive=rand.nextInt(2);
	}
	public boolean catchAttempt(int mouseX, int mouseY)
	{
		int testerX=Math.abs(creatureX-mouseX);
		int testerY=Math.abs(creatureY-mouseY);
		System.out.println(testerX);
		System.out.println(testerY);
		if(testerX<=50)
		{
			if(testerY<=50)
			{
				return true;
			}
			return false;
		}
		return false;
		
	}

}
