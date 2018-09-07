package kyu7;

public class Isogram {

    public static boolean isIsogram(String str) {

        for (int i = 0; i < str.length(); i++) {

            char checkingLetter = str.toLowerCase().charAt(i);
            int quantityOfCheckingLetter = 0;

            for (int j = 0; j < str.length(); j++) {
                if( str.toLowerCase().charAt(j) == checkingLetter){
                    quantityOfCheckingLetter ++;
                }

                if (quantityOfCheckingLetter > 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isIsogram2(String str){
        return str.toLowerCase().chars().distinct().count() == str.length();
    }
}
