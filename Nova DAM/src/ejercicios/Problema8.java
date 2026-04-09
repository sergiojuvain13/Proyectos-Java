package ejercicios;

import javax.swing.*;
import java.awt.event.*;

public class Problema8 extends JFrame implements ActionListener {
	private JLabel label1, label2;
	private JTextField text1, text2;
	private JButton boton1;

	public Problema8() {
		setLayout(null);

		label1 = new JLabel("Usuario");
		label1.setBounds(10, 10, 150, 30);
		add(label1);

		text1 = new JTextField();
		text1.setBounds(150, 10, 150, 30);
		add(text1);

		label2 = new JLabel("Clave");
		label2.setBounds(10, 50, 150, 30);
		add(label2);

		text2 = new JTextField();
		text2.setBounds(150, 50, 150, 30);
		add(text2);

		boton1 = new JButton("Comprobar");
		boton1.setBounds(10, 100, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String usuario = "juan";
			String clave = "abc123";

			String cad1 = text1.getText();
			String cad2 = text2.getText();
			if (cad1.equals(usuario) && clave.equals(cad2)) {
				setTitle("Correcto");
			} else {
				setTitle("Incorrecto");
			}
		}
	}

	public static void main(String[] pongame10) {
		Problema8 pov = new Problema8();
		pov.setBounds(0, 0, 450, 250);
		pov.setVisible(true);
		pov.setResizable(false);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
