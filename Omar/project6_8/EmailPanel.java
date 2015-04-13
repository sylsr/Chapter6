package project6_8;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class EmailPanel extends JPanel
{
	private JLabel to, cc, bcc, subject, message;
	private TextField toAddress, ccAddress, bccAddress, subjectField;
	private TextArea messageField;
	private JButton send;
	
	public EmailPanel()
	{
		to = new JLabel("To: ");
		cc = new JLabel("Cc: ");
		bcc = new JLabel("Bcc: ");
		subject = new JLabel("Subject: ");
		message = new JLabel("Message: ");
		send = new JButton("Send");
		
		toAddress = new TextField(20);
		ccAddress = new TextField(20);
		bccAddress = new TextField(20);
		subjectField = new TextField(30);
		messageField = new TextArea();
		
		send.addActionListener(new ButtonListener());
		
		add(to);
		add(toAddress);
		add(cc);
		add(ccAddress);
		add(bcc);
		add(bccAddress);
		add(subject);
		add(subjectField);
		add(message);
		add(messageField);
		add(send);
		
		setBackground(Color.gray);
		setPreferredSize(new Dimension(500,300));
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String toText, ccText, bccText, subjectText, messageText;
			toText = toAddress.getText();
			ccText = ccAddress.getText();
			bccText = ccAddress.getText();
			subjectText = subjectField.getText();
			messageText = messageField.getText();
			
			System.out.println("To: " + toText + "\nCc: " + ccText + "\nBcc: " + bccText + "\nSubject: " + subjectText +
					"\nMessage: " + messageText);
		}
	}
}
