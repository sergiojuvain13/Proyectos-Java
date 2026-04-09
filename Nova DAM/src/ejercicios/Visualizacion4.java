package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visualizacion4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizacion4 frame = new Visualizacion4();
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
	public Visualizacion4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Compuerta 1");
		lblNewLabel.setBounds(128, 30, 119, 19);
		contentPane.add(lblNewLabel);

		JLabel lblCompuerta = new JLabel("Compuerta 2");
		lblCompuerta.setBounds(128, 68, 119, 19);
		contentPane.add(lblCompuerta);

		JLabel lblCompuerta_1 = new JLabel("Compuerta 3");
		lblCompuerta_1.setBounds(128, 107, 119, 19);
		contentPane.add(lblCompuerta_1);

		JLabel label1 = new JLabel("resultado");
		label1.setBounds(218, 172, 68, 16);
		contentPane.add(label1);

		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(21, 30, 68, 20);
		contentPane.add(spinner1);

		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(21, 68, 68, 20);
		contentPane.add(spinner2);

		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(21, 107, 68, 20);
		contentPane.add(spinner3);
		
		JButton boton1 = new JButton("Actualizar Caudal");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == boton1) {
					try {
						int x1 = (Integer) spinner1.getValue();
						int x2 = (Integer) spinner2.getValue();
						int x3 = (Integer) spinner3.getValue();

						int suma = x1 + x2 + x3;
						
						if (suma<=100) {
							label1.setText("Bajo");
						} else if (suma<=200) {
							label1.setText("Medio");
						} else {
							label1.setText("Alto");
						}
					} catch (Exception ex) {
			            label1.setText("Error inesperado");
			        }

				}
			}
		});
		boton1.setBounds(24, 170, 168, 20);
		contentPane.add(boton1);

		
		;

	}
}
