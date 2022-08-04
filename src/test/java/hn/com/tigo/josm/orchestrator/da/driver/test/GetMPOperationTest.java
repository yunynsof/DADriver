package hn.com.tigo.josm.orchestrator.da.driver.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.gson.Gson;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.da.driver.model.GetMPInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.operations.GetMPOperation;

public class GetMPOperationTest extends AbstractTest {

	public GetMPOperationTest() throws AdapterException {

	}

	@Test
	public void test() {
		final GetMPOperation operation = new GetMPOperation(getRequest());
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
		final GetMPOperation operation = new GetMPOperation(getRequestErr());
		try {
			final TaskResponseType response = driver.executeDriver(operation);
			System.out.println(response.getResponseCode());
			assertEquals(100, response.getResponseCode());
		} catch (AdapterException e) {
			//fail(e.getMessage());
		}
	}
	
	@Test
	public void testErr2() {
		final GetMPOperation operation = new GetMPOperation(getRequestErr2());
		try {
			final TaskResponseType response = driver.executeDriver(operation);
			System.out.println(response.getResponseCode());
			assertEquals(100, response.getResponseCode());
		} catch (AdapterException e) {
			//fail(e.getMessage());
		}
	}

	public GetMPInputModel getRequest() {

		String json = "{\r\n" + 
				"                          \"acctCode\": \"123456\",\r\n" + 
				"                          \"getCard\":1\r\n" + 
				"                         }";

		GetMPInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, GetMPInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
	
	public GetMPInputModel getRequestErr() {

		String json = "{\r\n" + 
				"                          \"acctCe\": \"6016672246\"\r\n" + 
				"                         }";

		GetMPInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, GetMPInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
	
	public GetMPInputModel getRequestErr2() {

		String json = "";

		GetMPInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, GetMPInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}

}
