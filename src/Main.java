public class Main {

    //Задача №1
    static void toPrintNumbers() {
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }
    }
    //Задача №2
    // Необходимо вывести все положительные степени числа 5,
    // которые меньше 10000, вывести результат возведения в степень.

    static void toPrintAPowerOfANumber5() {
        double i = 0;
        while (Math.pow(5, i) < 10_000) {
            System.out.println((int) Math.pow(5, i));
            i++;
        }
    }

    // Задача № 3
    static void toPrintNumbersMultiple4() {
        for (int i = 40; i <= 60; i++) {
            if (i % 4 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        toPrintNumbers();
        toPrintAPowerOfANumber5();
        toPrintNumbersMultiple4();
    }
       
}