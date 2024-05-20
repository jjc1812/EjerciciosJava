package com.ejercicios.main;

public class Producto {
    Calculos calculos = new Calculos();

    public boolean identificarProductosDistintos(int prod1, int prod2, int prod3){
		if (calculos.calcularIVA(prod1) != calculos.calcularIVA(prod2) && calculos.calcularIVA(prod2) != calculos.calcularIVA(prod3)
		 && calculos.calcularIVA(prod1) != calculos.calcularIVA(prod3)) { 
			return true; 
		}
		return false;
	}

	public boolean identificarProductosIgules(int prod1, int prod2, int prod3){
		boolean prod_iguales = false;
		if (calculos.calcularIVA(prod1) == calculos.calcularIVA(prod2)) {
			prod_iguales = true;
		} else if (calculos.calcularIVA(prod2) == calculos.calcularIVA(prod3)){
			prod_iguales = true;
		} else if (calculos.calcularIVA(prod1) == calculos.calcularIVA(prod3)) {
			prod_iguales = true;			
		}
		return prod_iguales;
	}
}
