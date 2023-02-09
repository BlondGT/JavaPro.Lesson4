package ua.ithillel.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayValueCalculatorTest {

    public final ArrayValueCalculator data = new ArrayValueCalculator();

    @Test
    void shouldIsArraySizeException() {

        assertThrows(ArraySizeException.class, () -> data.doCalc(new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4", "5"}
        }));
    }

    @Test
    void shouldThrowArrayDataException() {

        assertThrows(ArrayDataException.class, () -> data.doCalc(new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "df", "3", "4"}
        }));
    }

    @Test
    void shouldCalculateSumArray() {

        assertEquals(40,data.doCalc(new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        }));
    }
}