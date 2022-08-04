package hn.com.tigo.josm.orchestrator.da.driver.test;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ GetMPOperationTest.class,
	CreateMPOperationTest.class,
	CreateIncluAndExcluOperationTest.class,
	UpdateMPOperationTest.class,
	AccountDeleteOperationTest.class
	            })

public class AllTest {

	@AfterClass
	public static void tearDownAfterClass() throws IOException {
		EjbContainerContext.INSTANCE.close();
	}
}
