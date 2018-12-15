package mundo;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;
//import org.mariuszgromada.math.mxparser.mXparser;

public class Constante {

	public double evaluacion(String funcion, int x1) {
		String valor = "x=" + x1;
		Argument x = new Argument(valor);
		Expression ecuacion = new Expression(funcion, x);
		double resultado = ecuacion.calculate();

		return resultado;
		// mXparser.consolePrintln(e14.getExpressionString() + " = " +resultado );
		// System.out.println("\n");

	}

}
