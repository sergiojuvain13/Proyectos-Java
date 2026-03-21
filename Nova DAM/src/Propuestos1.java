/**
 * Ejercicio Propuesto 1: Creación de ventana de 1024x800.
 * * @author sergiojuvain13
 * @version 1.0
 */
//Importamos la biblioteca gráfica
import javax.swing.*;

//Creamos la clase y lo heredamos de JFrame
public class Propuestos1 extends JFrame {

	// Creamos un contructor y
	// deshabilitamos el gestor de diseño automático
	public Propuestos1() {
		setLayout(null);
	}

	public static void main(String[] args) {
		Propuestos1 pov = new Propuestos1();
		// Agregamos las medidas solicitadas
		pov.setBounds(0, 0, 1024, 800);
		pov.setVisible(true);
		pov.setResizable(false); // Evitamos que el operador la lie
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
