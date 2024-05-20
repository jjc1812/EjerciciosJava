package com.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.ejercicios.main.Calculos;
import com.ejercicios.main.Producto;

public class MainApplication {

    public static void main( String[] args ){

		Calculos calculos = new Calculos();
		Producto producto = new Producto();

		final int NUM1 = 10;
		int num2 = 5;

		System.out.println("SUMA : " + calculos.sumar(NUM1, num2));
		System.out.println("RESTA : " + calculos.restar(NUM1, num2));
		System.out.println("DIVISION : " + calculos.dividir(NUM1, num2));
		System.out.println("MULTIPLICACION : " + calculos.multiplicar(NUM1, num2));

		int lado_cuadrado = 20;
		System.out.println("Perimetro del cuadrado es " + calculos.multiplicar(lado_cuadrado, 4) + " cm.");

		System.out.println("Area del cuadrado es " + calculos.multiplicar(lado_cuadrado, lado_cuadrado) + " cm.");

		int base_triangulo = 8;
		int altura_triangulo = 5;
		System.out.println("Area del triangulo es " + calculos.dividir(calculos.multiplicar(base_triangulo, altura_triangulo), 2) + " cm.");

		int lado_pentagono = 12;
		System.out.println("Perimetro del pentagono es " + calculos.multiplicar(lado_pentagono, 5) + " cm.");

		int precio_producto = 200;
		int iva_producto = calculos.calcularIVA(precio_producto);
		System.out.println("El producto sin IVA sale $" + calculos.restar(precio_producto, iva_producto));

		int nota1 = 7;
		int nota2 = 8;
		System.out.println("Nota final : " + calculos.sumar(calculos.dividir(calculos.sumar(nota1, nota2), 2), calculos.sumar(nota1, nota2)%2));

		int producto1 = 2500;
		int producto2 = 1800;
		System.out.println("Valor final de los productos : " + calculos.sumar(calculos.sumarIVA(producto1), calculos.sumarIVA(producto2)));

		int monto_cliente = 5500;
		int monto_pagar = calculos.sumar(calculos.sumarIVA(producto1), calculos.sumarIVA(producto2));
		System.out.println("Vuelto del cliente : " + calculos.restar(monto_cliente, monto_pagar));

		// Operadores Logicos igual ==  ____  distinto !=  ____
		// mayor > ____  menor <  ____  mayor o igual >=  ____  menor o igual <=
		// and &&  ____  or || 
		int numero1 = 10;
		int numero2 = 20;
		System.out.println("Mayor : " + calculos.mayor(numero1, numero2));
		System.out.println("Menor : " + calculos.menor(numero1, numero2));
		System.out.println("Igual : " + calculos.igual(numero1, numero2));
		boolean pago_exacto = monto_cliente == monto_pagar;
		System.out.println("El cliente pago exacto? " + pago_exacto);

		// Condicionales if(condicion booleana) _________ else ________ else if (condicion booleana)
		int edad = 8;
		if (calculos.mayor(edad, 17) && calculos.menor(edad, 65)) {
			System.out.println("Es un adulto.");
		} else if (calculos.menor(edad, 18)) {
			System.out.println("ES menor de edad.");
		} else {
			System.out.println("Es un jubilado.");
		}

		// input por consola
		Scanner scanner = new Scanner(System.in);

        //System.out.print("Ingrese su nombre: ");
        //String nombre = scanner.nextLine();
		//System.out.println("Hola " + nombre);

		//Ejercicio 20
		int prod1 = 200;
		int prod2 = 20000;
		int prod3 = 2000;
		System.out.println(producto.identificarProductosIgules(prod1, prod2, prod3));

		//Ejercicio 21
		System.out.println(producto.identificarProductosDistintos(prod1, prod2, prod3));

		//Cadena de caracteres
		String cadena1 = "Buen dia";
		String cadena2 = "buenas noches";

		System.out.println("Largo cadena 1: " + cadena1.length());
		System.out.println("Largo cadena 2: " + cadena2.length());
		System.out.println("Concatenacion: " + cadena1.concat(cadena2));
		System.out.println(cadena1 + " " + cadena2);
		System.out.println("Busqueda de caracteres: " + cadena1.indexOf("a"));
		System.out.println("Igualdad entre cadenas: " + cadena1.equals(cadena2));
		System.out.println("Mayusculas: " + cadena1.toUpperCase());
		System.out.println("Minusculas: " + cadena1.toLowerCase());
		System.out.println("Separar una cadena: " + cadena1.split(" ")[1]);

		// iteradores
		for(int iterador = 0; iterador < 10; iterador++){
			System.out.println(iterador);
		}

		int iva_producto_iterador = 2000;
		while (iva_producto_iterador < 10000) {
			iva_producto_iterador+=calculos.calcularIVA(iva_producto_iterador);
			System.out.println(iva_producto_iterador);
		}

		//listas
		ArrayList<String> lista = new ArrayList<>();
		lista.add("hola");
		System.out.println(lista.get(0));
		
		int lista_numeros[] = {2, 4, 6, 8};
		//valores  [2, 4, 6, 8]
		//posicion [0, 1, 2, 3]
		System.out.println(lista_numeros[0]);
		// lista_numeros.length largo de la lista
		for(int index = 0; index < lista_numeros.length; index++){
			System.out.println(lista_numeros[index]);
		}

		//ejercicio de listas en clase
		ArrayList<String> muebles = new ArrayList<String>(){{
			add("mesa"); 
			add("comoda");
			add("biblioteca");
			add("escritorio");
			add("cama");
			add("alacena");
		}};

		ArrayList<Integer> precios = new ArrayList<Integer>() {{
			add(200000);
			add(250000);
			add(500000);
			add(550000);
			add(350000);
			add(270000);
		}};

		String mueble_entrada = "Cama";

		String mueble = muebles
		.stream()
		.filter(m -> m.equalsIgnoreCase(mueble_entrada))
		.findFirst()
		.orElse(null);

		if (mueble!=null) {
			int posicion = muebles.indexOf(mueble);
			System.out.println("El producto " + mueble + " esta en stock.");
			System.out.println("Su valor es de " + precios.get(posicion));
		} else {
			System.out.println("El producto no esta disponible.");
		}

		//ejercicio 34
		ArrayList<String> autos = new ArrayList<String>(){{
			add("fiat"); 
			add("ford");
			add("toyota");
			add("ford");
			add("fiat");
			add("fiat");
			add("ford");
			add("toyota");
		}};

		List<String> autosOrdenados = autos.stream().sorted().collect(Collectors.toList());
		int contar_auto = 1;
		
		for(int i=1; i<autosOrdenados.size(); i++){
			if(autosOrdenados.get(i-1).equals(autosOrdenados.get(i))){
				contar_auto++;
			}
			else {
				System.out.println("Hay " + contar_auto + " autos de marca " + autosOrdenados.get(i-1));
				contar_auto = 1;
			}
			if (i == autosOrdenados.size()-1) {
				System.out.println("Hay " + contar_auto + " autos de marca " + autosOrdenados.get(i));
			}
		}

		// Ejercicio 35
		ArrayList<Integer> años_febricacion = new ArrayList<Integer>() {{
			add(1988);
			add(1998);
			add(1970);
			add(1999);
			add(2010);
			add(2004);
			add(1992);
			add(1986);
		}};

		for(int x=0; x<autos.size(); x++){
			System.out.println("Marca: " + autos.get(x) + " Año: " + años_febricacion.get(x));
		}

		//Ejercicio 36
		ArrayList<String> autos_no_paga_patente = new ArrayList<String>();

		for(int y=0; y<autos.size(); y++){
			if(años_febricacion.get(y)<1999){
				autos_no_paga_patente.add(autos.get(y) + " año: " + años_febricacion.get(y));
			}
		}
		System.out.println(autos_no_paga_patente.toString());

		//Maps
		Map<Integer, String> nuevo_map = new HashMap<Integer, String>();
		nuevo_map.put(1, "casa");
		nuevo_map.put(3, "auto");
		nuevo_map.put(2, "mesa");
		nuevo_map.put(4, "camion");

		System.out.println(nuevo_map.get(4));

		nuevo_map.remove(4);

		System.out.println(nuevo_map.containsValue("mesa"));

		System.out.println(nuevo_map.containsKey(1));

		System.out.println(nuevo_map.size());

		System.out.println(nuevo_map.isEmpty());

		System.out.println(nuevo_map.keySet());

		System.out.println(nuevo_map.values());

		System.out.println(nuevo_map.getOrDefault(4, "no existe"));

		final int[] suma = {0};
		nuevo_map.forEach((k, v) -> {

			suma[0] += Integer.parseInt(k.toString());
			System.out.println("Clave: " + k + " Value: " + v);
		});
		System.out.println(suma[0]);

		//Ejercicio 44
		Map<Integer, String> descripcion_productos = new HashMap<Integer, String>();
		descripcion_productos.put(1000, "masa para pizza");
		descripcion_productos.put(1001, "harina 0000");
		descripcion_productos.put(1002, "azucar");
		descripcion_productos.put(1003, "polenta");	

		Map<Integer, Integer> precio_productos = new HashMap<Integer, Integer>();
		precio_productos.put(1000, 2000);
		precio_productos.put(1001, 800);
		precio_productos.put(1002, 100);
		precio_productos.put(1003, 1800);

		int codigo_barras = 1000;

		if (descripcion_productos.containsKey(codigo_barras)) {
			System.out.println(descripcion_productos.get(codigo_barras) + " = $" + precio_productos.get(codigo_barras));
		} else {
			System.out.println("NO ESTA EN STOCK");
		}

		// Ejercicio 45
		// Map<String, String> lista_productos = new HashMap<String, String>();

		// Map<String, Integer> lista_precios = new HashMap<String, Integer>();

		// ArrayList<String> cliente_materiales = new ArrayList<String>();

		// final int[] presupuesto = {0};

		// for(int index = 0; index<cliente_materiales.length(); index++){
		// 	lista_productos.forEach((key, value) -> {
		// 		if (key.equals(cliente_materiales.get(index))){
		// 			presupuesto[0]+=lista_precios.get(key);
		// 		}
		// 	});
		// }
	}
}
