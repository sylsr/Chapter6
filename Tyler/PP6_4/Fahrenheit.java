package PP6_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fahrenheit extends JPanel
{
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	JButton conversion;
	
	public Fahrenheit()
	{
		conversion= new JButton("Convert!");
		inputLabel = new JLabel("Enter Fahrenheit temperature: ");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		conversion.addActionListener(new TempListener());
		add(inputLabel);
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		add(conversion);
		
		
		setPreferredSize( new Dimension(300, 75));
		setBackground(Color.yellow);
	}
	
	private  class TempListener implements ActionListener
	{


		public void actionPerformed(ActionEvent e)
		{
			int fahrenheitTemp, celsiusTemp;
			String text = fahrenheit.getText();
			
			fahrenheitTemp=Integer.parseInt(text);
			celsiusTemp=(fahrenheitTemp-32)*5/9;
			
			resultLabel.setText(Integer.toString(celsiusTemp));
			
		}
		
	}
}
