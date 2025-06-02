package ArrayLists;

import java.util.*;

public class array_list {
    // ------Swap two numbers------
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // ------Container with most Water------
    // 1)----Brute Force----
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // brute force - O(n^2)
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    // 2)----Two Pointer Approach O(n)----

    public static int storePani(ArrayList<Integer> height) {
        int maxPani = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // claculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currPani = ht * width;
            maxPani = Math.max(maxPani, currPani);
            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxPani;
    }

    // ------Pair Sum 1------
    // 1) Brute Force
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }

            }
        }
        return false;
    }

    // 2) ----Two Pointer Approach O(n)----
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            // case 1
            if (lp + rp == target) {
                return true;
            }
            // case 2
            if (lp + rp > target) {
                lp++;
            } else {
                // case 3
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // get elements
        int element = list.get(2);
        System.out.println(element);

        // Removing elements
        list.remove(2);
        System.out.println(list);

        // set elements
        list.set(2, 10);
        System.out.println(list);

        // Conatains elements
        System.out.println(list.contains(12));

        // Size of the list
        System.out.println(list.size());

        // Iterating through the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Reversing the list
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Maximum element in the list
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i) > max) {
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum element in the list: " + max);

        // Swap 2 elements

        int idx1 = 1, idx2 = 3;
        System.out.println("Before swapping: " + list);
        swap(list, idx1, idx2);
        System.out.println("After swapping: " + list);

        // sorting the list

        // assending order
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list: " + list);

        // ----Multidimensional array list----
        // 1)
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(1);
        // list3.add(2);
        // mainList.add(list3);

        // ArrayList<Integer> list4 = new ArrayList<>();
        // list4.add(3);
        // list4.add(4);
        // mainList.add(list4);

        // for(int i = 0; i < mainList.size(); i++) {
        // ArrayList<Integer> currlist = mainList.get(i);
        // for(int j = 0; j < currlist.size(); j++) {
        // System.out.print(currlist.get(j) + " ");
        // }
        // System.out.println();
        // }
        // System.out.println(mainList);
        // }

        // 2)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        ArrayList<Integer> list6 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list4.add(i * 1);
            list5.add(i * 2);
            list6.add(i * 3);
        }
        mainList.add(list4);
        mainList.add(list5);
        mainList.add(list6);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentlist = mainList.get(i);
            for (int j = 0; j < currentlist.size(); j++) {
                System.out.print(currentlist.get(j) + " ");
            }
            System.out.println();
        }

        // ----Container with most Water----
        // 1) Brute Force
        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("max water stored : " + storeWater(height));
        System.out.println("max water stored : " + storePani(height));

        // ------Pair Sum 1------
        // 1) Brute Force

        ArrayList<Integer> list7 = new ArrayList<>();
        // 1, 2, 3, 4, 5. 6
        list7.add(1);
        list7.add(2);
        list7.add(3);
        list7.add(4);
        list7.add(5);
        list7.add(6);
        int target = 5;
        System.out.println(pairSum(list7, target));
        System.out.println(pairSum1(list7, target));
    }
}