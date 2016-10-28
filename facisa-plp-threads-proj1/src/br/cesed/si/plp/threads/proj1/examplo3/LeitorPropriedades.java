package br.cesed.si.plp.threads.proj1.examplo3;

import java.io.FileReader;
import java.util.Properties;

/**
 * UniFacisa
 * Paradigmas de Linguagens de Programa��o (PLP)
 * Examplo 4: Exceptions
 * 
 * Based on: https://github.com/Jonas92/Threads-Java---First-steps
 * 
 * @author ABELLA
 *
 */
public class LeitorPropriedades implements Runnable {

	private Properties p;
	private String nomeArquivo;

	public LeitorPropriedades(Properties p, String nomeArquivo) {
		this.p = p;
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public void run() {
		try {
			p.load(new FileReader(nomeArquivo));
		} catch (Exception e) {
			throw new RuntimeException(e);
			// throw new RuntimeException("Erro ao achar/abrir o " +
			// nomeArquivo);
		}
	}
}
