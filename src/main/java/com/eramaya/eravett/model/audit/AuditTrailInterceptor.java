package com.eramaya.eravett.model.audit;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuditTrailInterceptor extends EmptyInterceptor {

	@Override
	public boolean onFlushDirty(final Object entity, final Serializable id,
			final Object[] currentState, final Object[] previousState,
			final String[] propertyNames, final Type[] types) {
		String updatedBy = "";
		if(SecurityContextHolder.getContext().getAuthentication()!=null){
			updatedBy = SecurityContextHolder.getContext().getAuthentication().getName();
		} else {
			updatedBy = "anonymousUser";
		}
		setValue(currentState, propertyNames, "updatedBy", updatedBy);
		setValue(currentState, propertyNames, "updatedDate", new Date());
		return true;
	}

	@Override
	public boolean onSave(final Object entity, final Serializable id,
			final Object[] state, final String[] propertyNames,
			final Type[] types) {
		String createdBy = "";
		if(SecurityContextHolder.getContext().getAuthentication()!=null){
			createdBy = SecurityContextHolder.getContext().getAuthentication().getName();
		} else {
			createdBy = "anonymousUser";
		}
		setValue(state, propertyNames, "createdBy", createdBy);
		setValue(state, propertyNames, "createdDate", new Date());
		return true;
	}

	private void setValue(final Object[] currentState,
			final String[] propertyNames, final String propertyToSet,
			final Object value) {
		final int index = Arrays.asList(propertyNames).indexOf(propertyToSet);
		if (index >= 0) {
			currentState[index] = value;
		}
	}
}
