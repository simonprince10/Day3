package com.company;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "Race";
        String str = "Care";
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();

        char arr[] = s.toCharArray();
        char arr1[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i],1);
            }else{
                 Integer d=(int)map.get(arr[i]);
                 map.put(arr[i],++d);
            }
        }
        for(int j=0;j< arr1.length;j++){
            if (map1.get(arr[j]) == null) {
                map1.put(arr[j],1);
            }else{
                Integer e=(int)map1.get(arr[j]);
                map1.put(arr[j],++e);
            }
        }
        if(map.equals(map1)){
            System.out.println("Given String is Anagram");
        }else{
            System.out.println("Given String is not Anagram");
        }
    }
}