package ejercicios;

import javax.swing.*;
import java.awt.event.*;

public class Problema2 extends JFrame implements ActionListener {
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1;

	public Problema2() {
		setLayout(null);
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 10, 300, 200);
		add(scrollpane1);
		boton1 = new JButton("Verificar");
		boton1.setBounds(10, 260, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			String texto = textarea1.getText().toLowerCase();
			if (texto.indexOf("java") != -1) {
				setTitle("Si contiene el texto java");
			} else {
				setTitle("No contiene el texto java");
			}
		}
	}

	public static void main(String[] args) {
		Problema2 pov =new Problema2();
		pov.setBounds(0,0,400,380);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
