import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Chat extends JFrame{
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JTextField input = new JTextField(50);
	TextArea text = new TextArea();
	
	public Chat() {
		super("√§∆√√¢");
		this.setLayout(new BorderLayout());
		panel2.setLayout(new FlowLayout());
		panel2.add(input);
		text.setEditable(false);
		input.addActionListener(text);
		panel1.add(text);
		this.add(text,"Center");
		this.add(panel2,"South");
		this.setSize(1600,900);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	class TextArea extends JTextArea implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String text2 = input.getText();
		    text.append(text2+"\n");
		    input.selectAll();
		    text.setCaretPosition(text.getDocument().getLength());
		}
	}
}

