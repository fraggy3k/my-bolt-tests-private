package org.smartdatahub.liq.api.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocessableEntityException extends RuntimeException { 
	private static final long serialVersionUID = 1L;

	public UnprocessableEntityException() {
		super();
	}

	public UnprocessableEntityException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnprocessableEntityException(String message) {
		super(message);
	}

	public UnprocessableEntityException(Throwable cause) {
		super(cause);
	}
	
	
}