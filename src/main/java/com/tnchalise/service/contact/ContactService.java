package com.tnchalise.service.contact;

import java.util.List;

import com.tnchalise.jpa.entity.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
