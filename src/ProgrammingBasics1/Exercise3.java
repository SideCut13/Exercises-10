package ProgrammingBasics1;

/**
 * Created by Ania on 2017-07-22.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    //draw 3 numbers <10,100> while sum of these 3 numbers is greater than three times
    // center number (second largest)
    public static void drawValues(){
        Random rnd = new Random();
        int a = rnd.nextInt(91) + 10;
        int b = rnd.nextInt(91) + 10;
        int c = rnd.nextInt(91) + 10;
        //an array with our 3 numbers
        int[] central = new int[]{a,b,c};
        //sort an array to designate second largest number
        Arrays.sort(central);
        while(! (a+b+c > 3*central[1])){
            a = rnd.nextInt(91) + 10;
            b = rnd.nextInt(91) + 10;
            c = rnd.nextInt(91) + 10;
            central = new int[]{a,b,c};
            Arrays.sort(central);
        }
        System.out.println("3 numbers: " + a + ", " + b + ", " + c);
    }
    public static void main(String[] args) {
        drawValues();
    }
}
