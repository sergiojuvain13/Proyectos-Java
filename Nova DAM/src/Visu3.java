import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Visu3 extends JFrame implements ActionListener{
	private JTextField textfield1, textfield2;
	private JLabel label1,label2;
	private JButton boton1, boton2 ;
	
	public Visu3() {
		setLayout(null);
		label1= new JLabel("Num1");
		label1.setBounds(10,10,50,20);
		add(label1);
		
		label2= new JLabel("Num2");
		label2.setBounds(10,30,50,20);
		add(label2);
		
		textfield1=new JTextField();
		textfield1.setBounds(60,10,50,20);
		add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBounds(60,30,50,20);
		add(textfield2);
		
		boton1=new JButton("Aplicar");
		boton1.setBounds(60,80,80,20);
		boton1.addActionListener(this);
		add(boton1);
		
		boton2=new JButton("Terminar");
		boton2.setBounds(150,80,90,20);
		boton2.addActionListener(this);
		add(boton2);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String cad1=textfield1.getText();
			int x1=Integer.parseInt(cad1);
			String cad2=textfield2.getText();
			int x2=Integer.parseInt(cad2);
			setSize(x1,x2);
		}
		if(e.getSource()==boton2) {
			System.exit(0);
		}
	}
	

	public static void main(String[] args) {
		Visu3 pov=new Visu3();
		pov.setBounds(0,0,300,200);
		pov.setVisible(true);
		pov.setResizable(false);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
