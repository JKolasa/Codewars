package kyu8;

public class CenturyFromYear {
    public static int century(int number) {

        int centuryNumber = number/100;

        if(centuryNumber < 0){
            return -1;
        }

        if(centuryNumber == 0){
            return 1;
        }

        if(number%100 == 0 ){
            return centuryNumber;
        }

        return centuryNumber+1;
    }
}
