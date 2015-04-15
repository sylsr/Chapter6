package project22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopwatchPanel extends JPanel
{
	private JPanel time;
	private JButton start, stop, reset;
	private JLabel timeLabel;
	private int seconds = 0, delay = 1000;
	private Timer timer;
	private boolean timerOn;
	
	public StopwatchPanel()
	{
		setLayout(new BorderLayout());
		timer = new Timer(delay, new TimerListener());
		
		TimerListener listener = new TimerListener();
		
		setPreferredSize(new Dimension(500,150));
		
		timeLabel = new JLabel(seconds + " seconds");
		timeLabel.setForeground(Color.blue);
		timeLabel.setFont(new Font("Serif", Font.PLAIN, 50));
		
		time = new JPanel();
		time.setPreferredSize(new Dimension(500,75));
		time.setBackground(Color.lightGray);
		time.add(timeLabel);
		
		start = new JButton("Start");
		start.setFont(new Font("Serif", Font.PLAIN, 45));
		start.addActionListener(listener);
		
		stop = new JButton("Stop");
		stop.setFont(new Font("Serif", Font.PLAIN, 45));
		stop.addActionListener(listener);
		
		reset = new JButton("Reset");
		reset.setFont(new Font("Serif", Font.PLAIN, 45));
		reset.addActionListener(listener);
		
		add(time, BorderLayout.NORTH);
		add(reset, BorderLayout.WEST);
		add(start, BorderLayout.CENTER);
		add(stop, BorderLayout.EAST);
		
		timer.start();
	}
	
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == start)
			{
				timerOn = true;
			}	
			else if(event.getSource() == stop)
			{
				timerOn = false;
			}
			else if(event.getSource() == reset)
			{
				seconds = 0;
				timeLabel.setText(seconds + " seconds");
			}
			
			if((timerOn == true))
			{
				timer.start();
				seconds++;
				timeLabel.setText(seconds-1 + " seconds");
			}
			else
			{
				timer.stop();
			}
		}
	}
	
}
