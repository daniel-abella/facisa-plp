package br.cesed.si.plp.java8.feature1;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {

	@Override
	public void accept(Usuario user) {
		System.out.println(user.getNome());
	}
}
