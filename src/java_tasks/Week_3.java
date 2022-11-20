package java_tasks;

public class Week_3 {
    /**
     Numbers -- Prime Number
     Write a method that can check if a number is prime or not
     */
//  A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.

    public static boolean primeNumCheck(int number){

        for(int i=2; i<=number/2; i++){ //  2-3-5-7-9-11-13-17-19-23

            if(number % i == 0){
                return false;//number is divisible so it is not prime
            }
        }
        return true;//number is prime now
    }



    /**
     Numbers -- Armstrong numbers
     Write a method that can check if a number is Armstrong number
     */
// An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
// For example, 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371.  27+343+1=371

    public static boolean armstrongNumberCheck(int number) {
        if ((number < 100) || (number > 999)) {
            return false;
        } else {
            int a = number % 10;   //----->find for  first digit
            int b = (number / 10) % 10;//-----> find for middle digit
            int c = number / 100;  /// -------->find for last digit
            int sumOfCubes = (a*a*a) + (b*b*b) + (c*c*c);
            return (number == sumOfCubes);
        }
    }


    /**
     Number -- Reverse negative number
     Write a return method that can reverse negative number and return it as int
     */

    public static int reverseNegNum(int num) {
        boolean isNegative = num < 0 ? true : false;
        if(isNegative){
            num = num * -1; }


        int reverse = 0;
        int lastDigit = 0;
        while (num >= 1) {
            lastDigit = num % 10; // it gives last digit
            reverse = reverse * 10 + lastDigit;
            num = num / 10; // get rid of last digit
        }
        return isNegative == true? reverse*-1 : reverse;
    }

}
