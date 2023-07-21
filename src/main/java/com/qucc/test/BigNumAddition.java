package com.qucc.test;

import java.util.*;

public class BigNumAddition {
    public static String add(String num1, String num2) {
        StringBuilder result = new StringBuilder();


        // 将两个字符串反转，方便从低位到高位相加
        String reversedNum1 = new StringBuilder(num1).reverse().toString();
        String reversedNum2 = new StringBuilder(num2).reverse().toString();

        int maxLength = Math.max(num1.length(), num2.length());
        int carry = 0; // 进位

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < reversedNum1.length() ? reversedNum1.charAt(i) - '0' : 0;
            int digit2 = i < reversedNum2.length() ? reversedNum2.charAt(i) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10; // 进位
            int digit = sum % 10;

            result.append(digit);
        }

        // 最高位可能还有进位
        if (carry > 0) {
            result.append(carry);
        }

        // 反转结果字符串，得到正确的结果
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "1234567890123456789012345678945353453453423453240354353535345";
        String num2 = "3473434444444444445555555554534444444423453453453423453534534";

        String sum = add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}

