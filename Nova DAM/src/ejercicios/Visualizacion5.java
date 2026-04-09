package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.DefaultComboBoxModel;

public class Visualizacion5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualizacion5 frame = new Visualizacion5();
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
	public Visualizacion5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dinero a extraer");
		lblNewLabel.setBounds(30, 33, 118, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta");
		lblTipoDeCuenta.setBounds(173, 33, 111, 21);
		contentPane.add(lblTipoDeCuenta);
		
		JLabel label1 = new JLabel("Resultado");
		label1.setBounds(154, 181, 272, 16);
		contentPane.add(label1);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"0", "50", "150", "200", "250", "300", "350", "400", "450", "500", "1000"}));
		comboBox1.setBounds(30, 64, 79, 20);
		contentPane.add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"Caja de ahorro", "Cuenta Corriente"}));
		comboBox2.setBounds(173, 64, 128, 20);
		contentPane.add(comboBox2);

		
		JButton boton1 = new JButton("Extraer");

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==boton1) {
					int x1=Integer.parseInt(comboBox1.getSelectedItem().toString());					
					String cad1= (String)comboBox2.getSelectedItem().toString();
					
					if(cad1.equals("Caja de ahorro")) {
						if(x1<=200) {
							label1.setText("Retiro exitoso!");
						}else {
							label1.setText("No se puede retirar mas de 200!");
						}
					} else if (cad1.equals("Cuenta Corriente")) {
						if (x1<=500) {
							label1.setText("Retiro exitoso!");
						} else {
							label1.setText("No se puede retirar mas de 500!");
						}
					} else {
						label1.setText("Pon datos correctos");
					}
				}
			}
		});
		boton1.setBounds(36,178,89,23);
		getContentPane().add(boton1);

	}
}
