package PP6_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonCounter extends JPanel
{
	Random rand = new Random();
	JButton countingButton;
	JLabel timesPressed;
	public ButtonCounter()
	{
		countingButton=new JButton("Count");
		timesPressed=new JLabel("0");
		countingButton.addActionListener(new ButtonListener());
		add(countingButton);
		add(timesPressed);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int randomNumber=rand.nextInt(99)+1;
			timesPressed.setText(""+randomNumber);
			repaint();
		}
	}
	
}
