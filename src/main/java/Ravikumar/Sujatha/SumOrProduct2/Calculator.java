package Ravikumar.Sujatha.SumOrProduct2;

/**
 * Created by sujatharavikumar on 9/10/16.
 */
public class Calculator {

    public int sum(int n){
        int count = 0;
        for (int i=1; i<=n; i++){
            count += i;
        }
        return count;
    }

    public int product(int n){
        int prod = 1;
        for (int i=1; i<=n; i++){
            prod *= i;
        }
        return prod;
    }

}
