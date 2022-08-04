package hn.com.tigo.josm.orchestrator.da.driver.test;

import javax.ejb.embeddable.EJBContainer;

import org.apache.log4j.Logger;

import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.da.driver.core.DADriver;


public class AbstractTest {

	/** Attribute that determine container. */
	protected static EJBContainer container;

	/** Attribute that determine driver. */
	protected static DADriver driver;

	/** Attribute that determine a Constant of LOGGER. */
	protected static final transient Logger LOGGER = Logger.getLogger(AbstractTest.class);
	
	/** Attribute that determine endpoint. */
	final String ip = "http://192.168.159.46:7004/ApisDA/da/";

	/**
	 * Instantiates a new abstract test.
	 *
	 * @throws AdapterException the adapter exception
	 */
	public AbstractTest() throws AdapterException {
		container = EjbContainerContext.INSTANCE.getContainer();
		driver = new DADriver(ip);
	}

}
