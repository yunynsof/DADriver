
package hn.com.tigo.josm.orchestrator.da.driver.core;

import java.util.Map;

import hn.com.tigo.josm.common.exceptions.HttpClientException;
import hn.com.tigo.josm.common.http.Buildable;
import hn.com.tigo.josm.common.http.PoolingBuilder;
import hn.com.tigo.josm.orchestrator.da.driver.util.DAConstantsDriver;
import hn.com.tigo.josm.common.http.GetMethod;

import javax.ws.rs.core.Response;

/**
 * HttpConnectorGet.
 *
 * @author Yuny Rene Rodriguez Perez 
 * @version 1.0.0
 * @see java
 * @since 06-09-2022 03:49:40 PM 2022
 */
public class HttpConnectorGet extends GetMethod<String> {

	/** Attribute that determine buildable. */
	private static Buildable buildable = PoolingBuilder.getInstance(DAConstantsDriver.CONFIG_NAME);

	/**
	 * Instantiates a new http connector get.
	 *
	 * @param url
	 *            the url
	 * @param properties
	 *            the properties
	 */
	public HttpConnectorGet(final String url, final Map<String, String> properties) {
		super(DAConstantsDriver.STATIC_URL, url, buildable, properties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * hn.com.tigo.josm.common.http.ServiceInvoker#getResponse(java.lang.String,
	 * int, java.lang.String)
	 */
	@Override
	public String getResponse(final String response, final int responseCode, final String responseMessage) {
		if (responseCode == Response.Status.OK.getStatusCode()
				|| responseCode == Response.Status.NOT_FOUND.getStatusCode()
				|| responseCode == Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()) {
			return response;
		}
		throw new HttpClientException(response);
	}
}
