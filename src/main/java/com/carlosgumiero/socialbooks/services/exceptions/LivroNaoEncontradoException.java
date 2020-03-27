package com.carlosgumiero.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = -9102554527809827621L;

	public LivroNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
