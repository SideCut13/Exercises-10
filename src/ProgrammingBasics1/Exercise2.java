package ProgrammingBasics1;

/**
 * Created by Ania on 2017-07-26.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Arrays;
import java.util.Random;

public class Exercise2 {
    //stick max digits in units, tens and hundreds (from our 3 numbers) and create new number
    //in ex. a = 832, b = 631, c = 456 so stick = 856
    public static void stickDigits(int a, int b, int c){
        //arrays with units, tens and hundreds from 3 numbers
        int[] units = new int[]{a%10, b%10, c%10};
        int[] tens = new int[]{(a%100)/10, (b%100)/10, (c%100)/10};
        int[] hundreds = new int[]{(a%1000)/100, (b%1000)/100, (c%1000)/100};
        //sort arrays - last index ([2]) is max number
        Arrays.sort(units);
        Arrays.sort(tens);
        Arrays.sort(hundreds);
        //stick new number with max values
        int stick = Integer.valueOf(String.valueOf(hundreds[2]) + String.valueOf(tens[2]) + String.valueOf(units[2]));
        System.out.println("New number: " + stick);
    }
    //draw 3 numbers <100,999>
    public static void drawNumbers(){
        Random rnd = new Random();
        int a = rnd.nextInt(898) + 100;
        int b = rnd.nextInt(898) + 100;
        int c = rnd.nextInt(898) + 100;
        System.out.println("Draw numbers - a: " + a + ", b: " + b + ", c: " + c);
        stickDigits(a, b, c);
    }
    public static void main(String[] args) {
        drawNumbers();
    }
}
