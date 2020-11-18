package dados;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Random;

public class Marcador implements Runnable {
	private Dado dado;
	VarHandle varHandle;

	public Marcador(Dado dado) {

		this.dado = dado;
	}

	@Override
	public void run() {

		varHandle = MethodHandles.arrayElementVarHandle(int[].class);
		for (int i = 0; i < 10000; i++) {

			varHandle.getAndAdd(dado.getDado(), new Random().nextInt(6), 1);

		}

	}

	public int obtenerTotal() {
		varHandle = MethodHandles.arrayElementVarHandle(int[].class);
		int numero = 0;
		for (int i = 0; i < dado.getDado().length; i++) {

			numero += (int) varHandle.get(dado.tiradas, i);


		}
		return numero;
	}

}
