package project6_22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchPanel extends JPanel
{
	private int count=0;
	private JButton start, stop, reset;
	private JLabel label;
	private Timer timer;
	private final int DELAY = 1000;
	
	public StopwatchPanel()
	{
		timer = new Timer(DELAY, new StopwatchListener());
		start = new JButton("Start");
		stop = new JButton("Stop");
		reset= new JButton("Reset");
		label = new JLabel(("Time (in seconds): " + count));
		
		start.addActionListener(new ButtonListener());
		stop.addActionListener(new ButtonListener());
		reset.addActionListener(new ButtonListener());
		
		add(label);
		add(start);
		add(stop);
		add(reset);
		setPreferredSize(new Dimension(400,50));
	}
	
	private class StopwatchListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
			label.setText(("Time (in seconds): " + count));	
			repaint();
		}
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource() == start)
			{
				timer.start();
			}
			else if(event.getSource() == stop)
			{	
				timer.stop();
			}
			else
			{
				timer.stop();
				count=0;
				label.setText(("Time (in seconds): " + count));	
			}
		}
	}
}