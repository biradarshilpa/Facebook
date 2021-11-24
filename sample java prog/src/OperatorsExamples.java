public class OperatorsExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c= 2;
        int d = 20;
        System.out.println( a++); //10 (11)
        System.out.println(++a);// 12
        System.out.println( a--);//12 (11)
        System.out.println( --a); //10
        System.out.println(a<<c); //10*2^2 multiplication
        System.out.println(a>>c);//10/2^2division
        System.out.println(d>>>c);
        System.out.println(b>>>c);
       // System.out.println(b<a?a:b);
    }
}
