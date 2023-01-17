package com.harshal.service;

import java.util.List;

import com.harshal.binding.Contact;

public interface ContactService {

	public String saveContact(Contact contact);

	public List<Contact> getAllContact();

	public Contact getContactById(Integer contactId);

	public String updateContact(Contact contact);

	public String deleteContactById(Integer contactId);
}
