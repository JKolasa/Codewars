package kyu7;

import com.sun.deploy.util.ArrayUtil;

public class HelpTheFruitGuy {


    public static String[] removeRottenFruits(String[] fruitBasket) {

        if(fruitBasket == null || fruitBasket.length <= 0) return new String[0];

        String[] newBasket = new String[fruitBasket.length];

        for (int i = 0; i < fruitBasket.length; i++) {
            if(fruitBasket[i].contains("rotten")){
                fruitBasket[i] = fruitBasket[i].substring(6).toLowerCase();
            }
            newBasket[i]=fruitBasket[i];
        }

        return newBasket;
    }
}
