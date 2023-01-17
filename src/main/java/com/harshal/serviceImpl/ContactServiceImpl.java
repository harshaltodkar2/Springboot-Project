package com.harshal.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshal.binding.Contact;
import com.harshal.repository.ContactRepository;
import com.harshal.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public String saveContact(Contact contact) {
		contact = repo.save(contact);
		if (contact.getContactId() != null) {
			return "Contact saved!";
		} else {
			return "Contact failed to save!";
		}
	}

	@Override
	public List<Contact> getAllContact() {

		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repo.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		} else {
			return null;
		}
	}

	@Override
	public String updateContact(Contact contact) {
		if(repo.existsById(contact.getContactId()))
		{
			repo.save(contact);
			return "Update successful!";
		}else {
		return "No record found!";
		}
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repo.existsById(contactId))
		{
			repo.deleteById(contactId);
			return "record deleted succesfully!";
		}else {
			return "No record found!";
			}
	}

}
