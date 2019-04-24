package ar.edu.unlam.pb2.Dado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DadoTest {

	@Test
	public void verificarNumeroLanzado() {
		Dado miDado=new Dado();
		Integer obtenido =miDado.lanzarDado(); 
		Integer esperado=6;
	    assertEquals(esperado,obtenido);
					
	}

}
