package ArrayLists;

import java.util.*;

public class arraylist_sheet {

    // -------------isMonotonic-------------

    public static boolean isMonotonic(ArrayList<Integer> A) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) < A.get(i + 1)) {
                decreasing = false;
            } else if (A.get(i) > A.get(i + 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    // ---------------Lonely No in Arraylist---------------
public static int findlonely(ArrayList<Integer> list) {
    Collections.sort(list);

  for (int i = 0; i < list.size(); i++) {
            // Check if the current number is not equal to the next one
            if ((i == 0 || list.get(i) != list.get(i - 1)) && (i == list.size() - 1 || list.get(i) != list.get(i + 1))) {
                return list.get(i); // Return the lonely number
            }
        }
        return -1; // Return -1 if no lonely number is found
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        boolean result = isMonotonic(list);
        System.out.println("Is monotonic? " + result);
    }
}