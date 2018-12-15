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

public class JPannelConsola extends JPanel implements ActionListener {
	// Atributos
	private JLabel resultado;
	// Relaciones

	/**
	 * Constructor
	 */
	public JPannelConsola() {
		// ..............................................( T, L, B, R
		// ).............................................
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder(" Consola ")));

		setLayout(null); // Esquema de organizaci�n libre

		// Instancia atributos de la clase
		resultado = new JLabel();
		// Agrega el listener a cada objeto en caso de ser necesario

		// Agrega los actionCommand // objeto.setActionCommand("????");

		// Ubica los controles en el JPanel // setBounds(left, top, right, botton)
		resultado.setBounds(10, 10, 350, 30);
		// Agrega los controles al panel // add( control );
		add(resultado);
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(String resultado1) {
		resultado.setText(resultado1);
	}

	// Metodos de la interfaz ActionListener
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("????")) {
		}
	}

}