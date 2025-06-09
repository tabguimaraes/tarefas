package br.dev.tiago.tarefas.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.dev.tiago.tarefas.dao.FuncionarioDAO;
import br.dev.tiago.tarefas.model.Funcionario;
import br.dev.tiago.tarefas.utils.Utils;

public class FrameFuncionario {

	private JLabel labelCodigo, labelNome, labelTelefone, labelEmail;
	private JTextField txtCodigo, txtNome, txtTelefone, txtEmail;
	private JButton btnSalvar, btnSair;

	private void limparForm() {
		txtNome.setText(null);
		txtEmail.setText(null);
		txtTelefone.setText(null);
		txtNome.requestFocus();
		;

	}

	public FrameFuncionario() {
		criarTela();
	}

	private void criarTela() {

		JFrame tela = new JFrame();
		tela.setLayout(null);
		tela.setSize(400, 400);
		tela.setResizable(false);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container painel = tela.getContentPane();

		labelCodigo = new JLabel("Código:");
		labelCodigo.setBounds(20, 20, 200, 30);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(20, 50, 200, 30);
		txtCodigo.setEnabled(false);

		painel.add(labelCodigo);
		painel.add(txtCodigo);

		labelNome = new JLabel("Nome:");
		labelNome.setBounds(20, 85, 350, 30);
		txtNome = new JTextField();
		txtNome.setBounds(20, 115, 200, 30);

		painel.add(labelNome);
		painel.add(txtNome);

		labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(20, 150, 200, 30);
		txtTelefone = new JTextField();
		txtTelefone.setBounds(20, 180, 200, 30);

		painel.add(labelTelefone);
		painel.add(txtTelefone);

		labelEmail = new JLabel("Email:");
		labelEmail.setBounds(20, 215, 200, 30);
		txtEmail = new JTextField();
		txtEmail.setBounds(20, 245, 200, 30);

		painel.add(labelEmail);
		painel.add(txtEmail);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(20, 290, 100, 40);
		painel.add(btnSalvar);

		btnSair = new JButton("Sair");
		btnSair.setBounds(130, 290, 100, 40);
		painel.add(btnSair);

		// Adicionar listeners

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Funcionario funcionario = new Funcionario();

				funcionario.setCodigo(Utils.gerarUUID());
				funcionario.setNome(txtNome.getText());
				funcionario.setTelefone(txtTelefone.getText());
				funcionario.setEmail(txtEmail.getText());

				FuncionarioDAO dao = new FuncionarioDAO(funcionario);
				dao.gravar();

				JOptionPane.showMessageDialog(tela, txtNome.getText() + " gravado com sucesso!", "Sucesso",
						JOptionPane.INFORMATION_MESSAGE);
				limparForm();

			}
		});

		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(tela, "Sair do sistema?", "Sair do sistema?",
						JOptionPane.YES_NO_OPTION);

				if (response == 0) {
					System.exit(0);
				}
			}
		});

		tela.setVisible(true);

	}

}
