package kyu8;


public class RemoveNExclamationMarksFromLeft {


    public static String remove(String s, int n) {

        StringBuffer stringBuffer = new StringBuffer();

        char[] sArray = s.toCharArray();

        int checkNumberOfExclamation = 0;

        for (int i = 0; i < sArray.length; i++) {
            if(sArray[i] == '!' && checkNumberOfExclamation < n){
                sArray[i] = 'ř';
                checkNumberOfExclamation ++;
            }

            stringBuffer.append(sArray[i]);
        }

        String newS = stringBuffer.toString().replaceAll("ř","");

        return newS;
    }

    
    public static String removeMethodTwo(String s, int n) {

        while (n > 0){

            if(s.contains("!")){
                s = s.replaceFirst("!","");
            }

            n --;
        }

        return s;
    }
}
