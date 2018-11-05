package com.hai.wei.util.order;

import java.util.Random;
import java.util.UUID;

/**
 * <功能描述>
 *
 * @author haiwe
 * @ClassName OrderUtils
 * @Date 2018/10/27 15:18
 * @Version 1.0
 */
public final class OrderUtils {

    private static Random random = new Random();

    private OrderUtils() {
    }

    public static long generateOrderId() {
        return random.nextInt(10000);
    }

    public static String generateOrderNo() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
