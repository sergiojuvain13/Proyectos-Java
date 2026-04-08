package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visualizacion2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel l1,l2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizacion2 frame = new Visualizacion2();
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
	public Visualizacion2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1 = new JLabel("1");
		l1.setBounds(258, 55, 44, 12);
		contentPane.add(l1);
		
		l2 = new JLabel("Parado");
		l2.setBounds(258, 89, 92, 12);
		contentPane.add(l2);
		
		JLabel lblNewLabel = new JLabel("Piso");
		lblNewLabel.setBounds(173, 55, 57, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(173, 89, 57, 12);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual=Integer.parseInt(l1.getText());
				if(4>pisoactual) {
					l1.setText("4");
					l2.setText("Bajar");					
				}else {
					l1.setText("4");
					l2.setText("Piso actual");
				}
			}
		});
		btnNewButton.setBounds(33, 41, 57, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual=Integer.parseInt(l1.getText());
				if(3<pisoactual || 3>pisoactual) {
					l1.setText("3");
					l2.setText("Subir/Bajar");
				}else {
					l1.setText("3");
					l2.setText("Piso actual");
					
				}
			}
		});
		btnNewButton_1.setBounds(33, 85, 57, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual=Integer.parseInt(l1.getText());
				if(2<pisoactual || 2>pisoactual) {
					l1.setText("2");	
					l2.setText("Subir/Bajar");
				}else {
					l2.setText("Piso actual");
					l1.setText("2");					
				}
			}
		});
		btnNewButton_2.setBounds(33, 135, 57, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual=Integer.parseInt(l1.getText());
				if (1<pisoactual) {
					l2.setText("Subir");
					l1.setText("1");
				}
				else {
					l2.setText("Piso actual");
					l1.setText("1");
				}
			}
		});
		btnNewButton_3.setBounds(33, 185, 57, 40);
		contentPane.add(btnNewButton_3);
		
		

	}
}
