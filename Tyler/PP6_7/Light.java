package PP6_7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Light extends JPanel
{
	static Color topLight=Color.RED;
	static Color middleLight=Color.LIGHT_GRAY;
	static Color bottomLight=Color.LIGHT_GRAY;
	public Light()
	{
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(80, 100));
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(topLight);
		page.fillOval(10, 0, 70, 70);
		page.setColor(middleLight);
		page.fillOval(10, 88, 70, 70);
		page.setColor(bottomLight);
		page.fillOval(10, 175, 70, 70);
		
	}
	
}
