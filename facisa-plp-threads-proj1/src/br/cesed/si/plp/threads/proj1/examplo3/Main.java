package br.cesed.si.plp.threads.proj1.examplo3;

import java.util.Properties;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programação (PLP)
 * Examplo 4: Exceptions
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */
public class Main {

	Properties p1;
	Properties p2;
	Properties p3;

	public static void main(String[] args) {
		new Main().lerPropriedades();
	}

	public void lerPropriedades() {
		TratadorDeExceptionsEmThreads tratadorDeExceptionsEmThreads = new TratadorDeExceptionsEmThreads();

		Thread thread = new Thread(new LeitorPropriedades(p1, "arquivo1.txt"));
		thread.setUncaughtExceptionHandler(tratadorDeExceptionsEmThreads);

		Thread thread2 = new Thread(new LeitorPropriedades(p2, "arquivo2.txt"));
		thread2.setUncaughtExceptionHandler(tratadorDeExceptionsEmThreads);

		Thread thread3 = new Thread(new LeitorPropriedades(p3, "arquivo3.txt"));
		thread3.setUncaughtExceptionHandler(tratadorDeExceptionsEmThreads);

		thread.start();
		thread2.start();
		thread3.start();
	}
}