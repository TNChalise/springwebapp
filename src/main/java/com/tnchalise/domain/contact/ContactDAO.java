package com.tnchalise.domain.contact;

import java.util.List;

import com.tnchalise.jpa.entity.*;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);

}
