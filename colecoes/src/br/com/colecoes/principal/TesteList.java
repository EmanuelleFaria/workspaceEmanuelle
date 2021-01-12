package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {

		int numeros[] = new int[5];
		
		//numeros[0] = 1520;
		//numeros[1] = 10;
		
		List<String> lista= new ArrayList<String>();
		lista.add("DBA");
		lista.add("JR");
		lista.add("DESENVOLVEDOR");
		lista.add("SR");
		lista.add("GERENTE DE PROJETOS");
		lista.add("Trainee");
		lista.add("DBA");
		
		System.out.println(lista);
		System.out.println("Elemento 1:" + lista.get(0));
		lista.remove(0);
		System.out.println("Elemento 1:" + lista.get(0));
		Collections.sort(lista);
		System.out.println("Lista Ordenada: " + lista);
		
		//for tradicional
		/*
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
		}
		*/
		
		//foreach
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
			
		}
		
	}

}
