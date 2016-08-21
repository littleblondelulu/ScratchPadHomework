package com.theironyard;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
       return ((aSmile && bSmile) || (!aSmile && !bSmile));
   }

    public static int sumDouble(int a, int b){
       int sum = a + b;

       if(a == b){
           sum = sum * 2;
       }
        return sum;
   }

    public static boolean makes10(int a, int b) {
       //boolean isTrue;

        return a == 10 || b == 10 || a+b == 10;

    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return (a<0 && b<0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public static String notString(String str) {
        if(str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not " + str;
    }

    public static String missingChar(String str, int n){
        String front = str.substring(0, n);

        String back = str.substring(n+1, str.length());

        return front + back;

    }

    public static String backAround(String str) {

        char last = str.charAt(str.length() - 1);

        return (last + str + last);

    }

    public static boolean or35(int n) {

        return ((n%3== 0) || (n%5 == 0));

    }

    public static String front22(String str) {
        String frontTwo;

        if(str.length() >= 2){
            frontTwo = str.substring(0,2);
        }
        else{
            frontTwo = str;
        }

        return frontTwo + str + frontTwo;
    }

    public static boolean startHi(String str) {
        if (str.length() <2) {
            return false;
        }

            String firstTwo = str.substring(0, 2);

            return firstTwo.equals("hi");

    }

    public static boolean icyHot(int temp1, int temp2) {

        return ((temp1<0 && temp2>100) || (temp1>100 && temp2<0));

    }

    public static boolean in1020(int a, int b) {
        return ((a>=10 && a <=20) || (b>= 10 && b <=20));

    }


}
