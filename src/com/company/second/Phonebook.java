package com.company.second;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Phonebook {

    private final List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<>();
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> get(String lastName) {
        return contacts.stream().filter(contact -> contact.getLastName().equalsIgnoreCase(lastName)).collect(Collectors.toList());
    }

}
