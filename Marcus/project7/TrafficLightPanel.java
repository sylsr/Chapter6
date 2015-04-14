package project7;

import java.awt.*;
import javax.swing.*;

public class TrafficLightPanel extends JPanel
{
	
	public int currentLight, red = 1, yellow = 2, green = 3;
	
	public TrafficLightPanel()
	{
	        
		 setBackground(Color.darkGray);
	     setPreferredSize(new Dimension(300, 400));
	}
	
	 public void paintComponent(Graphics light) 
	 {
	        super.paintComponent(light);
	        light.setColor(Color.black);
	        light.fillRect(75, 40, 150, 300);
	        light.setColor(Color.red);
	        light.fillOval(112, 50, 75, 75);
	        light.setColor(Color.gray);
	        light.fillOval(112, 150, 75, 75);
	        light.setColor(Color.gray);
	        light.fillOval(112, 250, 75, 75);
	     	if (currentLight == yellow)
	        {
		        light.setColor(Color.gray);
		        light.fillOval(112, 50, 75, 75);
		        light.setColor(Color.yellow);
		        light.fillOval(112, 150, 75, 75);
		        light.setColor(Color.gray);
		        light.fillOval(112, 250, 75, 75);
	        }
	        else if(currentLight == green)
	        {
		        light.setColor(Color.gray);
		        light.fillOval(112, 50, 75, 75);
		        light.setColor(Color.gray);
		        light.fillOval(112, 150, 75, 75);
		        light.setColor(Color.green);
		        light.fillOval(112, 250, 75, 75);
	        }
	    }
	 	public void setLight(int light)
		   {
		      currentLight = light;
		   }
}
