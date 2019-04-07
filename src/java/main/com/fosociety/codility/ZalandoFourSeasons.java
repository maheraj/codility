package com.fosociety.codility;

//https://app.codility.com/c/feedback/ZYUMAG-HE4
import java.util.Arrays;

class ZalandoFourSeasons {
    public String solution(int[] T) {
        int seasonLength = T.length / 4;
        int[] WINTER = new int[seasonLength];
        int[] SPRING = new int[seasonLength];
        int[] SUMMER = new int[seasonLength];
        int[] AUTUMN = new int[seasonLength];
        for (int i = 0; i < T.length; i++) {
            if (i < seasonLength) {
                WINTER[i] = T[i];
            } else if (i < seasonLength * 2) {
                SPRING[i - seasonLength] = T[i];
            } else if (i < seasonLength * 3) {
                SUMMER[i - seasonLength * 2] = T[i];
            } else if (i < seasonLength * 4) {
                AUTUMN[i - (seasonLength * 3)] = T[i];
            }
        }

        Arrays.sort(WINTER);
        Arrays.sort(SPRING);
        Arrays.sort(SUMMER);
        Arrays.sort(AUTUMN);

        //System.out.println(Arrays.toString(WINTER));
        //System.out.println(Arrays.toString(SPRING));
        //System.out.println(Arrays.toString(SUMMER));
        //System.out.println(Arrays.toString(AUTUMN));

        String season = "WINTER";
        int highest = WINTER[seasonLength - 1] - WINTER[0];

        int temp = SPRING[seasonLength - 1] - SPRING[0];
        if (highest < temp) {
            highest = temp;
            season = "SPRING";
        }

        temp = SUMMER[seasonLength - 1] - SUMMER[0];
        if (highest < temp) {
            highest = temp;
            season = "SUMMER";
        }
        temp = AUTUMN[seasonLength - 1] - AUTUMN[0];
        if (highest < temp) {
            highest = temp;
            season = "AUTUMN";
        }

        return season;
    }


}
