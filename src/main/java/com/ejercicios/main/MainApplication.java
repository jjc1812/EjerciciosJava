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

		int monto_cliente = 5500;
		int monto_pagar = sumar(sumarIVA(producto1), sumarIVA(producto2));
		System.out.println("Vuelto del cliente : " + restar(monto_cliente, monto_pagar));

		// Operadores Logicos igual ==  ____  distinto !=  ____
		// mayor > ____  menor <  ____  mayor o igual >=  ____  menor o igual <=
		// and &&  ____  or || 
		int numero1 = 10;
		int numero2 = 20;
		System.out.println("Mayor : " + mayor(numero1, numero2));
		System.out.println("Menor : " + menor(numero1, numero2));
		System.out.println("Igual : " + igual(numero1, numero2));
		boolean pago_exacto = monto_cliente == monto_pagar;
		System.out.println("El cliente pago exacto? " + pago_exacto);

		// Condicionales if(condicion booleana) _________ else ________ else if (condicion booleana)
		int edad = 8;
		if (mayor(edad, 17) && menor(edad, 65)) {
			System.out.println("Es un adulto.");
		} else if (menor(edad, 18)) {
			System.out.println("ES menor de edad.");
		} else {
			System.out.println("Es un jubilado.");
		}
	}

	static boolean mayor(int mayor1, int mayor2){
		return mayor1 > mayor2;
	}

	static boolean menor(int menor1, int menor2){
		return menor1 < menor2;
	}

	static boolean igual (int igual1, int igual2){
		return igual1 == igual2;
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
