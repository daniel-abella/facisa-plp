package br.cesed.si.plp.java8.feature3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Class3 {

	public static void main(String[] args) {

		/*
		 * Maneira antiga
		 */
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hi!");
			}
		};

		new Thread(r).start();
		
		/*
		 * Maneira nova (1)
		 * Interface funcional que possui apenas um método abstract
		 * Usando lambda 
		 */
		Runnable r2 = () -> {
			System.out.println("Hi!");
		};
		
		new Thread(r2).start();
		

		/*
		 * Maneira nova (2)
		 * Interface funcional que possui apenas um método abstract
		 * Usando lambda 
		 */
		new Thread(() -> {
			System.out.println("Hi!");
		}).start();

		
	}
}