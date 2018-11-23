/**
 * 
 */
package com.tis.mgr.pattran.factory.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tis.mgr.pattran.factory.exception.BottleFactoryException;
import com.tis.mgr.pattran.factory.execution.CokeBottle;
import com.tis.mgr.pattran.factory.execution.VodkaBottle;
import com.tis.mgr.pattran.factory.execution.WaterBottle;
import com.tis.mgr.pattran.factory.load.Bottle;

/**
 * @author mardubudi
 *
 */
@RestController
public class FactoryController {

	protected Logger logger = Logger.getLogger(FactoryController.class.getName());
	Bottle _bootle = null;

	@GetMapping("/bottleOf/{liquid}")
	public String getBrandNewBottle(@PathVariable("liquid") String bottleName) {

		logger.info("User request for brand new bottle of " + bottleName);

		if (bottleName.equalsIgnoreCase("Water")) {
			_bootle = new WaterBottle();
			return _bootle.maufacture();
		} else if (bottleName.equalsIgnoreCase("vodka")) {
			_bootle = new VodkaBottle();
			return _bootle.maufacture();
		} else if (bottleName.equalsIgnoreCase("coke")) {
			_bootle = new CokeBottle();
			return _bootle.maufacture();
		} else {
			throw new BottleFactoryException(bottleName);
		}

	}

}
