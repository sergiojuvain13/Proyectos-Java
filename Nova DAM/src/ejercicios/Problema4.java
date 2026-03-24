package ejercicios;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Problema4 extends JFrame implements ActionListener,ChangeListener{
	private JLabel label1;
	private JCheckBox check1;
	private JButton boton1;
	
	public Problema4() {
		setLayout(null);
		label1=new JLabel("Estas de acuerdo con las normas del servicio?");
		label1.setBounds(10,10,400,30);
		add(label1);
		check1=new JCheckBox("Acepto");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);
		boton1=new JButton("Sí");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
	}
	
	public void stateChanged(ChangeEvent e) {
		if(check1.isSelected()==true) {
			boton1.setEnabled(true);
		}else{
			boton1.setEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Problema4 pov=new Problema4();
		pov.setBounds(0,0,600,600);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}





