package br.cesed.si.plp.threads.proj1.examplo4;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programação (PLP)
 * Examplo 5: Modificador Volatile
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */

public class Main implements Runnable {

	// RESOLVE O PROBLEMA DE CACHE DAS VARIÁVEIS ESTÁTICAS, NAS THREADS
	private volatile static double total = 1;

	public static void main(String[] args) {
		new Thread(new Main()).start();
		new Thread(new Main()).start();
		new Thread(new Main()).start();
		new Thread(new Main()).start();
		new Thread(new Main()).start();

	}

	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			total = total * 1.5;
			System.out.println(total);
		}
	}

}