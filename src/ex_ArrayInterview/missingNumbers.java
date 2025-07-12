package ex_ArrayInterview;

import java.util.ArrayList;

public class missingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int totalSize = 5;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Loop through 1 to totalSize
        for (int i = 1; i <= totalSize; i++) {
            boolean found = false;

            // Loop through input array
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                arrayList.add(i);
            }
        }
        System.out.print("Missing elements: "+arrayList);
    }
}

