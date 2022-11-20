package java_tasks;

public class Week_2 {
    // 3. Swap Numbers
    // Swap two variable values without using a third variable


    //x=(First number)-->5, y=(Second number)---3 swap numbers
    /*
    Logic------
    x= x+y  8 =5+3 if we add both variables one of them we change it then
    y=x-y   5 =8-3  in this way y become x without a third variable
    x=x-y   3 =8-5  and at the end x become y
     */
    public static void swapNumbers(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping Numbers: x=" + x + "   y=" + y);

    }

    /*
    4. Numbers -- Divisible by 3, 5, 15
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
   if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
   if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
*/
    public static void divisible() {

        System.out.print("Divisible By 15 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Divisible By 5 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Divisible By 3 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*
    5. Numbers -- print consecutive numbers
    Write a function:
   that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However,
   any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number
   is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective
   words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be
   replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by
   CodilityTestCoders.
     */
    public static void consecutive(int n) {
        String divisible2 = "Codility";
        String divisible3 = "Test";
        String divisible5 = "Coders";
        int number =0;
        System.out.println(); // because of other code interrupt it
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(divisible2+divisible3+divisible5);
            }else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(divisible2+divisible3);
            }else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(divisible2+divisible5);
            }else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(divisible3+divisible5);
            }else if (i % 5 == 0) {
                System.out.println(divisible5);
            }else if (i % 2 == 0) {
                System.out.println(divisible2);
            }else if (i % 3 == 0) {
                System.out.println(divisible3);
            } else {
                number =i;
                System.out.println(number);
            }

        }


    }

}
