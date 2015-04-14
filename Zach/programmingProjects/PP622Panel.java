package programmingProjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PP622Panel extends JPanel
{
	private Timer timer;
	private JLabel label;
	private JButton reset, start, stop;
	private int count;
	private final int DELAY = 1000;
	public PP622Panel()
	{
		start = new JButton("Start");
		reset = new JButton("Reset");
		stop = new JButton("Stop");
		timer = new Timer(DELAY, new WatchListener());
		label = new JLabel("Time: " +count);
		
		reset.addActionListener(new ButtonListener());
		start.addActionListener(new ButtonListener());
		stop.addActionListener(new ButtonListener());
		
		add(label);
		add(stop);
		add(reset);
		add(start);
		
		setPreferredSize(new Dimension(400, 500));
		
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
				count = 0;
				label.setText("Time: " +count);
				
			}
			
		}
	}
	private class WatchListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			count++;
			label.setText("Time: " +count);
			repaint();
		}
	}

}
