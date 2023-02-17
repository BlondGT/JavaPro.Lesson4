package ua.ithillel.lesson6.phonebook;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    void shouldAbonentAdd() {

       assertEquals(new Abonent("Michael", "0987654321"),
               phoneBook.add("Michael", "0987654321"));
    }

    @Test
    void shouldNameFind() {

        phoneBook.add("Michael", "0987654321");
        phoneBook.add("Alice", "0981234567");
        phoneBook.add("Alice", "0981234566");

       assertEquals(new Abonent("Michael", "0987654321"), phoneBook.find("Michael"));
    }

    @Test
    void shouldFindAll() {

        phoneBook.add("Michael", "0987654321");
        phoneBook.add("Alice", "0981234567");
        phoneBook.add("Alice", "0981234566");

        assertEquals(List.of(
                new Abonent("Alice", "0981234567"),
                new Abonent("Alice", "0981234566")
                ), phoneBook.findAll("Alice"));
    }
}