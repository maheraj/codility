package com.fosociety.codility;

//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
class CyclicRotation { 
	
	//Solution 1
	public int[] solution(int[] A, int K) {
		if(A == null || A.length == 0) {
			return A;
		}
		
		K = K % A.length;
		int n = A.length;
		
		
		while(K > 0) {
			int last = A[n-1];
			int temp = A[0];
			A[0] = last;
			
			for(int i = 1; i < A.length; i++) {
				int a = A[i];
				A[i] = temp;
				temp = a;
			}
			K--;
		}
		return A;
	}
	
	//Solution 2
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] res = new int[A.length];
        int k = K % A.length;
        if (k == 0) return A;
        for (int i = 0; i < A.length; i++) {
            res[(i + k) % A.length] = A[i];
        }
        return res;
    }
	
}
