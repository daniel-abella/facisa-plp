package br.cesed.si.plp.threads.proj1.examplo5;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programação (PLP)
 * Examplo 6: Ordem de Execução
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */
public class Main {

	public static void main(String[] args) {

		Runnable contadorI = new Counter();
		Thread threadI = new Thread(contadorI);

		Runnable contadorII = new Counter();
		Thread threadII = new Thread(contadorII);

		threadI.start();
		threadII.start();

	}
}