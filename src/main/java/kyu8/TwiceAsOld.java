package kyu8;

public class TwiceAsOld {
    public static int twiceAsOld(int dadYears, int sonYears) {

        if (dadYears <= 0 || sonYears <= 0) {
            return 0;
        }

        return Math.abs(dadYears - sonYears * 2);
    }
}
