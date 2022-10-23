package com.hildi.javacore.sprint3.task10;

import java.util.ArrayList;
import java.util.List;

public class ContactBook<T extends Contact> {
    List<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false;
        for (T contact : contacts) {
            if (contact.name.equals(name)) {
                contactPresented = true;
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
            }
        }
        if (!contactPresented) {
            System.out.println("Не найден контакт с указанным именем.");
        }
    }

}
