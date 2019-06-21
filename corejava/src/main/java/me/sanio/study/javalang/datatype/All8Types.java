package me.sanio.study.javalang.datatype;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class All8Types {
    public static void main(String[] args) {
        short shortT = 124;
        int intT = 12598;
        long longT = 65530;
        byte byteT = 0b1001;//,0b,0B->二进制9
        ArrayList<Integer> nanotime = new ArrayList<>();

        BigDecimal a = BigDecimal.valueOf(2.0);
        BigDecimal b = BigDecimal.valueOf(1.1);
        System.out.println(2.0 - 1.1);
        System.out.println(2 - 1.1);
        System.out.println(a.subtract(b));
        System.out.println(15/2);
        System.out.println(15.0/2);
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        for (int i = 0; i <100 ; i++) {
            //System.out.println(System.currentTimeMillis());
            //System.out.println(getmicTime());
            nanotime.add(i);
            System.out.println(System.nanoTime()+":"+nanotime.size());
        }


    }

    public static Long getmicTime() {
        Long cutime = System.currentTimeMillis() * 1000; // 微秒
        Long nanoTime = System.nanoTime(); // 纳秒
        return cutime + (nanoTime - nanoTime / 1000000 * 1000000) / 1000;
    }

}
