package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(boyOrGirl("wjmzbr"));
    }

    public static String boyOrGirl(String name){
       String[] splitted = name.split("");
       ArrayList<String> coverted = new ArrayList<>(Arrays.asList(splitted));
       ArrayList<String> occured = new ArrayList<>();
       int numberOfOccurences = 0;
       for(int x = 0; x < coverted.size(); x++){
           if(occured.isEmpty()){
               occured.add(coverted.get(x));
               numberOfOccurences++;
           }else{
               if(occured.contains(coverted.get(x))){

               }else{
                   numberOfOccurences++;
               }
           }
       }
       if(numberOfOccurences%2==0){
           return ("CHAT WITH HER!");
       }else{
           return ("I AM NOT A GAY");
       }
    }

}
