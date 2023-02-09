package ua.ithillel.lesson5;

import java.util.Arrays;
import java.util.Objects;

public class Array implements HillelList {

    private String[] arrays = new String[]{};


    public static void main(String[] args) {

        Array array = new Array();

        array.add("el1");
        array.add("el2");
        array.add("el3");
        array.add("el4");
        array.add("el5");
        array.remove(3);
        System.out.println(array.contains("el6"));
        System.out.println(array.indexOf("el3"));
        System.out.println(array.size());
        System.out.println(array.get(2));
        System.out.println(Arrays.toString(array.getAll()));
    }

    public static String[] append(String[] arrays, String item) {
        String[] arr = new String[arrays.length + 1];
        System.arraycopy(arrays, 0, arr, 0, arrays.length);
        arr[arrays.length] = item;
        return arr;
    }

    public static String[] removeElement(String[] arrays, int index) {

        String[] arrDestination = new String[arrays.length - 1];
        String remainingElement = String.valueOf(arrays.length - (index + 1));
        System.arraycopy(arrays, 0, arrDestination, 0, index);
        System.arraycopy(arrays, index + 1, arrDestination, index, Integer.parseInt(remainingElement));
        return arrDestination;
    }


    public static int findIndexOf(String[] arr, String item) {

        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(String item) {

       arrays = append(arrays, item);
    }

    @Override
    public String remove(int index) {

        String removedElement = arrays[index];
        arrays = removeElement(arrays, index);

        return removedElement;
    }

    @Override
    public boolean contains(String item) {

        return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {

       return findIndexOf(arrays, item);
    }

    @Override
    public int size() {
        return arrays.length;
    }

    @Override
    public String get(int index) {

        return arrays[index];
    }

    @Override
    public String[] getAll() {
        return arrays;
    }
}

