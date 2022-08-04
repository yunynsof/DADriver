package hn.com.tigo.josm.orchestrator.da.driver.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.gson.Gson;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.da.driver.model.CreateMPInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.operations.CreateMPOperation;

public class CreateMPOperationTest extends AbstractTest {

	public CreateMPOperationTest() throws AdapterException {

	}

	@Test
	public void test() {
		final CreateMPOperation operation = new CreateMPOperation(getRequest());
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
		final CreateMPOperation operation = new CreateMPOperation(getRequestErr());
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
				"                       \"name\":\"PALMA FORTIN HERIBERTO KERIM\",\r\n" + 
				"                       \"noCard\":\"123456789\",\r\n" + 
				"                       \"typeCard\":\"algo\",\r\n" + 
				"                       \"modalityCard\":\"algo\",\r\n" + 
				"                       \"year\":\"2022\",\r\n" + 
				"                       \"month\":10,\r\n" + 
				"                       \"issuingBank\":\"Bac\",\r\n" + 
				"                       \"processorBank\":\"Bac\",\r\n" + 
				"                       \"groupPayment\":1,\r\n" + 
				"                       \"cycle\":\"05\",\r\n" + 
				"                       \"status\":1222,\r\n" + 
				"                       \"acctCode\":\"123456\",\r\n" + 
				"                       \"subscriberId\":\"99000000\"\r\n" + 
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
