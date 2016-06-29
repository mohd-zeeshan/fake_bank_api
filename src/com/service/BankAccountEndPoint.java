package com.service;

import com.entity.BankAccount;
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

@Api(name="bankaccountapi",version="v1", description="An API to manage bank accounts")
public class BankAccountEndPoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listBankAccount")
	public CollectionResponse<BankAccount> listBankAccount(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<BankAccount> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(BankAccount.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<BankAccount>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (BankAccount obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<BankAccount> builder().setItems(execute)
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
	@ApiMethod(name="listBankAccountByUserId")
	public CollectionResponse<BankAccount> getBankAccountByEmail(@Named("userId") Long userId, 
		 	@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<BankAccount> execute = null;
		
		
		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(BankAccount.class);
			//4644337115725824
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

			execute = (List<BankAccount>) query.execute(userId);
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (BankAccount obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<BankAccount> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
		 
	}
	

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getBankAccount")
	public BankAccount getBankAccount(@Named("accountNumber") Long accountNumber) {
		PersistenceManager mgr = getPersistenceManager();
		BankAccount bankAccount = null;
		try {
			bankAccount = mgr.getObjectById(BankAccount.class, accountNumber);
		} finally {
			mgr.close();
		}
		return bankAccount;
	}
	

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param Bank Account the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertBankAccount")
	
	public BankAccount insertBankAccount(BankAccount bankAccount, User user) throws UnauthorizedException {
		if (user == null) throw new UnauthorizedException("User is Not Valid");
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (bankAccount.getAccountNumber() != 0) {
				if (containsBankAccount(bankAccount)) {
					throw new EntityExistsException("Bank Account already exists");
				}
			}
			mgr.makePersistent(bankAccount);
		} finally {
			mgr.close();
		}
		return bankAccount;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param User Profile the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateBankAccount")
	public BankAccount updateBankAccount(BankAccount bankAccount) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsBankAccount(bankAccount)) {
				throw new EntityNotFoundException("Bank Account does not exist");
			}
			mgr.makePersistent(bankAccount);
		} finally {
			mgr.close();
		}
		return bankAccount;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeBankAccount")
	public void removeBankAccount(@Named("accountNumber") Long accountNumber) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			BankAccount bankAccount = mgr.getObjectById(BankAccount.class, accountNumber);
			mgr.deletePersistent(bankAccount);
		} finally {
			mgr.close();
		}
	}
	

	private boolean containsBankAccount(BankAccount bankAccount) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(BankAccount.class, bankAccount.getAccountNumber());
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
