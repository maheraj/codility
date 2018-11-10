//https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
//https://app.codility.com/demo/results/training2YNMJP-VXQ/

class MinAvgTwoSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
		int N = A.length;
        int[] B = new int[N + 1];
		
        for(int i = 0; i < N; i++) {
            B[i+1] =B[i] + A[i];
        }
		
        double minAvg = (A[0] + A[1]) / 2.0;		
		int minIndex = 0;
		
        for(int i = 0; i < N - 1; i++) {
			int x = i;
			int y = i + 1;
            double avg1 = (B[y+1] - B[x]) / 2.0;
            if(avg1 < minAvg) {
                minAvg = avg1;
				minIndex = i;
            }
			
			if(i < N - 2) {
				y = i + 2;
	            double avg2 = (B[y+1] - B[x]) / 3.0;
	            if(avg2 < minAvg) {
	                minAvg = avg2;
					minIndex = i;
	            }
			}
        }
        return minIndex;
    }
}
