package com.rank.strings;

import java.util.Scanner;

public class SuperReduceString {
    static String super_reduced_string(String s){
        StringBuilder builder = new StringBuilder(s);
        for (int i = 1; i < builder.length(); i++) {
            if (builder.charAt(i) == builder.charAt(i-1)) {
                builder.delete(i-1, i + 1);
                i = 0;
            }
        }

        if(s.length() == 0){
            return "Empty String";
        }else{
            return builder.toString();
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
