import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        System.out.println("The reverse number is");
     revnum(a);


    }

    public static void revnum(int a){
int rem ,rev = 0 ;
        if(a<10){
            System.out.println(a);
            return;
        }
        else{
            rem= a%10 ;

           rev = rev *10 + rem;
            a = a/10;



        }

    }
}



