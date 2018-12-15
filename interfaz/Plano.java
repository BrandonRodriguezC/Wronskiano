package interfaz;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Plano extends JPanel {
	private Constante1 constante1;

	public Plano(Constante1 constante1) {
		this.constante1 = constante1;
		init();
	}

	public void init() {
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.red);

		g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
		g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());

	}

	// y=c*x2 +c*x +c

	public void paintSQRFunc(Graphics g, String funcion) {

		for (double i = -1000; i < 1000; i++) {
			double y = constante1.evaluacion1(funcion, i);
			double xproxima = i + 1;
			double yproxima = constante1.evaluacion1(funcion, xproxima);
			g.drawLine((int) coord_x(i), (int) coord_y(y), (int) coord_x(xproxima), (int) coord_y(yproxima));

		}
	}

	private double coord_x(double x) {
		double real_x = x + this.getWidth() / 2;
		return real_x;
	}

	private double coord_y(double y) {
		double real_y = -y + this.getHeight() / 2;

		return (real_y);
	}

}