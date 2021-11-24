public class CastingOverflow {
    public static void main(String[] args) {
        float f = 10.5f;
        int a = (int)f;
        int x = 135;
        byte b = (byte)x;
        System.out.println("The int number is " + a);
        System.out.println("The byte number is " + b);

        //Adding lower type
        byte p = 10;
        byte q= 10;
        byte r = (byte)(p+q);
        System.out.println("The addition of two byte numbers are " +r);

    }




}
