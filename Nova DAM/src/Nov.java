import javax.swing.*;
import java.awt.event.*;
public class Nov extends JFrame implements ActionListener{
	private JLabel label1,label2;
	private JTextField textfield1;
	private JComboBox<String> combo1;
	private JButton boton1;
	
	public Nov() {
		setLayout(null);
		label1=new JLabel("Nombre:");
		label1.setBounds(10,10,100,20);
		add(label1);
		textfield1=new JTextField();
		textfield1.setBounds(60,10,100,30);
		add(textfield1);
		label2=new JLabel("Pais:");
		label2.setBounds(10,50,30,50);
		add(label2);
		combo1=new JComboBox<String>();
		combo1.setBounds(50,60,100,30);
		combo1.addItem("Peru");
		combo1.addItem("Bolivia");
		combo1.addItem("Ecuador");
		add(combo1);
		boton1=new JButton("Aceptar");
		boton1.setBounds(80,150,160,48);
		boton1.addActionListener(this);
		add(boton1);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String nombre=textfield1.getText();
			String pais=(String)combo1.getSelectedItem();
			String cadena= nombre+" "+pais;
			setTitle(cadena);
			
		}
	}

	public static void main(String[] args) {
		Nov pov = new Nov();
		pov.setBounds(0,0,600,300);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
