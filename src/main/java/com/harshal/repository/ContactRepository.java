package com.harshal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshal.binding.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
