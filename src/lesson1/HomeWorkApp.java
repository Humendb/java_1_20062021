package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printeThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }


    public static void printeThreeWords() {
        System.out.println("_Apple");
        System.out.println("_Banana");
        System.out.println("_Orange");

    }

    public static void checkSumSing() {
        int a = 7;
        int b = 5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");


        }
    }

    public static void printColor() {
        int a = 76;
        if (a <= 0) {

            System.out.println("Красный");
        } else if (a <= 100) {
            System.out.println("Жолтый");
        } else {
System.out.println("Зеленый");

        }
    }
    public static void compareNumbers() {
        int a =75;
        int b =34;
        if (a >=b){
            System.out.println("a >= b");

        }else {
            System.out.println("a < b");
        }
    }


}