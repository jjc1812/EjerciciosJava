package com.ejercicios.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		final int NUM1 = 10;
		int num2 = 5;

		System.out.println(sumar(NUM1, num2));
	}

	static int sumar(int sum1, int sum2) {
		return sum1+sum2;
	}
}
