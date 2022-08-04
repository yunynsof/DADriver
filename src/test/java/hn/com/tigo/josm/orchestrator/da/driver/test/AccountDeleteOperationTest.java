package hn.com.tigo.josm.orchestrator.da.driver.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.gson.Gson;

import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.da.driver.model.AccountDeleteInputModel;
import hn.com.tigo.josm.orchestrator.da.driver.operations.AccountDeleteOperation;

public class AccountDeleteOperationTest extends AbstractTest {

	public AccountDeleteOperationTest() throws AdapterException {

	}

	@Test
	public void test() {
		final AccountDeleteOperation operation = new AccountDeleteOperation(getRequest());
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
		final AccountDeleteOperation operation = new AccountDeleteOperation(getRequestErr());
		try {
			final TaskResponseType response = driver.executeDriver(operation);
			System.out.println(response.getResponseCode());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
			//fail(e.getMessage());
		}
	}

	public AccountDeleteInputModel getRequest() {

		String json = "{\r\n" + 
				"	\"deleteList\": [{\r\n" + 
				"			\"subscriber\": \"99909999\",\r\n" + 
				"			\"account\": \"123456\",\r\n" + 
				"			\"bindNumber\": \"6578\",\r\n" + 
				"			\"expirationDate\": \"202103\",\r\n" + 
				"			\"cycle\": \"05\",\r\n" + 
				"			\"bank\": \"Ficohsa\",\r\n" + 
				"			\"amount\": \"200.00\",\r\n" + 
				"			\"transactionDate\": \"20200303\",\r\n" + 
				"			\"error\": \"01\",\r\n" + 
				"			\"message\": \"Datos del Afiliado Invalidos.\"\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"subscriber\": \"99909999\",\r\n" + 
				"			\"account\": \"123456\",\r\n" + 
				"			\"bindNumber\": \"6578\",\r\n" + 
				"			\"expirationDate\": \"202103\",\r\n" + 
				"			\"cycle\": \"05\",\r\n" + 
				"			\"bank\": \"Ficohsa\",\r\n" + 
				"			\"amount\": \"200.00\",\r\n" + 
				"			\"transactionDate\": \"20200303\",\r\n" + 
				"			\"error\": \"01\",\r\n" + 
				"			\"message\": \"Datos del Afiliado Invalidos.\"\r\n" + 
				"		}\r\n" + 
				"	]\r\n" + 
				"}";

		AccountDeleteInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, AccountDeleteInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
	
	public AccountDeleteInputModel getRequestErr() {

		String json = "";

		AccountDeleteInputModel testeo = null;
		try {
			Gson gson = new Gson();
			testeo = gson.fromJson(json, AccountDeleteInputModel.class);
			return testeo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testeo;
	}
}
