package br.dev.tiago.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.tiago.tarefas.dao.FuncionarioDAO;
import br.dev.tiago.tarefas.model.Funcionario;
import br.dev.tiago.tarefas.model.Tarefa;

public class Main {
	private static String path = "C:\\Users\\25132500\\tarefa\\tarefas.txt";

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		List<Funcionario> funcionarios = new ArrayList<>();

		Funcionario funcionario = new Funcionario();
		funcionario.setCodigo(1);
		funcionario.setNome("Tiago");
		funcionario.setMatricula("20001");
		funcionario.setEmail("teste@gmail.com");

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCodigo(2);
		funcionario2.setNome("Teste");
		funcionario2.setMatricula("202341");
		funcionario2.setEmail("teste2@gmail.com");

		funcionarios.add(funcionario);
		funcionarios.add(funcionario2);
		
//		System.out.println();
		
	funcionarios.forEach(item -> {
		System.out.println(item.getNome() + " - " + item.getEmail());
	
	});

//		
//		FuncionarioDAO dao = new FuncionarioDAO(funcionario);
//		
//		dao.gravar();

//		Tarefa tarefa = new Tarefa("Água");
//
//		gravarArquivo();
//		lerArquivo();

	}

	private static void gravarArquivo() {
		FileWriter arquivo = null;
		BufferedWriter escritor = null;

		try {
			arquivo = new FileWriter(path, true);
			escritor = new BufferedWriter(arquivo);

			escritor.write("Essa é outra linha\n");
			escritor.flush();
			arquivo.close();

		} catch (Exception erro) {
			// TODO: handle exception
		}

	}

	private static void lerArquivo() {
		FileReader file = null;
		BufferedReader buffer = null;
		String linha = "";

		try {
			file = new FileReader(path);
			buffer = new BufferedReader(file);

			while (linha != null) {
				linha = buffer.readLine();

				if (linha != null) {
					System.out.println(linha);
				}
			}

		} catch (FileNotFoundException erro) {
			System.out.println("Arquivo não encontrado");
			System.out.println(erro.getMessage());
		} catch (IOException erro) {
			System.out.println("Você não pode ler o arquivo");
			System.out.println(erro.getMessage());
		} catch (Exception erro) {
			System.out.println("Erro genérico");
			System.out.println(erro);
		}
	}

}
