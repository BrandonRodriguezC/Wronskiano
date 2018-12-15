package mundo;

import org.lsmp.djep.djep.*;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public abstract class Derivar {

	public String derivar(String funcion) {
		String derivada = "";
		DJep derivar = new DJep();
		derivar.addStandardConstants();
		derivar.addStandardFunctions();
		derivar.addComplex();
		derivar.setAllowUndeclared(true);
		derivar.setAllowAssignment(true);
		derivar.setImplicitMul(true);
		derivar.addStandardDiffRules();

		try {
			Node node = derivar.parse(funcion);
			Node diff = derivar.differentiate(node, "x");
			Node sim = derivar.simplify(diff);
			derivada = derivar.toString(sim);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return derivada;
	}
}
