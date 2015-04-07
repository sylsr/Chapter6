package bookExamples;

import javax.swing.JFrame;

public class PracticeSlider
{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Sliders");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new SliderPanel());
		
		frame.pack();
		

	}

}
