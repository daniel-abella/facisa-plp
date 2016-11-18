package br.cesed.si.plp.java8.feature1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Class1 {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("User 1", 150);
		Usuario u2 = new Usuario("User 2", 120);

		List<Usuario> usuarios = Arrays.asList(u1, u2);

		/*
		 * Maneira antiga
		 * Recebe um objeto do tipo java.util.function.Consumer, que tem o método accept.
		 */
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		/*
		 * Maneira nova (1)
		 * Recebe um objeto do tipo java.util.function.Consumer, que tem o método accept.
		 */
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario p) {
				System.out.println(p.getNome());
			}
		});

		/*
		 * Maneira nova (2)
		 * Desta vez criamos um Mostrador que implements Consumer
		 */
		usuarios.forEach(new Mostrador());
	}
}