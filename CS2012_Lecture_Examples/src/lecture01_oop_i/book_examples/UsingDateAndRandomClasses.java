package lecture01_oop_i.book_examples;

import java.util.Date;
import java.util.Random;

public class UsingDateAndRandomClasses {
    public static void main(String[] args) {
        Date d1 = new Date(76544567654L);

        //System.out.println(d1.toString());
        //System.out.println(d1.getHours());
        
        Random rand = new Random();
        
        for (int i = 0 ; i <= 9 ; i++) {
        	System.out.println(rand.nextInt(10));
        }
        
        
        


    }
}
