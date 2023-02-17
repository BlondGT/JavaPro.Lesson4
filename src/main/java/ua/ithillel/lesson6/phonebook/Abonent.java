package ua.ithillel.lesson6.phonebook;

import java.util.Objects;

public class Abonent {

    private final String name;
    private final String phoneNumber;

    public Abonent(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abonent register = (Abonent) o;
        return name.equals(register.name) && phoneNumber.equals(register.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
