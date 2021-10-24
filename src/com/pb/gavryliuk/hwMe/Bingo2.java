package com.pb.gavryliuk.hwMe;
import java.util.Random;

class Bingo2 {
    public static void main(String[] args) {
        Random random = new Random();

        int bound;
        int x = random.nextInt(11);
        System.out.println("рандом: " + x);

        double y = Math.random() * 100;
        int result = (int) Math.round(y);
        System.out.println("рандом: " + result);
    }
}
