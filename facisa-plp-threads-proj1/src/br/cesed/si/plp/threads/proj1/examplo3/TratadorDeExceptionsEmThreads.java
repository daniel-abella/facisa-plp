package br.cesed.si.plp.threads.proj1.examplo3;

import java.lang.Thread.UncaughtExceptionHandler;

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
public class TratadorDeExceptionsEmThreads implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Erro na thread " + t.getName() + " - " + e.getMessage());
	}

}