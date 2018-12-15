package interfaz;

import java.awt.BorderLayout;
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

public class JPannelMatriz extends JPanel implements ActionListener {
	// Atributos
	private JLabel texto, determinante, igual;
	private JTextArea matriz1;
	private JScrollPane scroll;
	// Relaciones

	/**
	 * Constructor
	 */
	public JPannelMatriz() {
		// ..............................................( T, L, B, R
		// ).............................................
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder(" Matriz y determinante ")));

		setLayout(null); // Esquema de organizaci�n libre

		// Instancia atributos de la clase
		scroll = new JScrollPane(matriz1);
		matriz1 = new JTextArea();
		texto = new JLabel(); // JTextArea
		igual = new JLabel("=");
		determinante = new JLabel();
		// Agrega el listener a cada objeto en caso de ser necesario

		// Agrega los actionCommand // objeto.setActionCommand("????");

		// Ubica los controles en el JPanel // setBounds(left, top, right, botton)
		matriz1.setBounds(10, 30, 260, 50);
		texto.setBounds(10, 90, 300, 30);
		igual.setBounds(280, 60, 30, 10);
		determinante.setBounds(320, 50, 40, 30);
		matriz1.setEditable(false);
		// Agrega los controles al panel // add( control );
		add(matriz1);
		add(igual);
		add(determinante);
		add(texto);
		
		
		//this.add(textArea); // get rid of this
	add(scroll, BorderLayout.CENTER);
	}
	
	


	public JTextArea getMatriz1() {
		return matriz1;
	}

	public void setMatriz1(String matrizString) {
		matriz1.setText(matrizString);
	}

	public JLabel getDeterminante() {
		return determinante;
	}

	public void setDeterminante(double determinante1) {

		String determinante2 = String.valueOf(determinante1);
		determinante.setText(determinante2);
	}

	public JLabel getTexto() {
		return texto;
	}

	public void setTexto(String texto1) {
		texto.setText(texto1);
	}

	// Metodos de la interfaz ActionListener
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("????")) {
		}
	}

}