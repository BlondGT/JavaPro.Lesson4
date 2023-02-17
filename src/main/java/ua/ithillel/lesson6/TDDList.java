package ua.ithillel.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TDDList {

//    1. Створити метод countOccurrence, що приймає на вхід рядковий список як параметр і довільний рядок.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Порахувати скільки разів зустрічається переданий рядок як другий аргумент.

    public static int countOccurrence(List<String>list, String element) {
        int count = 0;
        for(String value : list) {
            if(value.equals(element)) {
                count++;
            }
        }
        return count;
    }


//    2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини.
//    Конвертувати масив у список відповідного типу даних та повернути з методу.
//            Наприклад:
//    Було Array [1, 2, 3]
//    Стало List [1, 2, 3]

    public static List<Integer> toList(int[] array) {

        List<Integer> list = new ArrayList<>();
        for(Integer i : array) {
            list.add(i);
        }
        return list;
    }




//    3. Створити метод findUnique, що приймає на вхід числовий список,
//    що складається з довільних значень, які можуть повторюватися в необмеженій кількості.
//    Необхідно повернути новий числовий список, що містить тільки унікальні числа.
//    (Використовуючи лише List)

    public static <T> List<T> findUnique(List<T> list) {

        List<T> uniqueList = new ArrayList<>();
        for (T value : list) {
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }
        return uniqueList;
    }



//    4. ** Створити метод calcOccurrence, який приймає на вхід рядковий список як параметр.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Обчислити скільки разів трапляється кожне слово.
//    Наприклад:
//    bird: 2
//    fox: 1
//    cat: 1

    public static List<String> calcOccurrence (List<String> list) {

        List<String> result = new ArrayList<>();
        for(WordOccurrence value : findOccurrence(list)) {
            result.add(value.name + ": " +value.occurrence);
        }
        return result;
    }





//    5. *** Створити метод findOccurrence, що приймає на вхід рядковий список як параметр.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Обчислити скільки разів трапляється кожне слово. Результат повернути у вигляді списку структур,
//    що описують повторення кожного окремого взятого слова.
//    Наприклад:
//    [
//    {name: "bird", occurrence: 2},
//    {name: "fox", occurrence: 1},
//    {name: "cat", occurrence: 1}
//]

    public static List<WordOccurrence> findOccurrence (List<String> list) {

        List<WordOccurrence> result = new ArrayList<>();
        for(String value : findUnique(list)) {
           int occurrence = countOccurrence(list,value);
           result.add(new WordOccurrence(value,occurrence));
        }
        return result;
    }


    public static class WordOccurrence {
        private final String name;
        private final int occurrence;


        public WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }
        

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            WordOccurrence that = (WordOccurrence) o;
            return occurrence == that.occurrence && name.equals(that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, occurrence);
        }

        @Override
        public String toString() {
            return "WordOccurrence{" +
                    "name='" + name + '\'' +
                    ", occurrence=" + occurrence +
                    '}';
        }
    }
}
