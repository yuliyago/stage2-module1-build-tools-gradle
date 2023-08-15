package com.epam.demo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            try {
                double num = Double.parseDouble(arg);

                if (num <= 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println("mist");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> lst=new ArrayList<>();
        lst.add("11.22");
        lst.add("2");
        lst.add("33");
        lst.add("87");
        System.out.println(isAllPositiveNumbers(lst));
    }
}