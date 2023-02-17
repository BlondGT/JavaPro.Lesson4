package ua.ithillel.lesson6.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private final List<Abonent> records = new ArrayList<>();

    public Abonent add(String name, String numberPhone) {

        Abonent element = new Abonent(name, numberPhone);
        records.add(element);
        return element;
    }

    public Abonent find(String name) {

          for(Abonent abonent : records) {
              if(abonent.getName().equals(name)) {
                  return abonent;
              }
          }
          return  null;
    }

    public List<Abonent> findAll(String name) {

        List<Abonent> result = new ArrayList<>();
        for(Abonent abonent : records) {
            if(abonent.getName().equals(name)) {
                 result.add(abonent);
            }
        }
        return result;
    }
}
