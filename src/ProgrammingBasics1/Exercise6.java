package ProgrammingBasics1;

/**
 * Created by Ania on 2017-07-27.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Scanner;

public class Exercise6 {
    //checking id our sum is prime number
    public static boolean primeNumber(int sum) {
        for(int i = 2; i <= sum/2; i++) {
            if(sum%i == 0) {
                System.out.println("The sum of digits (sum = " + sum + ") in your number isn't a prime number");
                return false;
            }
        }
        System.out.println("The sum of digits (sum = " + sum + ") in your number is a prime number");
        return true;
    }
    //sum of digits for ex. our number = 987
    //units = 7, ten = 8, hundreds = 9
    //so sum of them is 24
    public static void sumDigits(int x){
        int units = x%10;
        int tens = (x%100)/10;
        int hundreds = (x%1000)/100;
        int sum = units+tens+hundreds;
        primeNumber(sum);
    }
    //taking number from user
    public static void userNumber(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sumDigits(x);
    }
    public static void main(String[] args) {
        userNumber();
    }
}
