package hn.com.tigo.josm.orchestrator.da.driver.model;

/**
 * CreateIncluExcluInputModel.
 *
 * @author Yuny Rene Rodriguez Perez 
 * @version 1.0.0
 * @see java
 * @since 06-09-2022 03:48:54 PM 2022
 */
public class CreateIncluExcluInputModel {

	/** Attribute that determine numpla. */
	private String numpla;

	/** Attribute that determine type_tran. */
	private String type_tran;

	/** Attribute that determine anexo. */
	private String anexo;

	/** Attribute that determine noCard. */
	private String noCard;

	/** Attribute that determine cardIsueDate. */
	private String cardIsueDate;

	/** Attribute that determine expDate. */
	private String expDate;

	/** Attribute that determine status. */
	private String status;

	/** Attribute that determine cycle. */
	private String cycle;
	
	/**
	 * Instantiates a new creates the inclu exclu input model.
	 */
	public CreateIncluExcluInputModel() {
	}

	/**
	 * Sets the numpla.
	 *
	 * @param numpla the new numpla
	 */
	public void setNumpla(String numpla) {
		this.numpla = numpla;
	}

	/**
	 * Gets the numpla.
	 *
	 * @return the numpla
	 */
	public String getNumpla() {
		return this.numpla;
	}

	/**
	 * Sets the type tran.
	 *
	 * @param type_tran the new type tran
	 */
	public void setType_tran(String type_tran) {
		this.type_tran = type_tran;
	}

	/**
	 * Gets the type tran.
	 *
	 * @return the type tran
	 */
	public String getType_tran() {
		return this.type_tran;
	}

	/**
	 * Sets the anexo.
	 *
	 * @param anexo the new anexo
	 */
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	/**
	 * Gets the anexo.
	 *
	 * @return the anexo
	 */
	public String getAnexo() {
		return this.anexo;
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
	 * Gets the card isue date.
	 *
	 * @return the card isue date
	 */
	public String getCardIsueDate() {
		return cardIsueDate;
	}

	/**
	 * Sets the card isue date.
	 *
	 * @param cardIsueDate the new card isue date
	 */
	public void setCardIsueDate(String cardIsueDate) {
		this.cardIsueDate = cardIsueDate;
	}

	/**
	 * Gets the exp date.
	 *
	 * @return the exp date
	 */
	public String getExpDate() {
		return expDate;
	}

	/**
	 * Sets the exp date.
	 *
	 * @param expDate the new exp date
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return this.status;
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

}
