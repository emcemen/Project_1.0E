package java_tasks;

import java.util.Scanner;


public class Week_6 {

/*
1. String -- Password Validation Task

1. Write a return method that can verify if a password is valid or not. requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter -----A
3. PassWord should at least contain one lowercase letter-------a
4. Password should at least contain one special characters-----?
5. Password should at least contain a digit-------00000000
if all requirements above are met, the method returns true, otherwise returns false*/


    public static void main(String[] args) {
//This part for test and Scanner
        Scanner input = new Scanner(System.in);
        System.out.print(
                        "1.Password MUST be at least have 6 characters and should not contain space.\n" +
                        "2.PassWord should at least contain one upper case letter.\n" +
                        "3.PassWord should at least contain one lowercase letter. \n" +
                        "4.Password should at least contain one special characters.\n" +
                        "5.Password should at least contain a digit. \n" +

                        "Input a password Please!.......... ");
        String s = input.nextLine();

        if (password_Valid_or_not(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: Please try again according to given information " + s);
        }


        //TEST THE CODE for TASK-2

        // input alphanumeric string
        String str = "QWE123asd123??>>123";

        // Function call
        System.out.println(sumOfDigits(str));
    }


    //This Part is method
    public static boolean password_Valid_or_not(String password) {

        int passwordLength=6;


        if (password.length()!= passwordLength) { //that is checking the password length if it is not ok returning false
            return false;}
        int lowerCaseCount = 0;   //counter for the boolean method
        int upperCaseCount=0;
        int specialCharCount=0;
        int spaceCharCount=0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {// this loop checking each char

            char ch = password.charAt(i);
            if (is_Numeric(ch)) {  // checking and counting that passwords characters for numeric
                numCount++;
            }
            if (is_lowerCase(ch)) { // checking and counting that passwords characters for lowercase
                lowerCaseCount++;
            }
            if (is_upperCase(ch)) { // checking and counting that passwords characters for uppercase
                upperCaseCount++;
            }
            if (is_SpecialChar(ch)) { // checking and counting that passwords characters for special characters
                specialCharCount++;
            }
            if (is_SpaceChar(ch)) { // checking and counting that passwords characters  for space
                spaceCharCount++;
            }
        }
if (numCount>=1 && lowerCaseCount>=1 && upperCaseCount>=1 &&  specialCharCount>=1 && spaceCharCount==0 ){ // final
    // check here iam not checking again the lenght because i put it first part
    return true;
}else {
    return false;
}

    }
 //This is the conditions part.I created for each of them a method and put them inside the last method which I am
 // gone use  for scanner
    public static boolean is_upperCase(char ch) {
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean is_lowerCase(char ch) {
        return (ch >= 'a' && ch <= 'z');
    }
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
    public static boolean is_SpecialChar(char ch) {

        return (ch >=0 && ch<= 127);//ASCI Special char
    }
    public static boolean is_SpaceChar(char ch){

        return (ch==' ');
    }

    /*
    2. String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigits(String str)
    {
        // A temporary string
        String temp = "0";

        // holds sum of all numbers present in the string
        int sum = 0;

        // read each character in input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch))  //wrapper classes method
                temp += ch;

                // if current character is an alphabet its mean if its not digit
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);  // this method convert String to an int type

                // reset temporary string to empty
                temp = "0";
            }
        }

        return sum + Integer.parseInt(temp);
    }


}



































