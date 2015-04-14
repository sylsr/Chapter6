package project7;

import javax.swing.*;
import java.awt.*;

public class TrafficLight 
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Traffic Light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TrafficLightPanel trafficLight = new TrafficLightPanel();
		TrafficLightControls controls = new TrafficLightControls(trafficLight);
		
		JPanel panel = new JPanel();
		panel.add(trafficLight);
		panel.add(controls);
		panel.setBackground(Color.darkGray);
		
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
