package java_tasks;

public class Week_5 {
    /**
     1. String -- Find the unique
     Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static String unique(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (unique.indexOf(str.charAt(i)) == -1) {
                unique = unique + str.charAt(i);
            }

        }
        return unique + "";
    }




    /**
     2. String -- Reverse
     Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
     */
    public static String reverse(String str){

        String reverse="";
        for(int i =str.length()-1 ; i>= 0; i--){ //loop is  rewriting each char as lenght of str
            reverse+= str.charAt(i);
        }
        return reverse;
    }


    /**
     3. String -- Sort Letters and Numbers from alphanumeric String
     Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
     Ex:
     Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"
     */

}
