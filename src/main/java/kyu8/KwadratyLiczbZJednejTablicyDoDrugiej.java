package kyu8;

public class KwadratyLiczbZJednejTablicyDoDrugiej {

    // Napisz program, ktory wylicza kwadraty liczb z jednej tablicy i wpisuje je do drugiej.
    // Nastepnie wypisuje liczby i ich kwadraty.
    //
    // Dana jest tablica int[] ints = new int[]{1, 3, -4, 2, 8, 5, -5, 12};
    //
    // 1) Utworz odpowiednia tablice (o nazwie squares), ktora bedzie przechowywala kwadraty liczb z tablicy ints
    // 2) Napisz petle, ktora przeiteruje po tablicy ints, wyliczy i wpisze wartosci kwadratow do drugiej tablicy squares
    // 3) W kolejnej petli iteruj po tablicy i wyswietl wartosc z tablicy ints oraz odpowiadajacy jej kwadrat z tablicy squares
    // np.
    // 1: 1^2 = 1
    // 5: 5^2 = 25

    public static void main(String[] args) {
        getSquares(new int[]{1, 3, -4, 2, 8, 5, -5, 12});
    }

    private static int[] getSquares(int[] ints) {

        int[] squares = new int[ints.length];
        int power = 2;

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < ints.length; i++) {
            squares[i] = (int) Math.pow(ints[i], power);
        }

        for (int i = 0; i < squares.length; i++) {
            stringBuffer.append(i+1).append(": ").append(ints[i]).append("^").append(power).append(" = ").append(squares[i]).append("\n");
        }

        System.out.println(stringBuffer.toString());

        return squares;
    }
}
