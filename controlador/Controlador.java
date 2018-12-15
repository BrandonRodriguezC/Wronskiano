package controlador;

import interfaz.JPannelMatriz;
import mundo.*;
import interfaz.*;

public class Controlador {

	private Matriz matriz;
	private Respuesta respuesta;
	private JPannelMatriz JpannelMatriz;
	private JPannelConsola JpannelConsola;
	private JPannelFuncion JpannelFuncion;
	private MatrizConstante matrizc;
	private Constante constante;
	String matrizString;

	public Controlador() {

		matriz = new Matriz();
		respuesta = new Respuesta();
		constante = new Constante();
		matrizc = new MatrizConstante(respuesta, constante);
		matriz.conectar(matrizc);
		matrizString = "";
	}

	public void conectar(JPannelMatriz JpannelMatriz, JPannelConsola JpannelConsola, JPannelFuncion JpannelFuncion) {

		this.JpannelMatriz = JpannelMatriz;
		this.JpannelFuncion = JpannelFuncion;
		this.JpannelConsola = JpannelConsola;

	}

	public void matriz(String solucionString1, String solucionString2, String solucionString3) {

		matriz.creador(solucionString1, solucionString2, solucionString3);
		matrizString = matriz.imprimir();
		System.out.println(matrizString);
		matriz.matrizConstantes(JpannelFuncion.getValorString());
		JpannelMatriz.setMatriz1(matrizString);
		JpannelMatriz.setDeterminante(respuesta.getDeterminanteNum());
		JpannelMatriz.setTexto("El determinante esta siendo evaluado con x=" + JpannelFuncion.getValorString());
		JpannelConsola.setResultado("El conjunto de soluciones es " + respuesta.getRespuesta());
	}

	public String funcion() {
		return matriz.getFuncion();
	}

}
