package ejercicios;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Visualizacion10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizacion10 frame = new Visualizacion10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Visualizacion10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Partido 1:");
		label1.setBounds(61, 44, 71, 18);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Partido 2:");
		label2.setBounds(61, 72, 71, 18);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Partido 3:");
		label3.setBounds(61, 100, 71, 18);
		contentPane.add(label3);
		
		textField = new JTextField();
		textField.setBounds(129, 44, 96, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 72, 96, 18);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 100, 96, 18);
		contentPane.add(textField_2);
		
		JButton boton1 = new JButton("Graficar");
		boton1.setBounds(77, 163, 113, 47);
		contentPane.add(boton1);

	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.red);
		g.drawString("Primer partido: ", , ABORT);
		
		
	}
}























