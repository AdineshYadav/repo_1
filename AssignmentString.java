//ASSIGNMENT STRING PRACTISE

import java.util.Arrays;

public class AssignmentString {
    public static void main(String[] args) {

        System.out.println(reverseString("iNeuron"));
        System.out.println(anagram("bool" , "oolb"));
        repeted("hello");
    }

     //Question 1
    public static String reverseString(String s){
        String ans = "";
        for(int i = s.length()-1 ; i >= 0 ; i--){
            char c = s.charAt(i);
            ans = ans+c;
        }
        return ans;
    }


    //QUESTION 3
    public static Boolean anagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        //changing the string to character array
        char[] arr1  = s1.toCharArray();
        char[] arr2  = s2.toCharArray();
        //sorting the arrays using in-built sort function
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0 ; i < arr1.length ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    //QUESTION 4
    public static void pangram(String str)
    {
        // Converting the given string
        // into lowercase
        str = str.toLowerCase();

        boolean allLetterPresent = true;

        // Loop over each character itself
        for (char ch = 'a'; ch <= 'z'; ch++) {

            // Check if the string does not
            // contains all the letters
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

        // Check if all letter present then
        // print "Yes", else print "No"
        if (allLetterPresent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }


    // QUESTION 5
    public static void repeted(String s) {
        int count;

        //Converts given string into character array
        char string[] = s.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
        //Counts each character present in the string
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }

    // QUESTION 6
    public static void sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }


    // QUESTION 7
    public static void count(String str) {
        // Initially initializing elements with zero
        // as till now we have not traversed
        int vow = 0, con = 0;

        // Declaring a reference String
        // which contains all the vowels
        String ref = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {

            // Check for any special characters present
            // in the given string
            if ((str.charAt(i) >= 'A'
                    && str.charAt(i) <= 'Z')
                    || (str.charAt(i) >= 'a'
                    && str.charAt(i) <= 'z')) {
                if (ref.indexOf(str.charAt(i)) != -1)
                    vow++;
                else
                    con++;
            }
        }

        // Print and display number of vowels and consonants
        // on console
        System.out.println("Number of Vowels = " + vow
                + "\nNumber of Consonants = "
                + con);
    }
}
