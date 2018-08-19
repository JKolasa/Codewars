package kyu8;

public class DoIGetABonus {
    public static void main(String[] args) {
        System.out.println(bonusTime(20,true));
    }

    public static String bonusTime(int salary, final boolean bonus) {
        int newSalary = salary;

        if(bonus == true){
            newSalary = salary*10;
        }
        return "\u00A3"+newSalary;
    }
}
