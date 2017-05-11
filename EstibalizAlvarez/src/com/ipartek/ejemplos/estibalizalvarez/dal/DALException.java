package com.ipartek.ejemplos.estibalizalvarez.dal;

public class DALException extends RuntimeException {// Para poder crear yo excepciones.

	private static final long serialVersionUID = -35477803923729914L;

	public DALException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DALException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DALException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DALException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DALException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
