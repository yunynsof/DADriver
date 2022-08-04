package hn.com.tigo.josm.orchestrator.da.driver.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.gson.Gson;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.da.driver.model.CreateIncluExcluInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.operations.CreateIncluAndExcluOperation;

public class CreateIncluAndExcluOperationTest extends AbstractTest {

	public CreateIncluAndExcluOperationTest() throws AdapterException {

	}

	@Test
	public void test() {
		final CreateIncluAndExcluOperation operation = new CreateIncluAndExcluOperation(getRequest());
		try {
			final TaskResponseType response = driver.executeDriver(operation);
			System.out.println(response.getResponseCode());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testErr() {
		final CreateIncluAndExcluOperation operation = new CreateIncluAndExcluOperation(getRequestErr());
		try {
			final TaskResponseType response = driver.executeDriver(operation);
			System.out.println(response.getResponseCode());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
			//fail(e.getMessage());
		}
	}

	public CreateIncluExcluInputModel getRequest() {

		String json = "{\r\n" + 
				"                       \"numpla\":\"123456789\",\r\n" + 
				"                       \"type_tran\":\"algo\",\r\n" + 
				"                       \"anexo\":\"algo\",\r\n" + 
				"                       \"noCard\":\"111111111\",\r\n" + 
				"                       \"cardIsueDate\":10,\r\n" + 
				"                       \"expDate\":10,\r\n" + 
				"                       \"status\":\"Bac\",\r\n" + 
				"                       \"cycle\":\"02\"\r\n" + 
				"                         }";

		CreateIncluExcluInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, CreateIncluExcluInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
	
	public CreateIncluExcluInputModel getRequestErr() {

		String json = "";

		CreateIncluExcluInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, CreateIncluExcluInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
}
