package homework_week4;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */

public class Programme_13_SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12,23 );
    }
    public static boolean hasSharedDigit (int number1, int number2){
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)
            return false;


        while (number1 > 0){
            int i = number1 % 10;;

            int tempNumber2 = number2;

            while (tempNumber2 > 0){
                int j = tempNumber2 % 10;

                if(i == j){
                    return true;
                }
                tempNumber2 /= 10;

            }
            number1 /= 10;


        } return false;

    }


}


