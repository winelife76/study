package me.sanio.study.javalang.lambda;

import java.util.Date;
import java.util.function.IntConsumer;

public class Hello {
    public static void main(String[] args)
    {
        System.out.println("The time is :" + new Date());
        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
    }
    public static void repeat(int n, IntConsumer action)
    {
        try {
        for (int i = 0; i < n; i++) {

            Thread.sleep(1000);
            action.accept(i);
        }
        }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
