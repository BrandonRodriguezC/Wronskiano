package mundo;

public class MatrizConstante {
	private Respuesta respuesta;
	private Constante constante;

	double b[][] = new double[3][3];

	public MatrizConstante(Respuesta respuesta, Constante constante) {
		this.respuesta = respuesta;
		this.constante = constante;
	}

	public void creador(String a[][], int x1) {
		// Crea y llena la matriz
		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				b[n][i] = constante.evaluacion(a[n][i], x1);
			}
		}
	}

	public String imprimir() {
		String matriz = "";
		for (int i = 0; i < 3; i++) {
			for (int n = 0; n < 3; n++) {
				matriz += b[i][n];
				matriz += "\t";
			}
			matriz += "\n";
		}
		respuesta.define(b);
		return matriz;
	}

}
