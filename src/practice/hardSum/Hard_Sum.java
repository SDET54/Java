package practice.hardSum;

import java.util.ArrayList;
import java.util.Arrays;

class Hard_Sum {
    public static void main(String[] args) {
        ArrayList<Integer> actualList = new ArrayList<>(Arrays.asList(3, 9, 4, 12, 5, 6, 7, 1, 8));
        int expectedSum = 13;
        ArrayList<Integer> expectedList = new ArrayList<>();
        sum(actualList, expectedSum, expectedList);
    }

    static void sum(ArrayList<Integer> actualList, int expectedSum, ArrayList<Integer> expectedList) {
        int sum = 0;
        for (Integer each : expectedList) {
            sum += each;
        }

        if (sum == expectedSum) {
            System.out.println(Arrays.toString(expectedList.toArray()));
        }
        if (sum >= expectedSum) {
            return;
        }
        for (int i = 0; i < actualList.size(); i++) {
            ArrayList<Integer> numbersWithoutI = new ArrayList<>();
            for (int j = i + 1; j < actualList.size(); j++) {
                numbersWithoutI.add(actualList.get(j));
            }
            ArrayList<Integer> numbersWithoutJ = new ArrayList<>(expectedList);
            numbersWithoutJ.add(actualList.get(i));

            sum(numbersWithoutI, expectedSum, numbersWithoutJ);
        }
    }

}