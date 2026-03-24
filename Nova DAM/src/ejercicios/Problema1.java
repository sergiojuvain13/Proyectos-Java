/**
 * Autor: @author sergiojuvain13
 * Fecha: 24 de marzo de 2026
 * * Descripción:
 * Este ejercicio demuestra la diferencia entre JTextField (entrada de una línea) 
 * y JTextArea (entrada multilínea). Se implementa un JScrollPane para manejar 
 * el área de texto y se activan las propiedades LineWrap y WrapStyleWord para 
 * evitar el scroll horizontal y mejorar la experiencia de usuario.
 */
package ejercicios;

//Importamos la biblioteca
import javax.swing.*;

public class Problema1 extends JFrame {
	// Llamamos y nombramos a las funciones a utilizar
	private JTextField textfield1;
	private JTextArea textarea1;
	private JScrollPane scrollpane1;

	// Añadimos un constructor
	public Problema1() {
		setLayout(null);
		textfield1 = new JTextField();
		textfield1.setBounds(10, 10, 200, 30);
		add(textfield1);
		textarea1 = new JTextArea();
		//En esta parte ponemos a textarea1 dentro de scrollpane1
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 50, 400, 300);
		textarea1.setLineWrap(true);//El texto baja al llegar al borde
		textarea1.setWrapStyleWord(true);//El salto es entre palabras, no en letras
		add(scrollpane1);
	}
	
	public static void main(String[] args) {
		Problema1 pov = new Problema1();
		pov.setBounds(0, 0, 540, 400);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
