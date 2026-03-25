package ejercicios;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*; 

public class Problema7 extends JFrame implements ActionListener, ChangeListener	{
	private JTextField textfield1, textfield2;
	private JRadioButton radio1, radio2;
	private ButtonGroup grupo;
	private JButton boton1;

	public Problema7() {
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10, 10, 100, 30);
		add(textfield1);
		textfield2 = new JTextField();
		textfield2.setBounds(10, 50, 100, 30);
		add(textfield2);
		
		grupo=new ButtonGroup();
		
		radio1 = new JRadioButton("Sumar");
		radio1.setBounds(10, 90, 100, 30);
		radio1.addChangeListener(this);
		add(radio1);
		grupo.add(radio1);
		
		radio2 = new JRadioButton("Restar");
		radio2.setBounds(10, 130, 100, 30);
		radio2.addChangeListener(this);
		add(radio2);
		grupo.add(radio2);
		
		boton1 = new JButton("Operar");
		boton1.setBounds(10, 220, 100, 30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			try {
				int val1=Integer.parseInt(textfield1.getText());
				int val2=Integer.parseInt(textfield2.getText());
				int resultado=0;
				
				if (radio1.isSelected()) {
					resultado=val1+val2;
				} else if (radio2.isSelected()) {
					resultado=val1-val2;
				}
				setTitle("Resultado "+resultado);
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(this,"Por favor, ingresa numero validos.");
			}
		}
	}
	
	public void stateChanged(ChangeEvent e	) {
		if(radio1.isSelected() || radio2.isSelected()) {
			boton1.setEnabled(true);
		}
	}
		

	public static void main(String[] args) {
		Problema7 pov = new Problema7();
		pov.setBounds(0, 0, 300, 400);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
