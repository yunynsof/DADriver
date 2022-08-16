package hn.com.tigo.josm.orchestrator.da.driver.util;

/**
 * DAConstantsDriver This class contains the constants needed for the DADriver process.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrodriguez@hightech-corp.com />
 * @version 1.0.0
 * @see 
 * @since 08-16-2022 05:38:39 AM 2022
 */
public class DAConstantsDriver {

	/** Attribute that determine a Constant of STATIC_URL. */
	public static final String STATIC_URL = "http://192.168.159.46:7004/ApisDA/da/";

	/** Attribute that determine a Constant of URL. */
	public static final String URL = "url";

	/** Attribute that determine a Constant of ENDPOINT. */
	public static final String ENDPOINT = "endPoint";

	/** Attribute that determine a Constant of CONFIG_NAME. */
	public static final String CONFIG_NAME = "DA";

	/** Attribute that determine a Constant of CODE_SUCCESS. */
	public static final int CODE_SUCCESS = 0;

	/** Attribute that determine a Constant of OPERATION_SUCCESSFULLY. */
	public static final String OPERATION_SUCCESSFULLY = "Operation successful.";

	/** Attribute that determine a Constant of SERVICE_ERROR. */
	public static final String SERVICE_ERROR = "Error in service execution.";

	/** Attribute that determine a Constant of RESPONSE_CODE. */
	public static final String RESPONSE_CODE = "code";

	/** Attribute that determine a Constant of RESPONSE_DESCRIPTION. */
	public static final String RESPONSE_DESCRIPTION = "description";

	//////////////////////////////////////////////////////////////////////////////////////

	/** Attribute that determine a Constant of PARAM_RESPONSE_GETMP. */
	public static final String PARAM_RESPONSE_GETMP = "cardInfo";
	
	/** Attribute that determine a Constant of PARAM_NAME_RESPONSE_GETMP. */
	public static final String PARAM_NAME_RESPONSE = "JSON_RESPONSE";

	/** Attribute that determine a Constant of METHOD_GETMP. */
	public static final String METHOD_GETMP = "DAGetCardInfoByClientApi";

	/** Attribute that determine a Constant of PARAM_REQ_GETMP1. */
	public static final String PARAM_REQ_GETMP1 = "acct";

	/** Attribute that determine a Constant of PARAM_REQ_GETMP2. */
	public static final String PARAM_REQ_GETMP2 = "primaryIdentity";

	/** Attribute that determine a Constant of JSON_INVALID_GETMP. */
	public static final String JSON_INVALID_GETMP = "Check the status of service rest of DAGetCardInfoByClientApi.";

	//////////////////////////////////////////////////////////////////////////////////////

	/** Attribute that determine a Constant of METHOD_CREATEMP. */
	public static final String METHOD_CREATEMP = "DACreateMPApi";

	/** Attribute that determine a Constant of JSON_INVALID_CREATEMP. */
	public static final String JSON_INVALID_CREATEMP = "Check the status of service rest of DACreateMPApi.";

	//////////////////////////////////////////////////////////////////////////////////////

	/** Attribute that determine a Constant of METHOD_UPDATEMP. */
	public static final String METHOD_UPDATEMP = "DAUpdateMPApi";

	/** Attribute that determine a Constant of JSON_INVALID_UPDATEMP. */
	public static final String JSON_INVALID_UPDATEMP = "Check the status of service rest of DAUpdateMPApi.";

	//////////////////////////////////////////////////////////////////////////////////////

	/** Attribute that determine a Constant of METHOD_CREATEINCLUEXCLU. */
	public static final String METHOD_CREATEINCLUEXCLU = "DACreateIncluExcluApi";

	/** Attribute that determine a Constant of JSON_INVALID_CREATEINCLUEXCLU. */
	public static final String JSON_INVALID_CREATEINCLUEXCLU = "Check the status of service rest of DACreateIncluExcluApi.";

	//////////////////////////////////////////////////////////////////////////////////////

	/** Attribute that determine a Constant of METHOD_ACCOUNTDELETE. */
	public static final String METHOD_ACCOUNTDELETE = "DADeleteMPApi";

	/** Attribute that determine a Constant of JSON_INVALID_ACCOUNTDELETE. */
	public static final String JSON_INVALID_ACCOUNTDELETE = "Check the status of service rest of DADeleteMPApi.";
	
	/** Attribute that determine a Constant of PARAM_RESPONSE_ACCOUNTDELETE. */
	public static final String PARAM_RESPONSE_ACCOUNTDELETE = "uuid";
}
