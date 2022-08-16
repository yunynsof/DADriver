package hn.com.tigo.josm.orchestrator.da.driver.model;

/**
 * CreateMPInputModel This model class is used for the CreateMP object.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrodriguez@hightech-corp.com />
 * @version 1.0.0
 * @see 
 * @since 08-16-2022 05:32:02 AM 2022
 */
public class CreateMPInputModel {

	/** Attribute that determine id. */
	private String id;
	
	/** Attribute that determine name. */
	private String name;

	/** Attribute that determine noCard. */
	private String noCard;

	/** Attribute that determine typeCard. */
	private String typeCard;

	/** Attribute that determine modalityCard. */
	private String modalityCard;

	/** Attribute that determine year. */
	private String year;

	/** Attribute that determine month. */
	private String month;

	/** Attribute that determine issuingBank. */
	private String issuingBank;

	/** Attribute that determine processorBank. */
	private String processorBank;

	/** Attribute that determine groupPayment. */
	private String groupPayment;

	/** Attribute that determine cycle. */
	private String cycle;

	/** Attribute that determine status. */
	private String status;

	/** Attribute that determine acctCode. */
	private String acctCode;

	/** Attribute that determine subscriberId. */
	private String subscriberId;
	
	/**
	 * Instantiates a new creates the MP input model.
	 */
	public CreateMPInputModel() {
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the no card.
	 *
	 * @param noCard the new no card
	 */
	public void setNoCard(String noCard) {
		this.noCard = noCard;
	}

	/**
	 * Gets the no card.
	 *
	 * @return the no card
	 */
	public String getNoCard() {
		return this.noCard;
	}

	/**
	 * Sets the type card.
	 *
	 * @param typeCard the new type card
	 */
	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}

	/**
	 * Gets the type card.
	 *
	 * @return the type card
	 */
	public String getTypeCard() {
		return this.typeCard;
	}

	/**
	 * Sets the modality card.
	 *
	 * @param modalityCard the new modality card
	 */
	public void setModalityCard(String modalityCard) {
		this.modalityCard = modalityCard;
	}

	/**
	 * Gets the modality card.
	 *
	 * @return the modality card
	 */
	public String getModalityCard() {
		return this.modalityCard;
	}

	/**
	 * Sets the issuing bank.
	 *
	 * @param issuingBank the new issuing bank
	 */
	public void setIssuingBank(String issuingBank) {
		this.issuingBank = issuingBank;
	}

	/**
	 * Gets the issuing bank.
	 *
	 * @return the issuing bank
	 */
	public String getIssuingBank() {
		return this.issuingBank;
	}

	/**
	 * Sets the processor bank.
	 *
	 * @param processorBank the new processor bank
	 */
	public void setProcessorBank(String processorBank) {
		this.processorBank = processorBank;
	}

	/**
	 * Gets the processor bank.
	 *
	 * @return the processor bank
	 */
	public String getProcessorBank() {
		return this.processorBank;
	}

	/**
	 * Sets the cycle.
	 *
	 * @param cycle the new cycle
	 */
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	/**
	 * Gets the cycle.
	 *
	 * @return the cycle
	 */
	public String getCycle() {
		return this.cycle;
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
	 * Gets the acct code.
	 *
	 * @return the acct code
	 */
	public String getAcctCode() {
		return this.acctCode;
	}

	/**
	 * Sets the subscriber id.
	 *
	 * @param subscriberId the new subscriber id
	 */
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	/**
	 * Gets the subscriber id.
	 *
	 * @return the subscriber id
	 */
	public String getSubscriberId() {
		return this.subscriberId;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the year.
	 *
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * Sets the year.
	 *
	 * @param year the new year
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * Gets the month.
	 *
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * Sets the month.
	 *
	 * @param month the new month
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * Gets the group payment.
	 *
	 * @return the group payment
	 */
	public String getGroupPayment() {
		return groupPayment;
	}

	/**
	 * Sets the group payment.
	 *
	 * @param groupPayment the new group payment
	 */
	public void setGroupPayment(String groupPayment) {
		this.groupPayment = groupPayment;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
		

}
