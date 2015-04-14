package project8;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PrototypeEmailPanel extends JPanel
{
	JTextField to, carbonCopy, blindCarbonCopy, subject;
	JTextArea message;
	JLabel toLabel, carbonCopyLabel, blindCarbonCopyLabel, subjectLabel;
	JButton send;
	
	public PrototypeEmailPanel()
	{
		setLayout(new FlowLayout());
		setBackground(Color.gray);
		setPreferredSize(new Dimension(880,600));
		
		toLabel = new JLabel("To:");
		carbonCopyLabel = new JLabel("Cc:");
		blindCarbonCopyLabel = new JLabel("Bcc:");
		subjectLabel = new JLabel("Subject:");
		
		send = new JButton("Send");
		
		to = new JTextField();
		carbonCopy = new JTextField();
		blindCarbonCopy = new JTextField();
		subject = new JTextField();
		
		message = new JTextArea();
		message.setLineWrap(true);
		
		
		toLabel.setForeground(Color.white);
		carbonCopyLabel.setForeground(Color.white);
		blindCarbonCopyLabel.setForeground(Color.white);
		subjectLabel.setForeground(Color.white);
		
		to.setPreferredSize(new Dimension(850,25));
		carbonCopy.setPreferredSize(new Dimension(850,25));
		blindCarbonCopy.setPreferredSize(new Dimension(843,25));
		subject.setPreferredSize(new Dimension(822,25));
		message.setPreferredSize(new Dimension(873,450));
		
		SendListener sendContent = new SendListener();
		send.addActionListener(sendContent);
		
		add(toLabel);
		add(to);
		add(carbonCopyLabel);
		add(carbonCopy);
		add(blindCarbonCopyLabel);
		add(blindCarbonCopy);
		add(subjectLabel);
		add(subject);
		add(message);
		add(send);
	}
	
	private class SendListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.out.println("Congratulations, your email has been sent.");
			System.out.println("Your email is to: " + to.getText());
			System.out.println("Your email is carbon copied to: " + carbonCopy.getText());
			System.out.println("Your email is blind carbon copied to: " + blindCarbonCopy.getText());
			System.out.println("Your email's subject is: " + subject.getText());
			System.out.println("Your email's message is: " + message.getText());
			System.exit(0);
		}
	}
}
	
	