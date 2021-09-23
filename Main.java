package com.company;

import java.awt.datatransfer.StringSelection;

public class Main {

    public static void main(String[] args) {

        // მაგალითები :

	    String m = "საშინაო დავალება";
        System.out.println(m);
        int n = 777;
        System.out.println(n);
        float b = 5.346f;
        System.out.println(b);
        char v = 'z';
        System.out.println(v);
        boolean c = true;
        System.out.println(c);

        // დაბადების წელი და ასაკი

        String a = "ჩემი დაბადების წელია";
        String s = "ჩემი ასაკია";
        int x = 2021;
        int y = 1996;
        int w = 25;
        int q = x-y;
        int r = x-w;
        System.out.println(a + " "+ r + " " + s + " " + q);

        // არითმეტიკული ოპერატორები

        int first = 100;
        int second = 50;
        int third = 30;
        System.out.println(first + second);
        System.out.println(second - first + third);
        System.out.println(second * third % first);
        System.out.println(--first);
        System.out.println(++second);
        System.out.println(first /second + third);

        // ლოგიკური ოპერატორები

        int logOne = 10;
        int logTwo = 5;
        float logthree = 14.5f;
        System.out.println(logTwo < 20 && logTwo>3);
        System.out.println(logthree < logOne && logthree > logTwo);
        System.out.println(logthree > logOne || logthree < logTwo);
        System.out.println(!(logthree > logOne && logthree > logTwo));

    }
}
