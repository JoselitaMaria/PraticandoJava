package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {

		//exemplo bem basico de lista
		
		List<String> lista = new ArrayList<>();

		lista.add("Josy");
		lista.add("Dayvson");
		lista.add("Sophie");
		lista.add("Pietro");
		lista.add("Heloise");
		lista.add(0, "Deus");//nesse caso coloquei qual a posição o nome deve oculpar

		for (String x : lista) {
			System.out.println(x);
		}

	
	}
}
