import java.util.Scanner;

public class ReverseNumber1 {

    private static Scanner sc;
    private static int Reverse = 0;
    public static void main(String[] args) {
        int Number;
        sc = new Scanner(System.in);

        System.out.println("\n Please Enter any Number you want to Reverse : ");
        Number = sc.nextInt();

        Reverse = ReverseNumber(Number);
        System.out.format("\n Reverse of entered number is = %d\n", Reverse);
    }
    public static int ReverseNumber(int Number) {
        int Reminder;
        while(Number > 0) {
            Reminder = Number %10;
            Reverse = Reverse * 10 + Reminder;
            Number = Number /10;
        }
        return Reverse;
    }

}
