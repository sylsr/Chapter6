package PP6_8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Mail extends JPanel
{
	private JLabel to, cc, bcc, subject, message;
	private TextField toAddress, ccAddress, bccAddress, subjectField;
	private TextArea messageField;
	private JButton send;
	JPanel top, bottom;
	
	public Mail()
	{
		top = new JPanel();
		bottom=new JPanel();
		setLayout(new GridLayout(2,1));
		
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
		
		top.add(message);
		top.add(messageField);
		bottom.add(to);
		bottom.add(toAddress);
		bottom.add(cc);
		bottom.add(ccAddress);
		bottom.add(bcc);
		bottom.add(bccAddress);
		bottom.add(subject);
		bottom.add(subjectField);
		bottom.add(send);
		add(top);
		add(bottom);
		
		
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(500,275));
	}
	
	private class ButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
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
