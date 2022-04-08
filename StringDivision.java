package com.company;

public class StringDivision {
    public static void main(String[] args) {
        String s="aabbccf";
    int len=s.length();
    for(int i=0;i<len;i++)
    if(i%len/2==0){
        System.out.println("Given String are divisible");
}
    else{
        System.out.println("Given String are not divsible");
    }}}
