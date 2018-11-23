/**
 * 
 */
package com.tis.mgr.pattran.factory.execution;

import java.util.logging.Logger;

import com.tis.mgr.pattran.factory.load.Bottle;

/**
 * @author mardubudi
 *
 */
public class VodkaBottle implements Bottle {
	Logger _logger = Logger.getLogger(VodkaBottle.class.getName());

	@Override
	public String maufacture() {
		_logger.info("This is brand new Vodka Bottle");
		return "This is brand new Vodka Bottle";

	}

}
