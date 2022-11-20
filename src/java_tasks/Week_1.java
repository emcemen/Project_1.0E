package java_tasks;

public class Week_1 {


        // solutions go here

        /*
       1- Write a Method which can identifies given number is Odd or Even
        Ex:
                identify(5) -->  "Odd"
                identify(6) -->  "Even"
         */
        public static String identify(int num) {

            if (num % 2 == 0) { // for find the num can be divisible to 2 if it is that mean there is no leftover and num is Even
                return "Even";
            } else { // in other case it is Odd ( if there is a leftover)
                return "Odd";
            }

        }// End of the method


        // Numbers Divide without / operator
        //  Write a method  that can divide two numbers without using division operator

        public static String withoutOperator(int dividend, int divider) {
            int result = 0;
            int leftover = dividend % divider;

            if (dividend % divider == 0) { // if there is no leftover
                while (dividend >= divider) {

                    dividend = dividend - divider;// When dividend equal to divider result will count how many divider in the
                    // dividend and that will give us to result
                    result++;
                }
                return "result is: " + result + " and there is no leftover";
            } else {
                while (dividend >= divider) {

                    dividend = dividend - divider;
                    result++;
                }
                return "result is: " + result + " and leftover is: " + leftover;

            }

        }// End of the method

    /*
    Write a method which prints out the numbers from 1 to 30
    but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5,
    print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

        //numbers can divide into 3 change it with FIN for the numbers divide into 5 change with RA for numbers both
        //divide into 3 and 5 FINRA

        public static void printNumbers() {

            for (int i = 1; i <= 30; i++) { // I created a loop for print the numbers in that question there is no input
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FINRA"+" ");
                } else if (i % 3 == 0) {
                    System.out.print("FIN"+" ");
                } else if (i % 5 == 0) {
                    System.out.print("RA"+" ");
                } else {
                    System.out.print(i+" ");
                }
            }
        }



        public static void main(String[] args) { // FOR TEST THE METHOD

            System.out.println(identify(364));

            int num = 3^2;
            System.out.println(num);

            System.out.println(withoutOperator(17,2));
            printNumbers();








        }

    }












