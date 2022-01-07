package com.mydomain.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static String getRandomString(int length) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }
        return result.toString();
    }

//    public static Long getRandomLong(Long min, Long max) {
//        return ThreadLocalRandom.current().nextLong(min, max);
//    }
//
//    public static String getRandomPhone() {
//        return getRandomLong(11111111111111111L, 99999999999999999L) + "";
//    }

//    public static String getRandomEmail() {
//        String emailDomain = "@email.com";
//        return getRandomString(7) + emailDomain;
//    }



}
