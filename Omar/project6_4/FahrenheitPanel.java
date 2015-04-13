package project6_4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton enter;
	
	public FahrenheitPanel()
	{
		inputLabel = new JLabel("Enter Fahrenheit temperature: ");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		enter = new JButton("Enter");
		enter.addActionListener(new TempListener());
		
		add(inputLabel);
		add(fahrenheit);
		add(enter);
		add(outputLabel);
		add(resultLabel);
		
		setPreferredSize(new Dimension(350, 75));
		setBackground(Color.yellow);
	}
	
	private class TempListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int fahrenheitTemp, celsiusTemp;
			
			String text = fahrenheit.getText();
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp-32) * 5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}
}
