/**
 * DADriver.java
 * DADriver
 * Copyright (c) Tigo Honduras.
 */
package hn.com.tigo.josm.orchestrator.da.driver.core;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;

/**
 * DADriver This class is used for driver instance and endpoint setup.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 08-15-2022 08:50:55 PM 2022
 */
public class DADriver {

	/** Attribute that determine serviceEndpoint. */
	private final String serviceEndpoint;

	
	/**
	 * Instantiates a new DA driver.
	 *
	 * @param serviceEndpoint the service endpoint
	 */
	public DADriver(final String serviceEndpoint) {

		this.serviceEndpoint = serviceEndpoint;
	}

	
	/**
	 * Execute driver.
	 *
	 * @param abstractDriver the abstract driver
	 * @return the task response type
	 * @throws AdapterException the adapter exception
	 */
	public TaskResponseType executeDriver(final AbstractDriver abstractDriver) throws AdapterException {
		abstractDriver.setEndpoint(serviceEndpoint);
		return abstractDriver.execute();
	}

}
