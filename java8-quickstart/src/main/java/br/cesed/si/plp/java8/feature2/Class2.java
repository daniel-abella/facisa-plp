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
		 * Maneira antiga de implementar uma interface que só tem UM método
		 */
		Consumer<Usuario> mostrador = new Consumer<Usuario>() {

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());
			}
		};

		/*
		 * Maneira nova (1) de implementar uma interface que só tem UM método
		 */
		Consumer<Usuario> mostrador2 = (Usuario u) -> {
			System.out.println(u.getNome());
		};

		/*
		 * Maneira nova (2) de implementar uma interface que só tem UM método
		 * O compilador pode inferir o tipo
		 */
		Consumer<Usuario> mostrador3 = u -> { System.out.println(u.getNome()); };

		/*
		 * Maneira nova (3) de implementar uma interface que só tem UM método
		 * E se dentro dos { } só tiver uma instrução, pode remover também!
		 */
		Consumer<Usuario> mostrador4 = u -> System.out.println(u.getNome());
		

		/*
		 * E lembra da Class1 do forEach? 
		 * Agora é só juntar os dois mundos :)
		 */
		usuarios.forEach(u -> System.out.println(u.getNome()));

		/*
		 * E, ao invés de imprimir, podemos tornar todos os usuários moderadores!
		 */
		usuarios.forEach(u -> u.tornaModerador());

	}
}