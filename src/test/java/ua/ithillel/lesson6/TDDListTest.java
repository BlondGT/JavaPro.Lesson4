package ua.ithillel.lesson6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.ithillel.lesson6.TDDList.*;

class TDDListTest {

//    1. Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Порахувати скільки разів зустрічається переданий рядок як другий аргумент.

    @Test
    void shouldCountOccurrence() {

        List<String> list = new ArrayList<>();

        list.add("el1");
        list.add("el2");
        list.add("el3");
        list.add("el4");
        list.add("el5");
        list.add("el6");
        list.add("el9");
        list.add("el8");
        list.add("el9");
        list.add("el4");
        list.add("el2");
        list.add("el1");
        list.add("el9");
        list.add("el2");
        list.add("el1");
        list.add("el1");

        assertEquals(countOccurrence(list,"el1"), 4);
    }

    //    2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини.
//    Конвертувати масив у список відповідного типу даних та повернути з методу.
//            Наприклад:
//    Було Array [1, 2, 3]
//    Стало List [1, 2, 3]

    @Test
    void shouldArrayToList () {

        int[] array = new int[] {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(list, toList(array));
    }

    //    3. Створити метод findUnique, що приймає на вхід числовий список,
//    що складається з довільних значень, які можуть повторюватися в необмеженій кількості.
//    Необхідно повернути новий числовий список, що містить тільки унікальні числа.
//    (Використовуючи лише List)

    @Test
    void shouldFindUniqueElements() {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 2, 1, 1, 3, 1, 5);

        assertEquals(List.of(1, 2, 3, 4, 5), findUnique(list));
    }


    //    4. ** Створити метод calcOccurrence, який приймає на вхід рядковий список як параметр.
//    Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//    Обчислити скільки разів трапляється кожне слово. Результат вивести у консоль.
//    Наприклад:
//    bird: 2
//    fox: 1
//    cat: 1

    @Test
    void shouldDoCalcOccurrence() {

        List<String> list = new ArrayList<>();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");
        list.add("elem4");
        list.add("elem4");
        list.add("elem3");
        list.add("elem1");
        list.add("elem4");
        list.add("elem2");
        list.add("elem1");
        list.add("elem4");
        list.add("elem4");
        list.add("elem1");

        assertEquals(List.of("elem1: 4", "elem2: 2", "elem3: 2", "elem4: 5"), calcOccurrence(list));
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

    @Test
    void shouldFindOccurrence () {

        List<String> list = new ArrayList<>();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");
        list.add("elem4");
        list.add("elem4");
        list.add("elem3");
        list.add("elem1");
        list.add("elem4");
        list.add("elem2");
        list.add("elem1");
        list.add("elem4");
        list.add("elem4");
        list.add("elem1");

        assertEquals(List.of(
                new WordOccurrence("elem1", 4),
                new WordOccurrence("elem2", 2),
                new WordOccurrence("elem3", 2),
                new WordOccurrence("elem4", 5)
        ), findOccurrence(list));
    }
}