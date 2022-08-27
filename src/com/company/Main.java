package com.company;

public class Main {

    public static void main(String[] args) {
	int digits = 5;
	int [] currentLock = new int[]{8,2,1,9,5};
	int [] correctCode = new int[]{6,4,7,2,3};
        System.out.println(get(digits, currentLock, correctCode));
    }

    public static int get(int digits, int[] currentLock, int[] correctCode){
        int howManyChanges = 0;
        for(int x = 0; x < digits; x++){
            int correctCode2 = correctCode[x];
            int startingPointLooping = currentLock[x];
            int leftCountTillFound = 0;
            int rightCountTillFound = 0;
            boolean whenFoundIteratingtoTheRightSetToFalse = true;
            while(whenFoundIteratingtoTheRightSetToFalse){
                if(startingPointLooping==correctCode2){
                    whenFoundIteratingtoTheRightSetToFalse = false;
                }
                else{
                    if(startingPointLooping==10){
                        startingPointLooping = 1;
                        rightCountTillFound++;
                    }else{
                        startingPointLooping++;
                        rightCountTillFound++;
                    }
                }
            }
            startingPointLooping = currentLock[x];
            boolean leftIterating = true;
            while(leftIterating){
                if(startingPointLooping==correctCode2){
                    leftIterating = false;
                }
                else{
                    if(startingPointLooping==0){
                        startingPointLooping = 10;
                        leftCountTillFound++;
                    }else{
                        startingPointLooping--;
                        leftCountTillFound++;
                    }
                }
            }
            howManyChanges =  howManyChanges + (Math.min(leftCountTillFound,rightCountTillFound));
        }

        return howManyChanges-1;
    }

}
