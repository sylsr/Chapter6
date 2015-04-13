package PP6_7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TrafficLight extends JPanel
{
	JPanel emptyNorth, emptyEast, emptyWest;
	JButton lightState;
	ImageIcon green;
	Timer time;
	static boolean timer=false;
	static int timerGreen=0;
	static int timerRed=2;
	public TrafficLight()
	{
		time = new Timer(1000, new StateChange());
		green=new ImageIcon("happyFace.gif");
		setLayout(new BorderLayout());
		
		
		emptyNorth=new JPanel();
		emptyNorth.setBackground(Color.BLUE);
		emptyNorth.setPreferredSize(new Dimension(100, 75));
		emptyEast=new JPanel();
		emptyEast.setBackground(Color.BLUE);
		emptyEast.setPreferredSize(new Dimension(150, 250));
		emptyWest=new JPanel();
		emptyWest.setBackground(Color.BLUE);
		emptyWest.setPreferredSize(new Dimension(150, 250));
		
		lightState= new JButton("Change Light State");
		lightState.setPreferredSize(new Dimension(100, 50));
		lightState.addActionListener(new StateChange());
		
		
		
		
		add(new Light(), BorderLayout.CENTER);
		add(lightState, BorderLayout.SOUTH);
		add(emptyNorth, BorderLayout.NORTH);
		add(emptyEast, BorderLayout.EAST);
		add(emptyWest, BorderLayout.WEST);
		time.start();
	}
	private class StateChange implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==lightState)
			{
				timer=true;
			}
			if(timer!=false&&e.getSource()==time)
			{
				if(timerGreen<2)
				{
					Light.topLight=Color.LIGHT_GRAY;
					//Light.middleLight=Color.YELLOW;
					if(timerGreen>=1)
					{
						Light.middleLight=Color.LIGHT_GRAY;
						Light.bottomLight=Color.GREEN;
						timerGreen++;
						timer=false;
						timerRed=0;
					}
					timerGreen++;
				}
				else if(timerRed<2)
				{
					Light.bottomLight=Color.LIGHT_GRAY;
					Light.middleLight=Color.YELLOW;
					if(timerRed>=1)
					{
						Light.middleLight=Color.LIGHT_GRAY;
						Light.topLight=Color.RED;
						timerRed++;
						timer=false;
						timerGreen=0;
					}
					timerRed++;
				}
			}
			repaint();
			
			
		}
		
	}
	
}
