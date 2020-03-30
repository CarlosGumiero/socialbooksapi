package com.carlosgumiero.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = -9102554527809827621L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
