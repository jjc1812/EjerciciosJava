package com.ejercicios.main;

public class Calculos {
    public boolean mayor(int mayor1, int mayor2){
		return mayor1 > mayor2;
	}

	public boolean menor(int menor1, int menor2){
		return menor1 < menor2;
	}

	public boolean igual (int igual1, int igual2){
		return igual1 == igual2;
	}

    public int sumarIVA(int producto){
		return producto + calcularIVA(producto);
	}

	public int calcularIVA(int valor) {
		final int IVA = 21;
		return dividir(multiplicar(valor, IVA), 100);
	}

	public int sumar(int sum1, int sum2) {
		return sum1+sum2;
	}

	public int restar(int res1, int res2) {
		return res1-res2;
	}

	public int dividir(int div1, int div2) {
		return div1/div2;
	}

	public int multiplicar(int mul1, int mul2) {
		return mul1*mul2;
	}
}
