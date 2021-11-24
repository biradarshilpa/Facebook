import java.util.Scanner;

public class ReverseString {



        public static void main(String args[])
        {
            String original= "India";
            String reverse = "";
            //Scanner in = new Scanner(System.in);

           // System.out.println("Enter a string to reverse");
           // original = in.nextLine();
            System.out.println("Original String " + original);
            int length = original.length();
            System.out.println(length);

            for (int i = length - 1 ; i >= 0 ; i--) {
                reverse = reverse + original.charAt(i);
            }
            System.out.println("Reverse of the string: " + reverse);
        }
    }

