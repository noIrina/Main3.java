package com.company;

public class inkrement {
    public static void main(String[] args) {
        int x = 1, y = 5, z = 0;
        --y;//4
        x = 4 + y++;// 8 y=5
        z += x--;// 8
        x = y + z; //8+5
        System.out.print(++x);
    }
}