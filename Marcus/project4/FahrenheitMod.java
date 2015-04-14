package project4;

import javax.swing.*;

public class FahrenheitMod 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FahrenheitPanelMod panel = new FahrenheitPanelMod();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
