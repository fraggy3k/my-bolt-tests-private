package org.smartdatahub.liq.api.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException { 
	
	private static final long serialVersionUID = 1L;
	
	
	public BadRequestException(String msg) {
		super(msg);
	}


	public BadRequestException() {
		super();
	}


	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}


	public BadRequestException(Throwable cause) {
		super(cause);
	}

	
	
	
}