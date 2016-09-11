package Ravikumar.Sujatha.SumOrProduct2;

/**
 * Created by sujatharavikumar on 9/11/16.
 */
public class Operation {
    public int selectOperation(String operation, int number){

        Calculator calculate = new Calculator();
        int result = 0;

        if (operation.equals("sum") || (operation.equals("Sum"))){
            result = calculate.sum(number);
            System.out.println("The sum is " +result );
        }
        else if (operation.equals("product") || (operation.equals("Product"))){
            result = calculate.product(number);
            System.out.println("The product is "+result);
        }

        return result;
    }

}
