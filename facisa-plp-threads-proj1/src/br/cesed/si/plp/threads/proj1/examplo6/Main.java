package br.cesed.si.plp.threads.proj1.examplo6;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programação (PLP)
 * Examplo 7: Sincronização
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */
public class Main implements Runnable {

	private static int total = 0;
	private static int incremento = 1;

	public static void main(String[] args) {
		new Thread(new Main()).start();
		new Thread(new Main()).start();
		new Thread(new Main()).start();
		new Thread(new Main()).start();
		new Thread(new Main()).start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized (Main.class) {
				total += incremento;
				incremento++;
				System.out.println(total + "-" + incremento);
			}
		}
	}
}