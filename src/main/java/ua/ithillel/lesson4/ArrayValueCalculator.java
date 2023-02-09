package ua.ithillel.lesson4;


public class ArrayValueCalculator {

    public void main(String[] args) {

        try {
            int sum = doCalc(new String[][]{
                    {"2", "hello", "4", "people"},
                    {"1", "3", "l", "5"},
                    {"6", "7", "str", "8"}});
            System.out.println(sum);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int doCalc(String[][] input) throws ArrayDataException, ArraySizeException {

        int sum = 0;
        for (String[] strings : input) {
            for (String string : strings) {
                if (input.length != 4 || strings.length != 4) throw new ArraySizeException("Make size 4x4!!!");
                try {
                    sum += Integer.parseInt(string);
                } catch (NumberFormatException exc) {
                    throw new ArrayDataException("Incorrect array's data");
                }
            }
        }
        return sum;
    }
}