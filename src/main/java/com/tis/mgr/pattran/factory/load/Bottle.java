/**
 * 
 */
package com.tis.mgr.pattran.factory.load;

import java.util.logging.Logger;

/**
 * @author mardubudi Factory interface for Bottle manufacturing
 *
 */
public interface Bottle {
	// This is default
	
	Logger _logger = Logger.getLogger(Bottle.class.getName());
	default public String maufacture() {
		_logger.info("Manufacturing empty bottel for all bravareges:From factory ");
		return "Manufacturing empty bottel for all bravareges:";
	}

}
