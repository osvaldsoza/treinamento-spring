package br.com.senior.treinamento.spring.treinamentospring.rest;

public class Error {

	private String message;

	public Error(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
