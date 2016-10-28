package br.cesed.si.plp.threads.proj1.examplo2;
import java.io.File;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programação (PLP)
 * Examplo 2: Deadlock
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */
public class Main {

	static File arquivo1 = new File("arquivo1");
	static File arquivo2 = new File("arquivo2");

	public static void main(String[] args) {

		// SE ALTERARMOS A ORDEM DAS INSTÂNCIAS EM QUALQUER UM DOS BLOCOS
		// SYNCRONIZED, TEREMOS UM DEADLOCK

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (arquivo1) {
					System.out.println("Pegou arquivo 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (arquivo2) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("Pegou arquivo 2");
					}
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (arquivo1) {
					System.out.println("Pegou arquivo 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (arquivo2) {
						System.out.println("Pegou arquivo 2");
					}
				}
			}
		}).start();
	}
}