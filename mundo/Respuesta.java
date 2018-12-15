package mundo;

public class Respuesta {
	private String respuesta;
	private double determinanteNum;

	public String define(double b[][]) {
		determinanteNum = b[0][0] * ((b[1][1] * b[2][2]) - (b[1][2] * b[2][1]))
				- b[0][1] * ((b[1][0] * b[2][2]) - (b[2][0] * b[1][2]))
				+ b[0][2] * ((b[1][0] * b[2][1]) - (b[2][0] * b[1][1]));

		if (determinanteNum == 0) {
			respuesta = "linealmente dependiente";
		} else {
			respuesta = "linealmente independiente";
		}

		return respuesta;
	}

	public double getDeterminanteNum() {
		return determinanteNum;
	}

	public void setDeterminanteNum(double determinanteNum) {
		this.determinanteNum = determinanteNum;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
