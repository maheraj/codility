package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int distance = Y - X;
        return distance % D > 0 ? (distance / D) + 1 : (distance / D);
    }
}
