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

import java.util.Scanner;

public class Exercise4 {

    public static void numbersFromUser(){
        // user enter 2 int numbers while sum of them
        //is greater than sum of digits in largest one
        Scanner sc = new Scanner(System.in);
        // x is sum of digits
        int a = 0, b = 0, x = 0;
        while(! (a + b > x) ){
            System.out.println("Enter two numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            if(a > b){
                x = a%10 + (a%100)/10;
            }
            else{
                x = b%10 + (b%100)/10;
            }
        }
        System.out.println("Correct numbers: " + a + ", " + b);
    }
    public static void main(String[] args) {
        numbersFromUser();
    }
}
