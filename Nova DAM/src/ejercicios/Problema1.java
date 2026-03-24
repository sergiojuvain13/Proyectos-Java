package ejercicios;
import javax.swing.*;
public class Problema1 extends JFrame {
	private JTextField textfield1;
	private JTextArea textarea1;
	private JScrollPane scrollpane1;
	
	public Problema1() {
		setLayout(null);
		
		textfield1=new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);
		textarea1=new JTextArea();
		scrollpane1=new JScrollPane(textarea1);
		scrollpane1.setBounds(10,50,400,300);
		textarea1.setLineWrap(true);
		textarea1.setWrapStyleWord(true);
		add(scrollpane1);
	}

	public static void main(String[] args) {
		Problema1 pov=new Problema1();
		pov.setBounds(0,0,540,400);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
