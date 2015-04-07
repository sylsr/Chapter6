package bookExamples;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SliderPanel extends JPanel
{
	JPanel panel = new JPanel();
	JSlider firstSlider = new JSlider();
	ChangeListener listener;
	public SliderPanel()
	{
		firstSlider.addChangeListener(listener);
	}
	public void stateChanged(ChangeListener e)
	{
		
	}
}
