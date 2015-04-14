package programmingProjects;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PP68Panel extends JPanel 
{
	private JTextField to;
	private JTextField cc;
	private JTextField bcc;
	private JTextField subject;
	private JTextField message;
	private JButton send;
	private JLabel tol;
	private JLabel ccc;
	private JLabel bccc;
	private JLabel subjectt;
	private JLabel messagee;
	
	public PP68Panel()
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		to = new JTextField(1);
		cc = new JTextField(1);
		bcc = new JTextField(1);
		subject = new JTextField(1);
		message = new JTextField(1);
		tol = new JLabel("To:");
		ccc = new JLabel("CC:");
		bccc = new JLabel("BCC:");
		subjectt = new JLabel("Subject:");
		messagee = new JLabel("Message:");
		send = new JButton("Send");
		send.addActionListener(new Listener());
		add(tol);
		add(to);
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(ccc);
		add(cc);
		add(Box.createRigidArea(new Dimension(00, 10)));
		add(bccc);
		add(bcc);
		add(Box.createRigidArea(new Dimension(00, 10)));
		add(subjectt);
		add(subject);
		add(Box.createRigidArea(new Dimension(00, 10)));
		add(messagee);
		add(message);
		add(send);
		
		setPreferredSize(new Dimension(400, 100));
		
	}
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String text = message.getText();
			System.out.println(text);
		}
	}

}
