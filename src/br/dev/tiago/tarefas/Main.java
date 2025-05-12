package br.dev.tiago.tarefas;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		String path = "C:\\Users\\25132500\\tarefa\\tarefas.txt";
		FileReader file = null;
		BufferedReader buffer = null;
		

		try {
			file = new FileReader(path);
			buffer = new BufferedReader(file);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
