package ar.edu.unlam.pb2.Dado;
// prueba commit git
public class Dado {
	private Integer caras;

	public Dado() {
		
	}

	public Integer lanzarDado() {
		for (int i = 0; i < this.caras; i++) {
			Integer caras = (int) Math.floor(Math.random() * 6 + 1);

		}
		return caras;
	}
}
