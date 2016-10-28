package br.cesed.si.plp.threads.proj1.examplo5;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programa��o (PLP)
 * Examplo 6: Ordem de Execu��o
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */
public class Counter implements Runnable {

	@Override
	public void run() {
		contar();
	}

	private void contar() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println("Thread: " + Thread.currentThread().getId() + " - N�mero: " + i);
		}
	}

}