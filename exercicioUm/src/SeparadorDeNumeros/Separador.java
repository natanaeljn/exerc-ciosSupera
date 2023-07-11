package SeparadorDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class Separador {

	private int totalDeNumeros;

	public Separador() {
		super();
	}

	public int getTotalDeNumeros() {
		return totalDeNumeros;
	}

	public void setTotalDeNumeros(int totalDeNumeros) {
		this.totalDeNumeros = totalDeNumeros;
	}

	public String verificador(Integer numeroTeste) {
		if (numeroTeste % 2 == 0) {
			return "par";
		} else {
			return "impar";
		}
	}

}
