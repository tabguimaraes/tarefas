package br.dev.tiago.tarefas.model;

import java.time.LocalDateTime;

public class Tarefa {

	private int codigo;
	private String titulo, descricao;
	private LocalDateTime dataInicial, prazo, dataConclusao;
	private Status status;
	private Funcionario funcionario;

	public Tarefa(String titulo) {
		this.titulo = titulo;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDateTime dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDateTime getPrazo() {
		return prazo;
	}

	public void setPrazo(LocalDateTime prazo) {
		this.prazo = prazo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getDataConclusao() {
		return dataConclusao;
	}

}
