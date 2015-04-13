package PP6_22;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class StopwatchPanel extends JPanel
{
	static boolean startOrStop=false;
	Stopwatch timeKeeper;
	JPanel topPanel, bottomPanel;
	JButton start, stop, reset , hourUp, minuteUp, secondUp, hourDown, minuteDown, secondDown;
	JLabel time1, time2, time3;
	Timer controlTimer;
	ImageIcon upArrow = new ImageIcon("arrowUp.gif");
	ImageIcon downArrow = new ImageIcon("arrowDown.gif");
	private final Font font = new Font("Arial", Font.PLAIN, 22);
	public StopwatchPanel()
	{
		hourUp=new JButton(upArrow);
		hourUp.addActionListener(new ArrowListener());
		
		minuteUp=new JButton(upArrow);
		minuteUp.addActionListener(new ArrowListener());
		
		secondUp=new JButton(upArrow);
		secondUp.addActionListener(new ArrowListener());
		
		hourDown=new JButton(downArrow);
		hourDown.addActionListener(new ArrowListener());
		
		minuteDown=new JButton(downArrow);
		minuteDown.addActionListener(new ArrowListener());
		
		secondDown=new JButton(downArrow);
		secondDown.addActionListener(new ArrowListener());
		
		setLayout(new GridLayout(2,1));
		setPreferredSize(new Dimension(500, 600));
		timeKeeper=new Stopwatch(0, 0, 0);
		controlTimer=new Timer(1000, new StartListener());
		time1=new JLabel(Stopwatch.hour+":");
		time1.setFont(font);
		time2=new JLabel(Stopwatch.minute+":");
		time2.setFont(font);
		time3=new JLabel(""+Stopwatch.second);
		time3.setFont(font);
		
		start= new JButton("Start");
		start.addActionListener(new StartListener());
		
		stop= new JButton("Stop");
		stop.addActionListener(new StopListener());
		
		reset=new JButton("Reset");
		reset.addActionListener(new ResetListener());
		
		topPanel=new JPanel();
		topPanel.setLayout(new GridLayout(3,3));
		topPanel.add(hourUp);
		topPanel.add(minuteUp);
		topPanel.add(secondUp);
		topPanel.add(time1);
		topPanel.add(time2);
		topPanel.add(time3);
		topPanel.add(hourDown);
		topPanel.add(minuteDown);
		topPanel.add(secondDown);
		
		
		bottomPanel=new JPanel();
		bottomPanel.setLayout(new GridLayout(1,3));
		bottomPanel.add(start);
		bottomPanel.add(stop);
		bottomPanel.add(reset);
		
		add(topPanel);
		add(bottomPanel);
		controlTimer.start();
	}
	private class StartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==start)
			{
				startOrStop=true;
			}
			if(startOrStop!=false && event.getSource()==controlTimer)
			{
				timeKeeper.time();
				time1.setText(Stopwatch.hour+":");
				time2.setText(Stopwatch.minute+":");
				time3.setText(""+Stopwatch.second);
			}
			
		}
		
	}
	private class StopListener implements ActionListener
	{

		public void actionPerformed(ActionEvent event)
		{
			startOrStop=false;
			
		}
		
	}
	private class ResetListener implements ActionListener
	{

		public void actionPerformed(ActionEvent event)
		{
			Stopwatch.hour=0;
			Stopwatch.minute=0;
			Stopwatch.second=0;
			time1.setText(Stopwatch.hour+":");
			time2.setText(Stopwatch.minute+":");
			time3.setText(""+Stopwatch.second);
		}
		
	}
	private class ArrowListener implements ActionListener
	{

		public void actionPerformed(ActionEvent event)
		{
			if(startOrStop!=true)
			{
				if(event.getSource()==hourUp)
				{
					timeKeeper.straightIncrementHour();
				}
				if(event.getSource()==minuteUp)
				{
					timeKeeper.straightIncrementMinute();
				}
				if(event.getSource()==secondUp)
				{
					timeKeeper.straightIncrementSecond();
				}
				if(event.getSource()==hourDown)
				{
					timeKeeper.decrementHour();
				}
				if(event.getSource()==minuteDown)
				{
					timeKeeper.decrementMinute();
				}
				if(event.getSource()==secondDown)
				{
					timeKeeper.decrementSecond();
				}
				time1.setText(Stopwatch.hour+":");
				time2.setText(Stopwatch.minute+":");
				time3.setText(""+Stopwatch.second);
			}
			
		}
		
	}
}
