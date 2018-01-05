package com.rank.strings;

import java.util.Scanner;

public class CamelCase {

    static int camelCase(String s){
        String[] arr = s.split("[A-Z]");

        return arr.length;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelCase(s);
        System.out.println(result);
        in.close();
    }
}
