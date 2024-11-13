package org.smartdatahub.liq.entity.utils;

import java.io.Serializable;

import javax.persistence.EntityNotFoundException;

import org.hibernate.Hibernate;

public interface Identifiable<ID extends Serializable> {
	public ID getId();
	
	public default <T> T nullIfNotFound(T proxy) {

		try {
			T unproxy = (T) Hibernate.unproxy(proxy);
			return unproxy;
		}catch (EntityNotFoundException e) {
			return null;
		}
		
	}
}
