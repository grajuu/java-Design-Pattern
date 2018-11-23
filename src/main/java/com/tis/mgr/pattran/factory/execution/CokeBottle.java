/**
 * 
 */
package com.tis.mgr.pattran.factory.execution;

import java.util.logging.Logger;

import com.tis.mgr.pattran.factory.load.Bottle;

/**
 * @author mardubudi
 * 
 *         Coke bottle manufacture
 *
 */
public class CokeBottle implements Bottle {

	private Logger _logger = Logger.getLogger(CokeBottle.class.getName());

	@Override
	public String maufacture() {
		_logger.info("This is barnd new Coke Bottle ::");
		return "This is barnd new Coke Bottle :";

	}

}
