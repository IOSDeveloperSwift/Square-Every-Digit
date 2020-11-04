package base;

public class Main {


    public static void main(String[] args) {

        System.out.println(squareDigits(123));
    }

    static int squareDigits(int n) {
        String str = "";

        while (n > 0) {
            int digit = n % 10;
            str = digit * digit + str;
            n /= 10;
        }
        return Integer.parseInt(str);
    }
    

}






