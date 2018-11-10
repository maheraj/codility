// https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
// https://app.codility.com/demo/results/trainingET6FAP-CXG/
class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        return B/K - A/K + (A%K == 0 ? 1 : 0);
    }
}
