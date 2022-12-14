package hn.com.tigo.josm.orchestrator.da.driver.model;

import java.io.Serializable;

/**
 * GetMPInputModel This model class is for the GetMP object.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 08-16-2022 05:33:27 AM 2022
 */
public class GetMPInputModel implements Serializable {

	/** Attribute that determine a Constant of serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Attribute that determine acctCode. */
	private String acctCode;
	
	/** Attribute that determine primaryIdentity. */
	private String primaryIdentity;
	
	/** Attribute that determine getCard. */
	private String getCard;

	/**
	 * Instantiates a new gets the MP input model.
	 */
	public GetMPInputModel() {
	}

	/**
	 * Gets the acct code.
	 *
	 * @return the acct code
	 */
	public String getAcctCode() {
		return acctCode;
	}

	/**
	 * Sets the acct code.
	 *
	 * @param acctCode the new acct code
	 */
	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}

	/**
	 * Gets the primary identity.
	 *
	 * @return the primary identity
	 */
	public String getPrimaryIdentity() {
		return primaryIdentity;
	}

	/**
	 * Sets the primary identity.
	 *
	 * @param primaryIdentity the new primary identity
	 */
	public void setPrimaryIdentity(String primaryIdentity) {
		this.primaryIdentity = primaryIdentity;
	}

	/**
	 * Gets the gets the card.
	 *
	 * @return the gets the card
	 */
	public String getGetCard() {
		return getCard;
	}

	/**
	 * Sets the gets the card.
	 *
	 * @param getCard the new gets the card
	 */
	public void setGetCard(String getCard) {
		this.getCard = getCard;
	}


}
