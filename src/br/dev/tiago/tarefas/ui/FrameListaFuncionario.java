package br.dev.tiago.tarefas.ui;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FrameListaFuncionario {

	private JLabel labelTitulo;
	private JTable tableFuncionarios;
	private JScrollPane scrollFuncionarios;
	private JButton btnNovo, btnExcluir, btnAlterar, btnSair;

	private Font fonteTitulo = new Font("Arial", Font.BOLD, 26);

	public FrameListaFuncionario() {
		criarTela();
	}

	private void criarTela() {
		JFrame tela = new JFrame();

		tela.setTitle("Cadastro de funcionários");
		tela.setSize(600, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);

		Container painel = tela.getContentPane();

		labelTitulo = new JLabel("Cadastro de Funcionários");
		labelTitulo.setBounds(10, 20, 200, 30);
		labelTitulo.setFont(fonteTitulo);

		String[] colunas = { "Código", "Nome", "E-mail" };

		Object[][] dados = { { "", "", "" }, { "", "", "" }, { "", "", "" } };

		painel.add(labelTitulo);
		tela.setVisible(true);

	}

}
