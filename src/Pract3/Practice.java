package Pract3;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;

        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);

        while (true) {
            if (!s.hasNextInt()) {
                System.out.println("Введите число");
                s.next();
                continue;
            }

            int number = s.nextInt();

            if (number == target) {
                System.out.println("Правильный ответ!");
                break;
            }
            System.out.println("Ваше число " +
                    (number > target ? "больше загаданного" : "меньше загаданного"));
        }
    }
}
