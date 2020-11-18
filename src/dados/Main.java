package dados;


public class Main {

	public static void main(String[] args) {
	
		Dado dado= new Dado();
		Marcador marcador= new Marcador(dado);
		
		Thread[] hilos= new Thread[3];
		for (int i = 0; i < hilos.length; i++) {
			hilos[i] = new Thread(new Marcador(dado));
		}
		for (int i = 0; i < hilos.length; i++) {
			hilos[i].start();
		}
		for (int i = 0; i < hilos.length; i++) {
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
		
		System.out.println("En total se ha tirado el dado: "+marcador.obtenerTotal()+" veces");
	}

}
