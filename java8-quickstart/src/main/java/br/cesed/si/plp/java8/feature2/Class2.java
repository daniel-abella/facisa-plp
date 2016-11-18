package br.cesed.si.plp.java8.feature2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Class2 {

	public static void main(String[] args) {

		Usuario u1 = new Usuario("User 1", 150);
		Usuario u2 = new Usuario("User 2", 120);

		List<Usuario> usuarios = Arrays.asList(u1, u2);

		/*
		 * Maneira antiga de implementar uma interface que s� tem UM m�todo
		 */
		Consumer<Usuario> mostrador = new Consumer<Usuario>() {

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());
			}
		};

		/*
		 * Maneira nova (1) de implementar uma interface que s� tem UM m�todo
		 */
		Consumer<Usuario> mostrador2 = (Usuario u) -> {
			System.out.println(u.getNome());
		};

		/*
		 * Maneira nova (2) de implementar uma interface que s� tem UM m�todo
		 * O compilador pode inferir o tipo
		 */
		Consumer<Usuario> mostrador3 = u -> { System.out.println(u.getNome()); };

		/*
		 * Maneira nova (3) de implementar uma interface que s� tem UM m�todo
		 * E se dentro dos { } s� tiver uma instru��o, pode remover tamb�m!
		 */
		Consumer<Usuario> mostrador4 = u -> System.out.println(u.getNome());
		

		/*
		 * E lembra da Class1 do forEach? 
		 * Agora � s� juntar os dois mundos :)
		 */
		usuarios.forEach(u -> System.out.println(u.getNome()));

		/*
		 * E, ao inv�s de imprimir, podemos tornar todos os usu�rios moderadores!
		 */
		usuarios.forEach(u -> u.tornaModerador());

	}
}