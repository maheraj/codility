// https://app.codility.com/c/feedback/ZYUMAG-HE4

import java.util.LinkedList;
public class ZalandoABString {
    public String solution(int A, int B) {
        StringBuilder sb = new StringBuilder();
        LinkedList<Character> finalComb = new LinkedList<Character>();
        LinkedList<Character> listComb1 = new LinkedList<Character>();
        boolean isABig = true;
        int small;
        if (A < B) {
            isABig = false;
        }

        if (isABig) {
            LinkedList<Character> listA = new LinkedList<>();
            for (int i = 0; i < A; i++) {
                listA.add('a');
            }


            int bUsed = 0;
            for (int i = 0; i < B; i++) {

                if (listA.size() > 1) {
                    bUsed++;
                    listComb1.add(listA.poll());
                    listComb1.add(listA.poll());
                    listComb1.add('b');
                } else break;

            }
            while (!listA.isEmpty()) {
                listComb1.add(listA.poll());
            }


            for (int i = 0; i < B - bUsed; i++) {
                if (i == 0) {
                    finalComb.add(listComb1.poll());
                    finalComb.add('b');
                } else {
                    finalComb.add(listComb1.poll());
                    finalComb.add(listComb1.poll());
                    finalComb.add(listComb1.poll());
                    finalComb.add('b');
                }
            }
        } else {
            LinkedList<Character> listA = new LinkedList<>();
            for (int i = 0; i < B; i++) {
                listA.add('b');
            }


            int aUsed = 0;
            for (int i = 0; i < A; i++) {

                if (listA.size() > 1) {
                    aUsed++;
                    listComb1.add(listA.poll());
                    listComb1.add(listA.poll());
                    listComb1.add('a');
                } else break;

            }

            while (!listA.isEmpty()) {
                listComb1.add(listA.poll());
            }


            for (int i = 0; i < A - aUsed; i++) {
                if (i == 0) {
                    finalComb.add(listComb1.poll());
                    finalComb.add('a');
                } else {
                    finalComb.add(listComb1.poll());
                    finalComb.add(listComb1.poll());
                    finalComb.add(listComb1.poll());
                    finalComb.add('a');
                }
            }
        }

        while (!listComb1.isEmpty()) {
            finalComb.add(listComb1.poll());
        }


        while (!finalComb.isEmpty()) {
            sb.append(finalComb.poll());
        }
        return sb.toString();

    }
}
