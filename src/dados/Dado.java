package dados;

public class Dado {
	
	 int tiradas[]= {0,0,0,0,0,0};

	public int obtenerFinal() {
		int numero=0;
		for (int i = 0; i < tiradas.length; i++) {
			numero+=tiradas[i];
			
		}
		return numero;
	}

	public int[] getDado() {
		// TODO Auto-generated method stub
		return tiradas;
	}

	
	

}
