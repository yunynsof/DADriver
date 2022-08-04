/**
 * DADriver.java
 * DADriver
 * Copyright (c) Tigo Honduras.
 */
package hn.com.tigo.josm.orchestrator.da.driver.core;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;


/**
 * DADriver.
 *
 * @author Yuny Rene Rodriguez Perez 
 * @version 1.0.0
 * @see java
 * @since 06-09-2022 03:49:30 PM 2022
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
