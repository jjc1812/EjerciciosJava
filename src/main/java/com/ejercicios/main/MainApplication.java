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
		int iva_producto = calcularIVA(precio_producto);
		System.out.println("El producto sin IVA sale $" + restar(precio_producto, iva_producto));

		int nota1 = 7;
		int nota2 = 8;
		System.out.println("Nota final : " + sumar(dividir(sumar(nota1, nota2), 2), sumar(nota1, nota2)%2));

		int producto1 = 2500;
		int producto2 = 1800;
		System.out.println("Valor final de los productos : " + sumar(sumarIVA(producto1), sumarIVA(producto2)));
	}

	static int sumarIVA(int producto){
		return producto + calcularIVA(producto);
	}

	static int calcularIVA(int valor) {
		final int IVA = 21;
		return dividir(multiplicar(valor, IVA), 100);
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
