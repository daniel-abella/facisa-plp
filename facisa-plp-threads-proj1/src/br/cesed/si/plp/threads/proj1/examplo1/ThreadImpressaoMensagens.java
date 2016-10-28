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
public class ThreadImpressaoMensagens implements Runnable {

	private String msg;

	public ThreadImpressaoMensagens(String msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		imprimirMsg();
	}

	private void imprimirMsg() {
		System.out.println(msg);
	}

}