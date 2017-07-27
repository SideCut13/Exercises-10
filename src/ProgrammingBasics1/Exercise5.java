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

public class Exercise5 {
    //count how many even digits (not 0!) are in even places in our number
    public static void evenDigits(int x){
        //units and hundreds are even positions in this task
        int units = x%10;
        int hundreds = (x%1000)/100;
        int counter =0;
        if(units % 2 ==0 && units !=0){
            counter++;
        }
        if(hundreds%2 ==0 && hundreds !=0){
            counter++;
        }
        System.out.println("The number " + x + " have " + counter + " even digits in even places");
    }
    //taking number from user
    public static void userNumber(){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        evenDigits(x);
    }
    public static void main(String[] args) {
        userNumber();
    }
}
