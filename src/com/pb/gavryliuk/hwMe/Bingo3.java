package com.pb.gavryliuk.hwMe;
import java.util.Scanner;

public class Bingo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = (int) Math.round(Math.random() * 100);
        System.out.println("Приветствуем Вас в игре Bingo. По правилам игры Вам необходимо угадать число от 0 до 100.");
        System.out.println("Для выхода из программы введите любое число больше 100.");
        int x;
        int counter = 0;

            do {
                counter++;
                System.out.println("Введите целое число: ");
                x = scanner.nextInt();

                if (x > y)
                    System.out.println("Задуманное число меньше, чем Вы ввели.");
                else if (x < y)
                    System.out.println("Задуманное число больше, чем Вы ввели.");
            }
            while (x!=y);
            System.out.println("Поздравляем! Вы угадали с попытки № " + counter + ". Задуманное число = " + y + " :)");
            System.out.println("Игра окончена, спасибо за игру!");
    }
}