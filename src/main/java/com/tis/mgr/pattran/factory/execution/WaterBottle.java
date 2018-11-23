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
public class WaterBottle implements Bottle {

	private Logger _logger = Logger.getLogger(WaterBottle.class.getName());

	@Override
	public String maufacture() {

		_logger.info("This is brand new Water bottle :");
		return "This is brand new Water bottle :";

	}

}
