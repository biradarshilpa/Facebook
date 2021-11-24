package com.wbl.abstraction;

  abstract class MyClass{

    abstract void calculate(int a ,int b);
}

    class Addition extends MyClass {
        void calculate(int a, int b) {
            int x = a + b;
            System.out.println(x);

        }
    }
    class Subtraction extends MyClass {
        void calculate(int a, int b) {
            int y = a - b;
            System.out.println(y);

        }
    }
        class Multiplication extends MyClass {
            void calculate(int a, int b) {
                int z = a * b;
                System.out.println(z);

            }
        }


            public class MyTest {
                public static void main(String[] args) {
                    Addition a = new Addition();
                    Subtraction s = new Subtraction();
                    Multiplication m = new Multiplication();
                    a.calculate(10, 10);
                    s.calculate(20, 10);
                    m.calculate(10, 10);

                }

            }

