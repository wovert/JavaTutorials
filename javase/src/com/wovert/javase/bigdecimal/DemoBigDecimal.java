package com.wovert.javase.bigdecimal;

import java.math.BigDecimal;

public class DemoBigDecimal {
    public static void main(String[] args) {
//        BigDecimal bd1 = new BigDecimal(10.8);
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("3.0");

        System.out.println(bd1);
        System.out.println(bd2);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);
        System.out.println(10.8 + 0.3);

        System.out.println(10.8 - 0.3);
        System.out.println(bd1.subtract(bd2));

        BigDecimal divide1 = bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_DOWN); // 四舍五入
        BigDecimal divide2 = bd1.divide(bd2, 2, BigDecimal.ROUND_UP); // 进一法
        BigDecimal divide3 = bd1.divide(bd2, 2, BigDecimal.ROUND_FLOOR); // 去尾法
        System.out.println(divide1); // 3.33
        System.out.println(divide2); // 3.34
        System.out.println(divide3); // 3.33

    }
}
