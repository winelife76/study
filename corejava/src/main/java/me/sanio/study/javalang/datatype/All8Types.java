package me.sanio.study.javalang.datatype;

import java.math.BigDecimal;

public class All8Types {
    public static void main(String[] args) {
        short shortT = 124;
        int intT = 12598;
        long longT = 65530;
        byte byteT = 0b1001;//,0b,0B->二进制9

        BigDecimal a = BigDecimal.valueOf(2.0);
        BigDecimal b = BigDecimal.valueOf(1.1);
        System.out.println(2.0 - 1.1);
        System.out.println(2 - 1.1);
        System.out.println(a.subtract(b));
        System.out.println(15/2);
        System.out.println(15.0/2);
    }

}
