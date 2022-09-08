package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getAmountOfCalls(9999));
    }

    public static int getAmountOfCalls(int digit){
        int length = String.valueOf(digit).length();
        int howManyTimes = 0;
        int rest = 0;
        if(length==1){
            howManyTimes = digit-1;
        }if(length>1){
            char digits = (Integer.toString(digit).charAt(0));
            howManyTimes = Character.getNumericValue(digits) -1;
        }

        if(length==1){
            rest = 1;
        }else if(length==2){
            rest = 3;
        }else if(length==3){
            rest = 6;
        }else{
            rest = 10;
        }

        return howManyTimes * 10 + rest;
    }
}
