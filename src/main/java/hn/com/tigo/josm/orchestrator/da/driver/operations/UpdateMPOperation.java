package hn.com.tigo.josm.orchestrator.da.driver.operations;

import org.json.JSONObject;

import com.google.gson.Gson;

import hn.com.tigo.josm.common.adapter.dto.ParameterArray;
import hn.com.tigo.josm.common.adapter.dto.ParameterType;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.common.exceptions.HttpClientException;
import hn.com.tigo.josm.common.exceptions.enumerators.AdapterErrorCode;
import hn.com.tigo.josm.orchestrator.da.driver.core.AbstractDriver;
import hn.com.tigo.josm.orchestrator.da.driver.model.CreateMPInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.util.DAConstantsDriver;

/**
 * UpdateMPOperation This class contains the operational logic of the UpdateMP task.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 08-16-2022 05:37:25 AM 2022
 */
public class UpdateMPOperation extends AbstractDriver {

	/** Attribute that determine request. */
	private final CreateMPInputModel request;

	/**
	 * Instantiates a new update MP operation.
	 *
	 * @param request
	 *            the request
	 */
	public UpdateMPOperation(final CreateMPInputModel request) {
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
			String url_final = this.endpoint + DAConstantsDriver.METHOD_UPDATEMP;
			Gson gson = new Gson();
			String jsonRequest = gson.toJson(this.request);
			final String response = super.post(url_final, jsonRequest);

			jsonObject = new JSONObject(response);

			ParameterArray param = new ParameterArray();
			param.getParameter().add(getParameter(jsonObject.toString(), DAConstantsDriver.PARAM_NAME_RESPONSE));

			return super.createResponse(Integer.valueOf(jsonObject.get(DAConstantsDriver.RESPONSE_CODE).toString()),
					jsonObject.get(DAConstantsDriver.RESPONSE_DESCRIPTION).toString(), param);

		} catch (HttpClientException e) {
			LOGGER.error(e.getMessage());
			throw new AdapterException(AdapterErrorCode.PLATFORM_ERROR, e.getMessage());
		}
	}

	/**
	 * Gets the parameter.
	 *
	 * @param value the value
	 * @param constants the constants
	 * @return the parameter
	 */
	private ParameterType getParameter(final String value, final String constants) {

		ParameterType parameterResponse = new ParameterType();
		parameterResponse.setName(constants);
		parameterResponse.setValue(value);
		return parameterResponse;
	}
}
