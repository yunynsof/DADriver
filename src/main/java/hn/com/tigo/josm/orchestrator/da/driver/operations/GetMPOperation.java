package hn.com.tigo.josm.orchestrator.da.driver.operations;

import org.json.JSONException;
import org.json.JSONObject;

import hn.com.tigo.josm.common.adapter.dto.ParameterArray;
import hn.com.tigo.josm.common.adapter.dto.ParameterType;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.common.exceptions.HttpClientException;
import hn.com.tigo.josm.common.exceptions.enumerators.AdapterErrorCode;
import hn.com.tigo.josm.orchestrator.da.driver.core.AbstractDriver;
import hn.com.tigo.josm.orchestrator.da.driver.model.GetMPInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.util.DAConstantsDriver;

/**
 * GetMPOperation This class contains the operational logic of the GetMP task.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrodriguez@hightech-corp.com />
 * @version 1.0.0
 * @see 
 * @since 08-16-2022 05:36:59 AM 2022
 */
public class GetMPOperation extends AbstractDriver {

	/** Attribute that determine request. */
	private final GetMPInputModel request;

	/**
	 * Instantiates a new gets the MP operation.
	 *
	 * @param request
	 *            the request
	 */
	public GetMPOperation(final GetMPInputModel request) {
		this.request = request;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hn.com.tigo.josm.orchestrator.da.driver.core.AbstractDriver#execute()
	 */
	@Override
	public TaskResponseType execute() throws AdapterException {
		try {
			JSONObject jsonObject;
			String url_final = this.endpoint + DAConstantsDriver.METHOD_GETMP;

			if (this.request != null) {

				if (this.request.getAcctCode() != null) {
					url_final = url_final + "/"	+ DAConstantsDriver.PARAM_REQ_GETMP1+ "/" + this.request.getAcctCode();
				} else {
					url_final = url_final + "/" + DAConstantsDriver.PARAM_REQ_GETMP2+ "/" + this.request.getPrimaryIdentity();
				}
				if (this.request.getGetCard() != null) {
					url_final = url_final + "?getCard=" + this.request.getGetCard();
				}
			}
			final String response = super.get(url_final);

			try {
				if (response == null) {
					final String message = DAConstantsDriver.SERVICE_ERROR;
					LOGGER.error(message);
					throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, message);
				} else {
					jsonObject = new JSONObject(response);
				}

			} catch (JSONException e) {
				LOGGER.error(e);
				throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, DAConstantsDriver.JSON_INVALID_GETMP);
			}
			if (jsonObject == null || !jsonObject.has(DAConstantsDriver.RESPONSE_CODE)) {
				final String message = DAConstantsDriver.SERVICE_ERROR;
				LOGGER.error(message);
				throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, message);
			}

			ParameterArray param = new ParameterArray();
			if (!jsonObject.has(DAConstantsDriver.PARAM_RESPONSE_GETMP)) {

				return super.createResponse(Integer.valueOf(jsonObject.get(DAConstantsDriver.RESPONSE_CODE).toString()),
						jsonObject.get(DAConstantsDriver.RESPONSE_DESCRIPTION).toString(), param);
			} else {
				param.getParameter().add(getParameter(jsonObject.toString(), DAConstantsDriver.PARAM_NAME_RESPONSE));
			}

			return super.createResponse(Integer.valueOf(jsonObject.get(DAConstantsDriver.RESPONSE_CODE).toString()),
					DAConstantsDriver.OPERATION_SUCCESSFULLY, param);
		} catch (HttpClientException e) {
			LOGGER.error(e.getMessage());
			throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, e.getMessage());
		}
	}

	/**
	 * Gets the parameter.
	 *
	 * @param value
	 *            the value
	 * @param constants
	 *            the constants
	 * @return the parameter
	 */
	private ParameterType getParameter(final String value, final String constants) {

		ParameterType parameterResponse = new ParameterType();
		parameterResponse.setName(constants);
		parameterResponse.setValue(value);
		return parameterResponse;
	}

}
