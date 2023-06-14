package com.testing;

public class StringReplace {
    public static void main(String[] args) {
        String s="H...HH....";
        if(s.contains("HH"))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        s=s.replace('.','W');
        System.out.println(s);
    }
}
