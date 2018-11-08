//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
class CyclicRotation { 
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
}
