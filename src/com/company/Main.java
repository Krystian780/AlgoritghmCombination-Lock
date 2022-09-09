package com.company;

public class Main {

    public static void main(String[] args) {
        getPetya(15,6);
    }

    public static void getPetya(int comers, int sheets){
        int howManyRedSheets = 0;
        int howManyGreenSheets = 0;
        int howManyBlueSheets = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int howManyReedSheets2 = 1;
        int howManyGreenSheets2 = 1;

        while(comers!=count1){
            count1++;
            howManyRedSheets = howManyRedSheets + 2;
            if(howManyRedSheets>=sheets){
                howManyReedSheets2++;
                howManyRedSheets = 0;
            }
        }

        while(comers!=count2){
            count2++;
            howManyGreenSheets = howManyGreenSheets + 5;
            if(howManyGreenSheets>=sheets){
                howManyGreenSheets2++;
                howManyGreenSheets = howManyGreenSheets2%5;
            }
        }

        System.out.println(howManyReedSheets2);
        System.out.println(howManyGreenSheets2);

    }

}
