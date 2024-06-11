package modelagem;

public class BuscaBinariaModelo {
	public static int buscaBinaria(int[] array, int elemento) {
		int inicio = 0;
		int fim = array.length - 1;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			if (array[meio] == elemento) {
				return meio;
			}
			if (array[meio] < elemento) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return -1;
	}
}
