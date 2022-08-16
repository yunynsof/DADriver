package hn.com.tigo.josm.orchestrator.da.driver.core;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.ws.rs.core.Response;

import hn.com.tigo.josm.common.exceptions.HttpClientException;
import hn.com.tigo.josm.common.http.Buildable;
import hn.com.tigo.josm.common.http.DeleteMethod;
import hn.com.tigo.josm.common.http.PoolingBuilder;
import hn.com.tigo.josm.orchestrator.da.driver.util.DAConstantsDriver;



/**
 * HttpConnectorDelete This class is used to call the delete method from the commons project.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrodriguez@hightech-corp.com />
 * @version 1.0.0
 * @see 
 * @since 08-16-2022 05:29:06 AM 2022
 */
public class HttpConnectorDelete extends DeleteMethod<String> {
	
	/** Attribute that determine buildable. */
	private static Buildable buildable = PoolingBuilder.getInstance(DAConstantsDriver.CONFIG_NAME);

	
	/**
	 * Instantiates a new http connector delete.
	 *
	 * @param url the url
	 * @param properties the properties
	 */
	public HttpConnectorDelete(final String url, final Map<String, String> properties) {
		super(DAConstantsDriver.STATIC_URL, url, buildable, properties);
	}

	/* (non-Javadoc)
	 * @see hn.com.tigo.josm.common.http.ServiceInvoker#getResponse(java.lang.String, int, java.lang.String)
	 */
	@Override
	protected String getResponse(final String response, final int responseCode, final String responseMessage) throws HttpClientException {
		if (responseCode == Response.Status.OK.getStatusCode()
				|| responseCode == Response.Status.NOT_FOUND.getStatusCode()
				|| responseCode == Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()) {
			return response;
		}
		throw new HttpClientException(response);
	}

	/* (non-Javadoc)
	 * @see hn.com.tigo.josm.common.http.ServiceInvoker#loadEntity(java.lang.String, java.lang.String)
	 */
	@Override
	protected void loadEntity(final String request, final String charset) throws UnsupportedEncodingException {
		return;
	}

}
