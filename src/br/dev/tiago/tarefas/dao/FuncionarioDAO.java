package br.dev.tiago.tarefas.dao;

import java.io.BufferedWriter;
import java.io.IOException;

import br.dev.tiago.tarefas.factory.FileFactory;
import br.dev.tiago.tarefas.model.Funcionario;

public class FuncionarioDAO {

	private Funcionario funcionario;

	public FuncionarioDAO(Funcionario funcionario) {

		// Insere o valor dentro de private Funcionario funcionario;
		this.funcionario = funcionario;

	}

	public void gravar() {
		FileFactory ff = new FileFactory();

		try {
			BufferedWriter bw = ff.getBufferedWriter();

			bw.write(funcionario.toString());
			bw.flush();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void showEmployees() {
		
		
	}
}
