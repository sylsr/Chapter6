package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.Event.*;
import java.util.Random;

public class PP621Creature 
{
	ImageIcon creature;
	private Random rand = new Random();
	int creatureX;
	int creatureY;
	int aliveTime;
	public PP621Creature()
	{
		creature = new ImageIcon("CREATURE.GIF");
		
	}
	public void creatureMove()
	{
		this.aliveTime = rand.nextInt(999) +1;
		this.creatureY = rand.nextInt(999) +1;
		this.creatureX = rand.nextInt(999) +1;
	}
	

}
