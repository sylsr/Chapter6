package project7;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TrafficLightControls extends JPanel
{
	private TrafficLightPanel traffic;
	private JButton changeLight;
	private int count = 1;
	
	public TrafficLightControls(TrafficLightPanel trafficLight)
	{
		traffic = trafficLight;
		
		changeLight = new JButton("Change the Light");
		changeLight.addActionListener(new lightListener());
		
		add(changeLight);
	}
	
	private class lightListener implements ActionListener
	   {
		
	      public void actionPerformed(ActionEvent event)
	      {
	    	  if(count >= 3)
	    	  {
	    		  count = 1;
	    	  }
	    	  else
	    	  {
	    	  count++;
	    	  }
	    	  
	    	  if(count <= 3 && count >= 1)
	    	  {
		    	  if(count == 2)
		    	  {
		    		  traffic.setLight(2);
		    		  traffic.repaint();
		    	  }
		    	  else if (count == 3)
		    	  {
		    		  traffic.setLight(3);
		    		  traffic.repaint();
		    	  }
		    	  else
		    	  {
		    		  traffic.setLight(1);
		    		  traffic.repaint();
		    	  }
	    	  }
	    	  else
	    	  {
	    		  count = 0;
	    	  }
	      }
	   }
}
