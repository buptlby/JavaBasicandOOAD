package com.solution.Solution9;

import java.util.Scanner;

//第二章编程练习
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Clock clock = new Clock(in.nextInt(),in.nextInt(),in.nextInt());
        clock.tick();
        System.out.println(clock);
        in.close();
    }
}
