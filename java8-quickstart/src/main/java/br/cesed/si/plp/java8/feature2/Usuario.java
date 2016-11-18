package br.cesed.si.plp.java8.feature2;

public class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}
	
	public void tornaModerador() {
		moderador = true;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the pontos
	 */
	public int getPontos() {
		return pontos;
	}

	/**
	 * @param pontos the pontos to set
	 */
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	/**
	 * @return the moderador
	 */
	public boolean isModerador() {
		return moderador;
	}

	/**
	 * @param moderador the moderador to set
	 */
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
}
