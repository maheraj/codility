//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
class BinaryGap { 
	public int solution(int n) {
		StringBuilder binary = new StringBuilder();
		while(n > 1) {
			binary.append(n % 2);
			n = n / 2;
		}
		binary.append(n);
		String result = binary.reverse().toString();
		int max = 0;
		int count = 0;
		for(int i = 0; i < result.length(); i++) {			
			if(result.charAt(i) == '1') {
				if (max < count) {
					max = count;
				}
				count = 0;
			} else {
				count++;
			}
		}
		return max;
	}
}
