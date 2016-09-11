package Ravikumar.Sujatha.SumOrProduct2;

import java.util.Scanner;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class SumOrProduct2 {

    public static void main(String args[]){

        Input sumObj = new Input();
        Calculator calculate = new Calculator();
        Operation operation = new Operation();

        int number = sumObj.getInput();

        System.out.println(" Do you want to compute the sum / product of " +number+  " numbers");
        String sumOrProduct = sumObj.getStringInput();

        operation.selectOperation(sumOrProduct, number);


    }

}
