package Assignment_3.Lab5;


public class LAB5P1 {
    public static void main(String[] args) {
        // TODO: write your code here
        int n1 = 7;
        int n2 = 24;
        MyInteger test = new MyInteger(n1);


        System.out.print("n1 is even? ");
        System.out.println(test.isEven());

        System.out.print("n1 is prime? ");
        System.out.println(test.isPrime());

        System.out.print("15 is prime? ");
        System.out.println(test.isPrime(15));

        System.out.print("parseInt(char[]) for  { '4', '3', '7', '8' } ");
        System.out.println(test.parseInt(new char[]{'4', '3', '7', '8'}));

        System.out.print("parseInt(String) for 4378= ");
        System.out.println(test.parseInt("4378"));

        System.out.print("n2 is odd? ");
        System.out.println(test.isOdd(n2));

        System.out.print("45 is odd? ");
        System.out.println(test.isOdd(45));

        System.out.print("n1 is equal to n2? ");
        System.out.println(test.equals(n2));

        System.out.print("n1 is equal to 5? ");
        System.out.println(test.equals(5));
    }
}

class MyInteger {

    // TODO: write your code here
    private int value;

    public int getValue() {
        // TODO: write your code here
        return value;
    }

    public MyInteger(int value) {
        // TODO: write your code here
        this.value = value;
    }

    public boolean isPrime() {
        // TODO: write your code here
        int num = getValue();
        if (num == 2){
            return true;
        }
        else{
            if (num % 2 == 0){
                return false;
            }
            else{
                for(int i = 3; i <= num/ 2; ++i){
                    if(num % i == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        // TODO: write your code here
        if (num == 2){
            return true;
        }
        else{
            if (num % 2 == 0){
                return false;
            }
            else{
                for(int i = 3; i <= num/ 2; ++i){
                    if(num % i == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isPrime(MyInteger o) {
        // TODO: write your code here
        if (o.value == 2){
            return true;
        }
        else{
            if (o.value % 2 == 0){
                return false;
            }
            else{
                for(int i = 3; i <= o.value/ 2; ++i){
                    if(o.value % i == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isEven() {
        // TODO: write your code here
        int n = getValue();
        return n % 2 == 0;
    }

    public boolean isOdd() {
        // TODO: write your code here
        int n = getValue();
        return n % 2 != 0;
    }

    public static boolean isEven(int n) {
        // TODO: write your code here
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        // TODO: write your code here
        return n % 2 != 0;
    }

    public static boolean isEven(MyInteger n) {
        // TODO: write your code here
        return n.value % 2 == 0;
    }

    public boolean equals(int anotherNum) {
        // TODO: write your code here
        return value == anotherNum;
    }

    public boolean equals(MyInteger o) {
        // TODO: write your code here
        return value == o.value;
    }

    public static int parseInt(char[] numbers) {
        // numbers consists of digit characters.
        // For example, if numbers is {'1', '2', '5'}, the return value
        // should be 125. Please note that
        // numbers[0] is '1'
        // numbers[1] is '2'
        // numbers[2] is '5'

        // TODO: write your code here
        int result = 0;
        int length = numbers.length - 1;

        for (int i = 0; i <= length; i++)
        {
            int digit = numbers[i] - '0';
            result *= 10;
            result += digit;
        }
        return result;
    }

    public static int parseInt(String s) {
        // s consists of digit characters.
        // For example, if s is "125", the return value
        // should be 125.

        // TODO: write your code here
        int a = 0, b = 0;
        int len = s.length();
//        System.out.println(len);
        while (a < len){
            b *= 10;
//            System.out.println(b);
            b += (s.charAt(a++)- '0');
//            System.out.println(b);
        }
        return b;
    }
}
