/**
 * 
 */
package com.tis.mgr.pattran.factory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author mardubudi
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class BottleFactoryException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BottleFactoryException(String wrongBottleName) {
		super("No Bottle can manufacture wthe brand name " + wrongBottleName + " only  with \"Water\",or \"vodka\",\"coke\" is available");
	}

}
