/**
 * Created by Andrea on 2017/01/30.
 */
public class Datatypes {
    public static void main(String[] args){
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);
        //Challenge: How would you create a new variable
        // that has the difference of 1000 and the current value
        // of myTotal?

        int myTotal2 = 1000 - myTotal;
        System.out.println(myTotal2);
    }
}
