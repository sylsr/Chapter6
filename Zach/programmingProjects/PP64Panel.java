package programmingProjects;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PP64Panel extends JPanel 
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton submit;
	
	public PP64Panel()
	{
		submit = new JButton("Submit");
		inputLabel = new JLabel("Enter Fahrenheit temperature:");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		submit.addActionListener(new TempListener());
		add(inputLabel);
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		add(submit);
		
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.yellow);
	}
	private class TempListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp-32) *5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
		
	}

}