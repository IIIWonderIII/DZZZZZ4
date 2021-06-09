package com.company.second;

import com.company.first.GroupingArray;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GroupingArray groupingArray = new GroupingArray();
        groupingArray.printGroupingArray();

        System.out.println("---------------------------------------------------------");

        Phonebook phonebook = new Phonebook();
        phonebook.add(new Contact("123", "Petrov"));
        phonebook.add(new Contact("234", "Petrov"));
        phonebook.add(new Contact("345", "Ivanov"));

        List<Contact> contacts = phonebook.get("Petrov");
        System.out.println(contacts);
    }
}
