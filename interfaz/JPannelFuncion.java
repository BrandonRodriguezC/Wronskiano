package interfaz;

import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import controlador.Controlador;

public class JPannelFuncion extends JPanel implements ActionListener {
	// Atributos
	private JTextField solucion1, solucion2, solucion3, valor;
	private JButton ejecutar;
	private JLabel texto;
	private String solucionString1, solucionString2, solucionString3, valorString;
	// Relaciones
	private Controlador ctrl;

	/**
	 * Constructor
	 */
	public JPannelFuncion(Controlador ctrl) {
		// ..............................................( T, L, B, R
		// ).............................................
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder(" Soluciones de la funcion ")));

		setLayout(null); // Esquema de organizaci�n libre
		this.ctrl = ctrl;

		// Instancia atributos de la clase
		solucion1 = new JTextField();
		solucion2 = new JTextField();
		solucion3 = new JTextField();
		texto = new JLabel("El wronskiano se evaluara en x=");
		valor = new JTextField();
		ejecutar = new JButton("Ejecutar");
		// Agrega el listener a cada objeto en caso de ser necesario
		ejecutar.addActionListener(this);

		// Agrega los actionCommand // objeto.setActionCommand("????");

		// Ubica los controles en el JPanel // setBounds(left, top, right, botton)
		solucion1.setBounds(10, 15, 80, 30);
		solucion2.setBounds(100, 15, 80, 30);
		solucion3.setBounds(190, 15, 80, 30);
		texto.setBounds(10, 55, 220, 30);
		valor.setBounds(230, 55, 80, 30);
		ejecutar.setBounds(280, 15, 80, 30);
		// Agrega los controles al panel // add( control );

		add(solucion1);
		add(solucion2);
		add(solucion3);
		add(ejecutar);
		add(valor);
		add(texto);
	}

	// Metodos de la interfaz ActionListener
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ejecutar")) {
			valorString = valor.getText();
			solucionString1 = solucion1.getText();
			solucionString2 = solucion2.getText();
			solucionString3 = solucion3.getText();

			ctrl.matriz(solucionString1, solucionString2, solucionString3);

		}
	}

	public String getValorString() {

		return valorString;
	}

	public void setValorString(String valorString) {
		this.valorString = valorString;
	}

}