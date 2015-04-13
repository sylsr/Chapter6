package bookExamples;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class JukeBoxControls extends JPanel
{
	private JComboBox musicCombo;
	private JButton stopButton, playButton;
	private AudioClip[] music;
	private AudioClip current;
	public JukeBoxControls()
	{
		URL url1, url2, url3, url4, url5, url6;
		url1=url2=url3=url4=url5=url5=url6=null;
		try
		{
			url1= new URL("file", "localhost", "westernBeat.wav");
			url2= new URL("file", "localhost", "classical.wav");
			url3= new URL("file", "localhost", "jeopardy.au");
			url4= new URL("file", "localhost", "newAgeRythm.wav");
			url5= new URL("file", "localhost", "eightiesJam.wav");
			url6= new URL("file", "localhost", "hitchcock.wav");
		}
		catch(Exception e){}
		music = new AudioClip[7];
		music[0]=null;
		music[1] = JApplet.newAudioClip(url1);
		music[2] = JApplet.newAudioClip(url2);
		music[3] = JApplet.newAudioClip(url3);
		music[4] = JApplet.newAudioClip(url4);
		music[5] = JApplet.newAudioClip(url5);
		music[6] = JApplet.newAudioClip(url6);
		
		String[] musicNames = {"Make a Selection...", "Western Beat", "Classical Melody", "Jeopardy Theme", "New Age Rythm", "Eighties Jam", "Alfred Hitchcock's Theme"};
		
		musicCombo = new JComboBox (musicNames);
		musicCombo.setBackground(Color.cyan);
		
		playButton = new JButton("Play", new ImageIcon ("play.gif"));
		playButton.setBackground(Color.cyan);
		
		stopButton= new JButton("Stop", new ImageIcon ("Stop.gif"));
		stopButton.setBackground(Color.cyan);
		
		setPreferredSize(new Dimension(250,100));
		setBackground(Color.cyan);
		add(musicCombo);
		add(playButton);
		add(stopButton);
		current= null;
		
	}
	private class ComboListener implements ActionListener
	{
		public void actoinPerformed(ActionEvent event)
		{
			if(current !=null)
			{
				current.stop();
			}
			current = music[musicCombo.getSelectedIndex()];
		}

		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		
		{
			if(current!=null)
			{
				current.stop();
			}
			if(event.getSource()==playButton)
			{
				if(current!=null)
				{
					current.play();
				}
			}
		}
	}
}
