package ejercicios;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Problema5 extends JFrame implements ActionListener, ChangeListener {
	private JLabel label1;
	private JCheckBox check1, check2, check3;
	private JButton boton1;

	public Problema5() {
		setLayout(null);
		label1 = new JLabel("Navegadores web: ");
		label1.setBounds(10, 10, 180, 30);
		add(label1);
		check1 = new JCheckBox("www.google.com");
		check1.setBounds(10, 50, 180, 30);
		check1.addChangeListener(this);
		add(check1);
		check2 = new JCheckBox("www.yahoo.com");
		check2.setBounds(10, 90, 180, 30);
		check2.addChangeListener(this);
		add(check2);
		check3 = new JCheckBox("www.eclipse.com");
		check3.setBounds(10, 130, 180, 30);
		check3.addChangeListener(this);
		add(check3);
		boton1 = new JButton("Seleccionar");
		boton1.setBounds(50, 200, 100, 30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
	        String seleccion = "Seleccionado: ";
	        if (check1.isSelected()) seleccion += "Google ";
	        if (check2.isSelected()) seleccion += "Yahoo ";
	        if (check3.isSelected()) seleccion += "Eclipse ";
	        setTitle(seleccion);
	    }
		}

	public void stateChanged(ChangeEvent e) {
		boton1.setEnabled(check1.isSelected() || check2.isSelected() || check3.isSelected());

	}

	public static void main(String[] args) {
		Problema5 pov = new Problema5();
		pov.setBounds(0, 0, 400, 300);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
