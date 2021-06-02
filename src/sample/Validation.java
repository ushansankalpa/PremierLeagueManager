package sample;

import java.util.Scanner;

public class Validation { //integer validation, if we enter integer for string value ,then run this code

    public static int firstValidation(String option1){
        Scanner scanner2 = new Scanner(System.in);
        int choose1;
        try {
            choose1 = Integer.valueOf(option1);
        }catch (NumberFormatException e){
            System.out.print("(Invalid input)  Please enter an Integer   :- ");
            choose1 = firstValidation(scanner2.nextLine());

        }
        return choose1; //return this value to main method

    }



}
