package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueCharacters {
    public static void main(String[] args){
        String s="aabbecd";
        char ch[]=s.toCharArray();
        int count=s.length();
        for(int i=0;i<s.length();i++){
            if(i!=s.indexOf(ch[i])){
                count--;
            }
        }
        System.out.println(count);
    }}
