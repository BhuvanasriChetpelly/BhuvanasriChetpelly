package basic_programs_of_java;

import java.util.Scanner;
public class RemoveVowels {

    public static void main(String[] args) {
        // Declare variables to store input string and modified string
        String str;
        String str1 = null;

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string");
        
        // Read the input string from the user
        str = sc.nextLine();
        
        // Replace all vowels in the input string with an empty string
        str1 = str.replaceAll("[aeiouAEIOU]", "");
        
        // Print the modified string without vowels
        System.out.print(str1);
    }

}
