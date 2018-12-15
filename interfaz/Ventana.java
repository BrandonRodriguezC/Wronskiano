package interfaz;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import interfaz.InterfazApp;
import controlador.Controlador;

public class Ventana extends JFrame implements ActionListener {
	private Controlador ctrl;

	public Ventana(Controlador ctrl) {
		this.ctrl = ctrl;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String funcion = ctrl.funcion();
		InterfazApp.plano.paintSQRFunc(InterfazApp.plano.getGraphics(), funcion);
	}

}