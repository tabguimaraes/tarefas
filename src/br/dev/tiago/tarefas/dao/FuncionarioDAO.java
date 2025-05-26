package br.dev.tiago.tarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.tiago.tarefas.factory.FileFactory;
import br.dev.tiago.tarefas.model.Funcionario;

public class FuncionarioDAO {

	private Funcionario funcionario;
	private FileFactory ff = new FileFactory();
	private String linha = null;

	public FuncionarioDAO(Funcionario funcionario) {

		// Insere o valor dentro de private Funcionario funcionario;
		this.funcionario = funcionario;

	}

	public void gravar() {

		try {
			BufferedWriter bw = ff.getBufferedWriter();

			bw.write(funcionario.toString());
			bw.flush();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Funcionario> showEmployees() {

		List<Funcionario> funcionarios = new ArrayList<>();

		try {

			BufferedReader br = ff.getBufferedReader();
			linha = br.readLine();

			do {
				linha = br.readLine();

				String[] funcionario = linha != null ? linha.split(",") : null;

				Funcionario f = new Funcionario();

				f.setCodigo(funcionario[0]);
				f.setNome(funcionario[1]);
				f.setTelefone(funcionario[2]);
				f.setEmail(funcionario[3]);

				funcionarios.add(f);

			} while (linha != null);

//			String linha = br.readLine();
//			String[] funcionario = linha.split(",");
//
//			Funcionario f = new Funcionario();
//			f.setCodigo(funcionario[0]);
//			f.setNome(funcionario[1]);
//			f.setTelefone(funcionario[2]);
//			f.setEmail(funcionario[3]);

			System.out.println(funcionario.toString());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		return null;
	}
}
