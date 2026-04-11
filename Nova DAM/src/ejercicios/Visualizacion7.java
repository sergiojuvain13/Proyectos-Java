package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visualizacion7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int columna,fila;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizacion7 frame = new Visualizacion7();
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
	public Visualizacion7() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("Izquierda");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				columna= columna-10;
				repaint();
			}
			
		});
		boton1.setBounds(134, 221, 94, 20);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Derecha");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				columna= columna+10;
				repaint();
				
			}
		});
		boton2.setBounds(588, 221, 84, 20);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("Arriba");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fila=fila-10;
				repaint();
			}
		});
		boton3.setBounds(359, 36, 84, 20);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("Abajo");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fila=fila+10;
				repaint();
			}
		});
		boton4.setBounds(359, 400, 84, 20);
		contentPane.add(boton4);
		columna=347;
		fila=200;

	}
	
	public void paint (Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.fillOval(columna,fila,130,120);
			
	}
}
