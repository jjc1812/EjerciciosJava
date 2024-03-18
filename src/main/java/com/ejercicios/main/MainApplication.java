package com.ejercicios.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		final int NUM1 = 10;
		int num2 = 5;

		System.out.println("SUMA : " + sumar(NUM1, num2));
		System.out.println("RESTA : " + restar(NUM1, num2));
		System.out.println("DIVISION : " + dividir(NUM1, num2));
		System.out.println("MULTIPLICACION : " + multiplicar(NUM1, num2));

		int lado_cuadrado = 20;
		System.out.println("Perimetro del cuadrado es " + multiplicar(lado_cuadrado, 4) + " cm.");

		System.out.println("Area del cuadrado es " + multiplicar(lado_cuadrado, lado_cuadrado) + " cm.");

		int base_triangulo = 8;
		int altura_triangulo = 5;
		System.out.println("Area del triangulo es " + dividir(multiplicar(base_triangulo, altura_triangulo), 2) + " cm.");

		int lado_pentagono = 12;
		System.out.println("Perimetro del pentagono es " + multiplicar(lado_pentagono, 5) + " cm.");

		int precio_producto = 200;
		final int IVA = 21;
		int iva_producto = dividir(multiplicar(precio_producto, IVA), 100);
		System.out.println("El producto sin IVA sale $" + restar(precio_producto, iva_producto));
	}

	static int sumar(int sum1, int sum2) {
		return sum1+sum2;
	}

	static int restar(int res1, int res2) {
		return res1-res2;
	}

	static int dividir(int div1, int div2) {
		return div1/div2;
	}

	static int multiplicar(int mul1, int mul2) {
		return mul1*mul2;
	}
}
