package kyu7;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FormTheMinimum {
    public static int minValue(int[] values) {

       return solutionTwo(values);

    }

    public static int solutionOne(int[] values) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        StringBuffer valueString = new StringBuffer();

        for (int value : values) {
            treeSet.add(value);
        }

        for (Integer integer : treeSet) {
            valueString.append(integer);
        }

        return Integer.parseInt(valueString.toString());
    }

    public static int solutionTwo(int[] values){

        List<Integer> valuesArrayList = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {

            }
        }
        return 0;
    }
}
