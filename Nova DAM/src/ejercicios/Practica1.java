package ejercicios;
import javax.swing.*;

public class Practica1 extends JFrame {
	// Declaramos un objeto tipo JLabel y agregamos como variable label1
	private JLabel label1;

	// Creamos un constructor, en la cual meteremos las cualidades de label1
	public Practica1() {
		setLayout(null);
		label1 = new JLabel("Hola mundo");
		label1.setBounds(10, 20, 200, 30);
		add(label1);
	}

	public static void main(String[] args) {
		// Declaramos pov para simplificar la entrada
		Practica1 pov = new Practica1();
		pov.setBounds(10, 10, 400, 300);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
