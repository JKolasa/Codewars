package kyu7;

public class ReverseNumber {


    public static int reverse(int number) {

        String stringNumbers = Integer.toString(number);
        StringBuilder newArrayStringBuilder = new StringBuilder();

        char[] array = stringNumbers.toCharArray();

        char[] newArray = new char[array.length];

        if (array[0] != '-') {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[array.length - i - 1];
                newArrayStringBuilder.append(newArray[i]);
            }
        } else {
            newArrayStringBuilder.append(array[0]);
            for (int i = 1; i < array.length; i++) {
                newArray[i] = array[array.length - i];
                newArrayStringBuilder.append(newArray[i]);
            }
        }

        String newNumberString = newArrayStringBuilder.toString();

        int newNumber = Integer.parseInt(newNumberString);

        return newNumber;
    }
}
