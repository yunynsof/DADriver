package hn.com.tigo.josm.orchestrator.da.driver.model;

import java.util.List;

/**
 * AccountDeleteInputModel.
 *
 * @author Yuny Rene Rodriguez Perez 
 * @version 1.0.0
 * @see java
 * @since 06-09-2022 03:48:45 PM 2022
 */
public class AccountDeleteInputModel {

	/** Attribute that determine deleteList. */
	private List<DeleteList> deleteList;

	/**
	 * Sets the delete list.
	 *
	 * @param deleteList the new delete list
	 */
	public void setDeleteList(List<DeleteList> deleteList) {
		this.deleteList = deleteList;
	}

	/**
	 * Gets the delete list.
	 *
	 * @return the delete list
	 */
	public List<DeleteList> getDeleteList() {
		return this.deleteList;
	}
}
