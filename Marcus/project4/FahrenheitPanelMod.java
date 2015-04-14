package project4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanelMod extends JPanel
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton calculate;
	
	public FahrenheitPanelMod()
	{
		inputLabel = new JLabel("Enter Fahrenheit temperature:");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("-----");
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		calculate = new JButton("Convert it!");
		calculate.addActionListener(new TempListener());
		
		inputLabel.setForeground(Color.white);
		outputLabel.setForeground(Color.white);
		resultLabel.setForeground(Color.white);
		
		add(inputLabel);
		add(fahrenheit);
		add(calculate);
		add(outputLabel);
		add(resultLabel);
		
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.gray);
	}
	
	private class TempListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp-32)*5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}
}
