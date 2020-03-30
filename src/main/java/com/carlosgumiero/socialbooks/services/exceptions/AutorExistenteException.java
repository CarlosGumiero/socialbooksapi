package com.carlosgumiero.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException{

	private static final long serialVersionUID = -9102554527809827621L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
