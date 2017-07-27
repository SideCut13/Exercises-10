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

public class Exercise9 {
    //degree of bmi
    public static void bmi(double bmi){
        if(bmi<18.5){
            System.out.println("YOUR BMI IS " + bmi + ". THE RESULT IS UNDERWEIGHT");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("YOUR BMI IS " + bmi + ". THE RESULT IS NORMAL");
        }
        else if(bmi>=25 && bmi<=29.9){
            System.out.println("YOUR BMI IS " + bmi + ". THE RESULT IS OVERWEIGHT");
        }
        else{
            System.out.println("YOUR BMI IS " + bmi + ". THE RESULT IS OBESE");
        }
    }
    //take from user weight and height
    public static void userMeasurements(){
        System.out.println("WELCOME TO THE BMI CALCULATOR");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight (in kg for ex. 67,6): ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height (in meters for ex. 1,45): ");
        double height = sc.nextDouble();
        //calculate bmi (kg/cm^2)
        double bmi = (double)Math.round((weight/Math.pow(height,2))*100.0)/100.0;
        System.out.println(Math.pow(height,2));
        bmi(bmi);
    }

    public static void main(String[] args) {
        userMeasurements();
    }
}
