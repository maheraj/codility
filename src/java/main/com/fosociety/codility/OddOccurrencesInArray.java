package com.fosociety.codility;

import java.util.Arrays;

//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
class OddOccurrencesInArray {
    public int solution(int[] A) {
		int result;
        Arrays.sort(A);
		int prevNumber = A[0];
		int count = 1;
		for(int i = 1; i < A.length; i++) {			
			if(A[i] == prevNumber) {
				count++;
			} else {	
				if(count % 2 == 1) {
					break;
				} else {
					prevNumber = A[i];
					count = 1;
				}
			}
		}
		return prevNumber;
    }
}
