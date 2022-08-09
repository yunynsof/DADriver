package hn.com.tigo.josm.orchestrator.da.driver.operations;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import hn.com.tigo.josm.common.adapter.dto.ParameterArray;
import hn.com.tigo.josm.common.adapter.dto.ParameterType;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.common.exceptions.HttpClientException;
import hn.com.tigo.josm.common.exceptions.enumerators.AdapterErrorCode;
import hn.com.tigo.josm.orchestrator.da.driver.core.AbstractDriver;
import hn.com.tigo.josm.orchestrator.da.driver.model.CreateIncluExcluInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.util.DAConstantsDriver;

/**
 * CreateIncluAndExcluOperation.
 *
 * @author Yuny Rene Rodriguez Perez 
 * @version 1.0.0
 * @see java
 * @since 06-09-2022 03:50:49 PM 2022
 */
public class CreateIncluAndExcluOperation extends AbstractDriver {

	/** Attribute that determine request. */
	private final CreateIncluExcluInputModel request;

	/**
	 * Instantiates a new creates the inclu and exclu operation.
	 *
	 * @param request the request
	 */
	public CreateIncluAndExcluOperation(final CreateIncluExcluInputModel request) {
		this.request = request;
	}

	/* (non-Javadoc)
	 * @see hn.com.tigo.josm.orchestrator.da.driver.core.AbstractDriver#execute()
	 */
	@Override
	public TaskResponseType execute() throws AdapterException {
		try {
			JSONObject jsonObject;
			String url_final = this.endpoint + DAConstantsDriver.METHOD_CREATEINCLUEXCLU;
			Gson gson = new Gson();
			String jsonRequest = gson.toJson(this.request);
			final String response = super.post(url_final, jsonRequest);
			jsonObject = new JSONObject(response);
			
			ParameterArray param = new ParameterArray();
			param.getParameter().add(getParameter(jsonObject.toString(),
					DAConstantsDriver.PARAM_NAME_RESPONSE));
			
			return super.createResponse(Integer.valueOf(jsonObject.get(DAConstantsDriver.RESPONSE_CODE).toString()), 
					jsonObject.get(DAConstantsDriver.RESPONSE_DESCRIPTION).toString(), param);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, e.getMessage());
		}
	}
	
	private ParameterType getParameter(final String value, final String constants) {

		ParameterType parameterResponse = new ParameterType();
		parameterResponse.setName(constants);
		parameterResponse.setValue(value);
		return parameterResponse;
	}

}