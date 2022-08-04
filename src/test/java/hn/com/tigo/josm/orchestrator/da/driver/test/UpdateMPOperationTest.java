package hn.com.tigo.josm.orchestrator.da.driver.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.gson.Gson;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.da.driver.model.CreateMPInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.operations.UpdateMPOperation;

public class UpdateMPOperationTest extends AbstractTest {

	public UpdateMPOperationTest() throws AdapterException {

	}

	@Test
	public void test() {
		final UpdateMPOperation operation = new UpdateMPOperation(getRequest());
		try {
			final TaskResponseType response = driver.executeDriver(operation);
			System.out.println(response.getResponseCode());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testError() {
		final UpdateMPOperation operation = new UpdateMPOperation(getRequestErr());
		try {
			final TaskResponseType response = driver.executeDriver(operation);
			System.out.println(response.getResponseCode());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
			//fail(e.getMessage());
		}
	}

	public CreateMPInputModel getRequest() {

		String json = "{\r\n" + 
				"                           \"id\":\"3eacd6ae-b100-43bb-82d6-eabceb55808a\",\r\n" + 
				"                           \"name\":\"PALMA PALMA PALMa\"\r\n" + 
				"                         }";

		CreateMPInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, CreateMPInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
	
	public CreateMPInputModel getRequestErr() {

		String json = "";

		CreateMPInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, CreateMPInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
}
