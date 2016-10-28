package br.cesed.si.plp.threads.proj1.examplo1;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programação (PLP)
 * Examplo 1: Criação de Threads
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */
public class Main {

	public static void main(String[] args) {

		Runnable runnableI = new ThreadImpressaoMensagens("Olá");
		Runnable runnableII = new ThreadImpressaoMensagens("Opa");

		Thread threadI = new Thread(runnableI);
		Thread threadII = new Thread(runnableII);

		threadI.start();
		threadII.start();
	}
}