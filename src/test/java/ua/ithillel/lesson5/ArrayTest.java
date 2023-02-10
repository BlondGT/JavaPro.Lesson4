package ua.ithillel.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void shouldFindIndexOf() {

        Array array = new Array();

        array.add("gh");
        array.add("it");

        assertEquals(-1, array.indexOf("fd"));
        assertEquals(1, array.indexOf("it"));

    }

    @Test
    void shouldRemoveElement() {

        Array array = new Array();

        array.add("gh");
        array.add("it");

        assertEquals("it", array.remove(1));
        assertArrayEquals(new String[] {"gh"}, array.getAll());
    }

    @Test
    void shouldAddElement() {

        Array array = new Array();
        array.add("gh");

        assertArrayEquals(new String[] {"gh"}, array.getAll());
    }

    @Test
    void shouldArrayContainsElement() {

        Array array = new Array();

        array.add("gh");
        array.add("it");
        array.add("mj");
        array.add("po");

        assertTrue(array.contains("mj"));
        assertFalse(array.contains("1"));
    }

    @Test
    void shouldArrayHasSize() {

        Array array = new Array();

        array.add("gh");
        array.add("it");
        array.add("mj");
        array.add("po");

        assertEquals(4, array.size());
        assertNotEquals(3, array.size());
    }

    @Test
    void shouldGetIndexOfElement() {

        Array array = new Array();

        array.add("gh");
        array.add("it");
        array.add("mj");
        array.add("po");

        assertEquals("gh", array.get(0));

    }

    @Test
    void shouldShowedGetAll() {

        Array array = new Array();

        array.add("gh");
        array.add("it");

        assertArrayEquals(new String[] {"gh", "it"}, array.getAll());
    }
}