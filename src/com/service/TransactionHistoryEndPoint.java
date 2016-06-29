package com.service;

import com.entity.TransactionHistory;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.UnauthorizedException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.users.User;
import com.google.appengine.datanucleus.query.JDOCursorHelper;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name="transactionhistoryapi",version="v1", description="An API to manage Transactions")
public class TransactionHistoryEndPoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listTransactionHistory")
	public CollectionResponse<TransactionHistory> listTransactionHistory(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<TransactionHistory> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(TransactionHistory.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<TransactionHistory>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (TransactionHistory obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<TransactionHistory> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}
	
	/**
	 * This method lists all the bank accounts associated with a user .
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name="listTransactionHistoryByUserId")
	public CollectionResponse<TransactionHistory> getTransactionHistoryByUserId(@Named("userId") Long userId, 
		 	@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<TransactionHistory> execute = null;
		
		
		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(TransactionHistory.class);
			query.setFilter("userId == userIdParam");
			query.declareParameters("Long userIdParam");
			
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<TransactionHistory>) query.execute(userId);
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (TransactionHistory obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<TransactionHistory> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
		 
	}
	

	/**
	 * This method gets the entity having primary key transactionId. It uses HTTP GET method.
	 *
	 * @param transactionId the primary key of the java bean.
	 * @return The entity with primary key transactionId.
	 */
	@ApiMethod(name = "getTransactionHistory")
	public TransactionHistory getTransactionHistory(@Named("transactionId") Long transactionId) {
		PersistenceManager mgr = getPersistenceManager();
		TransactionHistory transactionHistory = null;
		try {
			transactionHistory = mgr.getObjectById(TransactionHistory.class, transactionId);
		} finally {
			mgr.close();
		}
		return transactionHistory;
	}
	

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param Bank Account the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertTransactionHistory")
	public TransactionHistory insertTransactionHistory(TransactionHistory transactionHistory, User user) throws UnauthorizedException {
		if (user == null) throw new UnauthorizedException("User is Not Valid");
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (transactionHistory.getTransactionId() != null) {
				if (containsTransactionHistory(transactionHistory)) {
					throw new EntityExistsException("Transaction already exists");
				}
			}
			mgr.makePersistent(transactionHistory);
		} finally {
			mgr.close();
		}
		return transactionHistory;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param User Profile the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateTransactionHistory")
	public TransactionHistory updateTransactionHistory(TransactionHistory transactionHistory) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsTransactionHistory(transactionHistory)) {
				throw new EntityNotFoundException("Bank Account does not exist");
			}
			mgr.makePersistent(transactionHistory);
		} finally {
			mgr.close();
		}
		return transactionHistory;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeTransactionHistory")
	public void removeTransactionHistory(@Named("transactionId") Long transactionId) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			TransactionHistory transactionHistory = mgr.getObjectById(TransactionHistory.class, transactionId);
			mgr.deletePersistent(transactionHistory);
		} finally {
			mgr.close();
		}
	}
	

	private boolean containsTransactionHistory(TransactionHistory transactionHistory) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(TransactionHistory.class, transactionHistory.getTransactionId());
		} catch (javax.jdo.JDOObjectNotFoundException ex) {
			contains = false;
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static PersistenceManager getPersistenceManager() {
		return PMF.get().getPersistenceManager();
	}
}
