package com.service;

import com.entity.UserProfile;
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

@Api(name="userprofileapi",version="v1", description="An API to manage user profiles")
public class UserProfileEndPoint {


	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listUserProfile")
	public CollectionResponse<UserProfile> listUserProfile(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		PersistenceManager mgr = null;
		Cursor cursor = null;
		List<UserProfile> execute = null;

		try {
			mgr = getPersistenceManager();
			Query query = mgr.newQuery(UserProfile.class);
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				HashMap<String, Object> extensionMap = new HashMap<String, Object>();
				extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
				query.setExtensions(extensionMap);
			}

			if (limit != null) {
				query.setRange(0, limit);
			}

			execute = (List<UserProfile>) query.execute();
			cursor = JDOCursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (UserProfile obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<UserProfile> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getUserProfile")
	public UserProfile getUserProfile(@Named("userId") Long userId) {
		PersistenceManager mgr = getPersistenceManager();
		UserProfile userProfile = null;
		try {
			userProfile = mgr.getObjectById(UserProfile.class, userId);
		} finally {
			mgr.close();
		}
		return userProfile;
	}
	

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param User Profile the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertUserProfile")
	
	public UserProfile insertUserProfile(UserProfile userProfile, User user) throws UnauthorizedException {
		if (user == null) throw new UnauthorizedException("User is Not Valid");
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (userProfile.getUserId() != null) {
				if (containsUserProfile(userProfile)) {
					throw new EntityExistsException("User Profile already exists");
				}
			}
			mgr.makePersistent(userProfile);
		} finally {
			mgr.close();
		}
		return userProfile;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param User Profile the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateUserProfile")
	public UserProfile updateUserProfile(UserProfile userProfile) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			if (!containsUserProfile(userProfile)) {
				throw new EntityNotFoundException("User Profile does not exist");
			}
			mgr.makePersistent(userProfile);
		} finally {
			mgr.close();
		}
		return userProfile;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeUserProfile")
	public void removeUserProfile(@Named("userId") Long userId) {
		PersistenceManager mgr = getPersistenceManager();
		try {
			UserProfile userProfile = mgr.getObjectById(UserProfile.class, userId);
			mgr.deletePersistent(userProfile);
		} finally {
			mgr.close();
		}
	}

	private boolean containsUserProfile(UserProfile userProfile) {
		PersistenceManager mgr = getPersistenceManager();
		boolean contains = true;
		try {
			mgr.getObjectById(UserProfile.class, userProfile.getUserId());
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

////////////////////////////
	//////////////////////////
	//////////////////////////

	/*
	public static List<UserProfile> users = new ArrayList<UserProfile>();

	@ApiMethod(name="add")
	public UserProfile addUserProfile(@Named("firstName") String firstName, @Named("lastName") String lastName, @Named("email") String email, @Named("password") String password, @Named("userType") String userType) throws Exception {

		int index = users.indexOf(new UserProfile(email));
		if (index != -1) throw new Exception("User already exists");
		UserProfile u = new UserProfile(firstName, lastName, email, password, userType);
		users.add(u);
		return u;
	}

	@ApiMethod(name="update")
	public UserProfile updateUserProfile(UserProfile u) throws Exception {
		int index = users.indexOf(u);
		if (index == -1) throw new Exception("User does not exist");
		UserProfile currentUserProfile = users.get(index);


		currentUserProfile.setFirstName(u.getFirstName());
		currentUserProfile.setLastName(u.getLastName());
		currentUserProfile.setEmail(u.getEmail());
		currentUserProfile.setPassword(u.getPassword());
		currentUserProfile.setUserType(u.getUserType());
		currentUserProfile.setBankAccounts(u.getBankAccounts());
		currentUserProfile.setTransactions(u.getTransactions());

		return u;
	}

	@ApiMethod(name="remove")
	public void removeUserProfile(@Named("email") String email) throws Exception {
		int index = users.indexOf(new UserProfile(email));
		if (index == -1){
			throw new Exception("User does not exist");
		}else{
			users.remove(index);
		}

	}

	@ApiMethod(name="list")
	public List<UserProfile> getUserProfile() {
		return users;
	}

	@ApiMethod(name="listByEmail")
	public UserProfile getUserProfileByEmail(@Named("email") String email) {
		UserProfile result = null;
		for (UserProfile user : users) {
			if (user.getEmail().indexOf(email) != -1) {
				result = user;
				break;
			}
		}
		return result;
	}
	*/
}
