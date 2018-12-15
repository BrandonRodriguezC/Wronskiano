package mundo;

public class Matriz extends Derivar {
	private MatrizConstante matrizc;
	String a[][] = new String[3][3];
	private String funcion;

	public void conectar(MatrizConstante matrizc) {
		this.matrizc = matrizc;

	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public String[][] creador(String solucionString1, String solucionString2, String solucionString3) {
		// Crea y llena la matriz
		a[0][0] = solucionString1;
		a[0][1] = solucionString2;
		a[0][2] = solucionString3;

		for (int i = 0; i < 3; i++) {
			for (int n = 1; n < 3; n++) {

				a[n][i] = derivar(a[n - 1][i]);

			}

		}
		funcion = a[0][0] + "*" + "((" + a[1][1] + "*" + a[2][2] + ")-(" + a[1][2] + "*" + a[2][1] + "))-" + a[0][1]
				+ "*((" + a[1][0] + "*" + a[2][2] + ")-(" + a[2][0] + "*" + a[1][2] + "))+" + a[0][2] + "*((" + a[1][0]
				+ "*" + a[2][1] + ")-(" + a[2][0] + "*" + a[1][1] + "))";

		return a;

	}

	// Imprime la matriz
	public String imprimir() {
		String matriz = "";
		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				matriz += a[i][n];
				matriz += "\t"+"\t";
			}
			matriz += "\n";
		}

		return matriz;
	}

	// Matriz con constantes
	public void matrizConstantes(String x1) {
		int x2 = Integer.parseInt(x1);
		matrizc.creador(a, x2);
		System.out.println(matrizc.imprimir());
	}

}
