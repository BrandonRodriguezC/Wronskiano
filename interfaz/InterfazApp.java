package interfaz;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazApp extends JFrame {
	// Atributos

	// Relaciones
	private JPannelConsola JpannelConsola;
	private JPannelFuncion JpannelFuncion;
	private JPannelMatriz JpannelMatriz;
	private Controlador ctrl;
	private Constante1 constante1;

	public static Plano plano;

	public InterfazApp(Controlador ctrl) {
		setTitle("Wronskiano"); // Titulo de la ventana
		getContentPane().setLayout(null); // Esquema de organizaci�n libre

		// Integar el controlador
		this.ctrl = ctrl;
		// Instancia los paneles
		JpannelConsola = new JPannelConsola();
		JpannelFuncion = new JPannelFuncion(ctrl);
		JpannelMatriz = new JPannelMatriz();
		constante1 = new Constante1();
		// ------------------------------------------------
		plano = new Plano(constante1);

		Ventana frame = new Ventana(ctrl);
		frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
		frame.setBounds(300, 300, 510, 600);
		frame.setLayout(new BorderLayout());

		JButton start = new JButton("Iniciar");
		start.addActionListener(frame);
		start.setText("Iniciar");

		frame.add(plano);
		frame.add(start, BorderLayout.SOUTH);

		frame.setVisible(true);
		// --------------------------------------------------
		// Ubica los paneles en el JFrame // setBounds(left, top, right, botton)
		JpannelFuncion.setBounds(10, 10, 370, 90);
		JpannelMatriz.setBounds(10, 100, 370, 130);
		JpannelConsola.setBounds(10, 230, 370, 50);

		// Organizar el panel principal. // getContentPane( ).add( panel );
		getContentPane().add(JpannelConsola);
		getContentPane().add(JpannelFuncion);
		getContentPane().add(JpannelMatriz);

		// Conecta objetos a controlar
		ctrl.conectar(JpannelMatriz, JpannelConsola, JpannelFuncion);

		// Configuraci�n del JFrame
		setSize(390, 320); // Dimensiones del JFrame
		setResizable(true); // Se evita redimensionar el JFrame

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se activa el bot�n de cerrado de la ventana

	}

	public static void main(String[] args) {
		InterfazApp frmMain = new InterfazApp(new Controlador());
		frmMain.setVisible(true);
	}

}
