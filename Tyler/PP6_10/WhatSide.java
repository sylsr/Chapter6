package PP6_10;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class WhatSide extends JPanel
{
	static int width=300, height=300;
	JPanel left, right;
	static Color redOrGreen;
	public WhatSide()
	{
		setLayout(new GridLayout(1,2));
		
		left=new JPanel();
		left.setPreferredSize(new Dimension(width/2, height));
		left.setBackground(redOrGreen);
		left.addMouseListener(new PanelListener());
		
		right=new JPanel();
		right.setPreferredSize(new Dimension(width/2, height));
		right.setBackground(redOrGreen);
		right.addMouseListener(new PanelListener());
		
		add(left);
		add(right);
	}
	private class PanelListener implements MouseListener
	{

		public void mouseClicked(MouseEvent event){}
		
		public void mouseEntered(MouseEvent event)
		{
			if(event.getSource()==left)
			{
				setBackground(Color.RED);
			}
			if(event.getSource()==right)
			{
				setBackground(Color.GREEN);
			}
		}
		
		public void mouseExited(MouseEvent event){}

		public void mousePressed(MouseEvent event){}

		public void mouseReleased(MouseEvent event){}
		
	}

}
