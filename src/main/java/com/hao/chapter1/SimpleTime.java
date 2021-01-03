package com.hao.chapter1;

public class SimpleTime {
    private static int count = 60;

    public static void main(String[] args) {
        int remaining = 0;
        while (true) {
            remaining = countDown();
            if (remaining == 0) {
                break;
            } else {
                System.out.println("Remaining " + remaining + " second(s)");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Done .....");
        }
    }

    private static int countDown() {
        return count--;
    }
}
