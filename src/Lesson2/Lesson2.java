package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
//              первое дз
        System.out.println(checkSum(10, 20));
        isPositiveOrNegative(5);
        System.out.println(isNegative(-13));
        printlnLineNumber("Hello",2);
    }

    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {

        }
        return (false);
    }

    //                 второе дз
    public static void isPositiveOrNegative(int a) {
        if (a > 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    //                  третье дз
    public static boolean isNegative(int a) {
        if (a > -3) {
            return true;
        }
        return false;
    }

    //    четвертое дз
    public static void printlnLineNumber(String word, int times) {
        for (int i = 0; i < 5; i++){
            System.out.println("Hello "+ i);
        }
    }

}