package hn.com.tigo.josm.orchestrator.da.driver.core;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import hn.com.tigo.josm.common.adapter.dto.ParameterArray;
import hn.com.tigo.josm.common.adapter.dto.TaskRequestType;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.cache.ObjectFactoryCache;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.common.exceptions.HttpClientException;
import hn.com.tigo.josm.common.exceptions.enumerators.AdapterErrorCode;


/**
 * AbstractDriver This abstract class contains properties and features for DADriver.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @see 
 * @since 08-15-2022 08:47:34 PM 2022
 */
public abstract class AbstractDriver {

	/** The Constant LOGGER. */
	protected static final transient Logger LOGGER = Logger.getLogger(AbstractDriver.class);

	/** The object factory cache. */
	protected static ObjectFactoryCache objectFactoryCache = ObjectFactoryCache.getInstance();

	/** Attribute that determine taskType. */
	protected TaskRequestType taskType;

	/** Attribute that determine endpoint. */
	protected String endpoint;

	/** Attribute that determine properties. */
	private Map<String, String> properties;

	/**
	 * Instantiates a new abstract driver.
	 */
	public AbstractDriver() {
		this.properties = new HashMap<>();
		properties.put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);
	}

	/**
	 * Post.
	 *
	 * @param endpoint
	 *            the endpoint
	 * @param request
	 *            the request
	 * @return the string
	 * @throws AdapterException
	 *             the adapter exception
	 */
	protected String post(final String endpoint, final String request) throws AdapterException {
		HttpConnectorPost post = null;
		String response = null;
		try {
			post = new HttpConnectorPost(endpoint, properties);
			response = post.invoke(request, StandardCharsets.UTF_8);
		} catch (HttpClientException e) {
			LOGGER.error(e.getMessage(), e);
			throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, e.getMessage(),
					String.valueOf(AdapterErrorCode.COMMUNICATION_ERROR), null);
		}
		return response;
	}

	/**
	 * Gets the.
	 *
	 * @param endpoint
	 *            the endpoint
	 * @return the string
	 * @throws AdapterException
	 *             the adapter exception
	 */
	protected String get(final String endpoint) throws AdapterException {

		HttpConnectorGet get = null;
		String response = null;

		try {
			get = new HttpConnectorGet(endpoint, this.properties);
			response = get.invoke(null, StandardCharsets.UTF_8);
		} catch (HttpClientException e) {
			LOGGER.error(e.getMessage(), e);
			throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, e.getMessage(),
					String.valueOf(AdapterErrorCode.COMMUNICATION_ERROR), null);
		}

		return response;
	}

	/**
	 * Creates the response.
	 *
	 * @param responseCode
	 *            the response code
	 * @param responseDescription
	 *            the response description
	 * @param param
	 *            the param
	 * @return the task response type
	 * @throws AdapterException
	 *             the adapter exception
	 */
	protected TaskResponseType createResponse(final int responseCode, final String responseDescription,
			final ParameterArray param) throws AdapterException {
		final TaskResponseType response = new TaskResponseType();
		response.setResponseCode(responseCode);
		response.setResponseDescription(responseDescription);
		response.setParameters(param);
		return response;
	}

	/**
	 * Execute.
	 *
	 * @return the task response type
	 * @throws AdapterException
	 *             the adapter exception
	 */
	public abstract TaskResponseType execute() throws AdapterException;

	/**
	 * Sets the endpoint.
	 *
	 * @param endpoint
	 *            the new endpoint
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

}
