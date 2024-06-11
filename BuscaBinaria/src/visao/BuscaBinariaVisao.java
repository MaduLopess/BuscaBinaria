package visao;

import negocio.BuscaBinariaNegocio;

public class BuscaBinariaVisao {

	public static void mostrarResultado(int numeroParaEncontrar, int resultado) {
		if (resultado == -1) {
			System.out.println("Elemento " + numeroParaEncontrar + " não encontrado");
		} else {
			System.out.println("Elemento " + numeroParaEncontrar + " encontrado no índice " + resultado+ ".");
		}
	}

	public static void main(String[] args) {

		int[] array = { 54, 26, 93, 17, 77, 31, 44, 55, 20, 65 };
		int numeroParaEncontrar = 93;

		BuscaBinariaNegocio negocio = new BuscaBinariaNegocio();
		negocio.buscar(array, numeroParaEncontrar);

	}
}
