package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] flowers = { "R", "R", "R", "R", "R" };
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));

        int lettersChanged = 0;
        for(int x = 0; x < flowerList.size(); x++){
            if(x==0){
                if(flowerList.get(x).equalsIgnoreCase(flowerList.get(x+1))){
                    if(flowerList.get(x+1).equalsIgnoreCase("G")
                                || flowerList.get(x+1).equalsIgnoreCase("B")){
                        flowerList.set(x, "R");
                    }else if(flowerList.get(x+1).equalsIgnoreCase("F")
                                || flowerList.get(x+1).equalsIgnoreCase("G")){
                        flowerList.set(x, "B");
                    }else{
                        flowerList.set(x, "G");
                    }
                }
            }
            else if(x==flowerList.size()-1){
                if(flowerList.get(x).equalsIgnoreCase(flowerList.get(x-1))){
                    if(flowerList.get(x-1).equalsIgnoreCase("G")
                            || flowerList.get(x-1).equalsIgnoreCase("B")){
                        flowerList.set(x, "R");
                    }else if(flowerList.get(x-1).equalsIgnoreCase("G")
                            || flowerList.get(x-1).equalsIgnoreCase("R")){
                        flowerList.set(x, "B");
                    }else{
                        flowerList.set(x, "G");
                    }
                }
            }else{
                if(flowerList.get(x).equalsIgnoreCase(flowerList.get(x-1)) ) {
                    if (flowerList.get(x - 1).equalsIgnoreCase("G") && flowerList.get(x).equalsIgnoreCase("G")
                            || flowerList.get(x - 1).equalsIgnoreCase("B") && flowerList.get(x).equalsIgnoreCase("B")) {
                        flowerList.set(x, "R");
                    } else if (flowerList.get(x - 1).equalsIgnoreCase("G") && flowerList.get(x).equalsIgnoreCase("G")
                            || flowerList.get(x - 1).equalsIgnoreCase("R") && flowerList.get(x).equalsIgnoreCase("R")) {
                        flowerList.set(x, "B");
                    } else if (flowerList.get(x - 1).equalsIgnoreCase("B") && flowerList.get(x).equalsIgnoreCase("B")
                            || flowerList.get(x - 1).equalsIgnoreCase("R") && flowerList.get(x).equalsIgnoreCase("R")) {
                        flowerList.set(x, "G");
                    }
                }else if(flowerList.get(x).equalsIgnoreCase(flowerList.get(x+1))){
                    if(flowerList.get(x+1).equalsIgnoreCase("G") && flowerList.get(x).equalsIgnoreCase("G")
                            || flowerList.get(x+1).equalsIgnoreCase("B") && flowerList.get(x).equalsIgnoreCase("B") ){
                        flowerList.set(x, "R");
                    }else if(flowerList.get(x+1).equalsIgnoreCase("G") && flowerList.get(x).equalsIgnoreCase("G")
                            || flowerList.get(x+1).equalsIgnoreCase("R") && flowerList.get(x).equalsIgnoreCase("R")){
                        flowerList.set(x, "B");
                    }else if(flowerList.get(x+1).equalsIgnoreCase("B") && flowerList.get(x).equalsIgnoreCase("B")
                            || flowerList.get(x+1).equalsIgnoreCase("R") && flowerList.get(x).equalsIgnoreCase("R")){
                        flowerList.set(x, "G");
                    }

                }
            }
        }
        System.out.println(flowerList);

    }

}
