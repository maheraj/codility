package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int l = A.length;
        int nl = l + 1;
        int[] nA = new int[nl];
        
        for(int i = 0; i < l; i++) {
            nA[A[i] -1] ++; 
        }
        for(int i = 0; i < nl; i++) {
            if(nA[i] == 0) {
                return i+1;
            }
        }
        return 0;
    }
}
