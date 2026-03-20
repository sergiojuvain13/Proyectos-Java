import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Vic extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menu;
	private JMenuItem mi1,mi2,mi3;
	public Vic() {
		setLayout(null);
		mb=new JMenuBar();
		setJMenuBar(mb);
		menu=new JMenu("Opciones");
		mb.add(menu);
		mi1=new JMenuItem("Rojo");
		mi1.addActionListener(this);
		menu.add(mi1);
		mi2=new JMenuItem("Verde");
		mi2.addActionListener(this);
		menu.add(mi2);
		mi3=new JMenuItem("Azul");
		mi3.addActionListener(this);
		menu.add(mi3);
	}
	
	public void actionPerformed(ActionEvent e) {
		Container f=this.getContentPane();
		if(e.getSource()==mi1) {
			f.setBackground(new Color(255,0,0));
		}
		if(e.getSource()==mi2) {
			f.setBackground(new Color(0,255,0));
		}
		if(e.getSource()==mi3) {
			f.setBackground(new Color(0,0,255));
		}
	}

	public static void main(String[] args) {
		Vic pov=new Vic();
		pov.setBounds(10,20,300,200);
		pov.setVisible(true);
		pov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
