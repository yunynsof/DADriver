package hn.com.tigo.josm.orchestrator.da.driver.model;

import java.util.List;

/**
 * AccountDeleteInputModel This model class is for the Account Delete object.
 *
 * @author Yuny Rene Rodriguez Perez <mailto: yrodriguez@hightech-corp.com />
 * @version 1.0.0
 * @see 
 * @since 08-16-2022 05:31:04 AM 2022
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
