import java.util.*;

public class Array {
    // public static void main(String[] args) {
    // int marks[] = new int[50];
    // Scanner sc = new Scanner(System.in);

    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2] = sc.nextInt();

    // int percentage = (marks[0]+ marks[1]+ marks[2])/3;
    // System.out.println("Percentage: "+ percentage);
    // System.out.println(marks.length); // To know the lenght of an Array (.length)

    // --------------------Prog-2---------------------
    // public static void update(int marks[]) {

    // for (int i = 0; i < marks.length; i++) {
    // marks[i] = marks[i] + 1;
    // }
    // }

    // public static void main(String[] args) {
    // int marks[] = { 99, 76, 58 };
    // update(marks);
    // // print marks
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // OR
    // for (int i = 0; i < marks.length; i++) {
    // System.out.println(marks[i] + " ");

    // ----------------------LinearSearch---------------------

    // public static int linearSearch(int number[], int key) {
    // for (int i = 0; i < number.length; i++) {
    // if (number[i] == key) {
    // return i;
    // }

    // }
    // return -1; // no not exist
    // }

    // public static void main(String[] args) {
    // int number[] = { 34, 12, 25, 10, 57, 89 };
    // int key = 10;
    // int index = linearSearch(number, key);
    // if (index == -1) {
    // System.out.println("Key not found");
    // } else {
    // System.out.println("The key is: " + key);
    // }

    // ----------------Larest No in Array----------------

    // public static int getLargest(int numbers[]) {
    // int largest = Integer.MIN_VALUE; // -infinity
    // for (int i = 0; i < numbers.length; i++) {

    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }
    // }
    // return largest;
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 3, 5, 7, 10, 32, 15 };
    // System.out.println("The larest No: " + getLargest(numbers));

    // -------------------binarySearch---------------------

    // public static int binarySearch(int numbers[], int key) {
    // int start = 0, end = numbers.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;

    // if (numbers[mid] == key) { // found
    // return mid;
    // }

    // if (numbers[mid] < key) { // right
    // start = mid + 1;
    // } else { // left
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // int key = 10;

    // System.out.println("The index is: " + binarySearch(numbers, key));

    // }
    // -----------------------Reverse_Array------------------------

    // public static void reverse(int numbers[]) {
    // int first = 0, last = numbers.length - 1;

    // while (first < last) {
    // // swap
    // int temp = numbers[last];
    // numbers[last] = numbers[first];
    // numbers[first] = temp;

    // first++;
    // last--;
    // }
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 12, 14, 16, 18, 20 };

    // reverse(numbers);

    // // print
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }
    // System.out.println();
    // }

    // ------------------------Pairs_in_Array------------------------

    // public static void printPairs(int numbers[]) {
    // int tp = 0; // total pairs
    // for (int i = 0; i < numbers.length; i++) {
    // int curr = numbers[i]; // 2, 4, 6, 8, 10
    // for (int j = i + 1; j < numbers.length; j++) { //pairs
    // System.out.print("(" + curr + "," + numbers[j] + ")"); // (2,4) (2,6) (2,8)
    // (2,10)
    // tp++;
    // }
    // System.out.println();
    // }
    // System.out.println("Total pairs:" + tp); // total pairs
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // printPairs(numbers);
    // }

    // -----------------------Sub-Array------------------------

    // public static void printSubArrays(int numbers[]) {
    // int ts = 0;
    // for (int i = 0; i < numbers.length; i++) { // start
    // int start = i;
    // for (int j = i; j < numbers.length; j++) { // end
    // int end = j;
    // int sum = 0;
    // for (int k = start; k <= end; k++) { // print b/w start & end
    // System.out.print(numbers[k] + " ");

    // sum += numbers[k]; // accumulate sum
    // }
    // ts++;
    // System.out.println("-> Sum: " + sum);
    // }

    // System.out.println();

    // }
    // System.out.println("Total Pairs: " + ts);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // printSubArrays(numbers);

    // }
    // ---------------------Max_subArray_Sum-------------------------

    // public static void MaxSubArraysSum(int numbers[]) {
    // int currSum = 0;
    // int maxSum = Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // int start = i;
    // for (int j = i; j < numbers.length; j++) {
    // int end = j;
    // currSum = 0;
    // for (int k = start; k <= end; k++) {
    // // subarray sum
    // currSum += numbers[k];
    // }
    // System.out.println(currSum);
    // if (maxSum < currSum) {
    // maxSum = currSum;
    // }
    // }
    // }
    // System.out.println("maxSum = " + maxSum);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // MaxSubArraysSum(numbers);

    // }

    // ----------------------Kadane's_Algo----------------------

    // public static void Khadanes(int numbers[]) {
    // int currS = 0;
    // int maxS = Integer.MIN_VALUE;

    // for (int i = 0; i < numbers.length; i++) {
    // currS = currS + numbers[i];
    // if (currS < 0) {
    // currS = 0; // CS will be 0 if sum is -ve
    // }
    // maxS = Math.max(currS, maxS); //(stored in MS whichever is max {CS or MS})
    // }
    // System.out.println("Max Sum of Array is: " + maxS);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { -2, -3, 4, -1, -1, 1, 5, -3 };
    // Khadanes(numbers);
    // }
    // }

    // ----------------------Trapping_Rainwater----------------------

    // public static int trappedRainWater(int height[]) {
    // int n = height.length;
    // // calculate left max boundary - array
    // int leftMax[] = new int[n];
    // leftMax[0] = height[0];
    // for (int i = 1; i < n; i++) {
    // leftMax[i] = Math.max(height[i], leftMax[i - 1]); // (current height, leftMax
    // height)
    // }
    // // calculate right max boundary - array
    // int rightMax[] = new int[n];
    // rightMax[n - 1] = height[n - 1];
    // for (int i = n - 2; i >= 0; i--) {
    // rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    // }

    // int trappedWater = 0;
    // // loop
    // for (int i = 0; i < n; i++) {
    // // waterLevel = Min (leftmax bound, rightmax bound)
    // int waterLevel = Math.min(leftMax[i], rightMax[i]);
    // // trapped water = waterLevel - height[i]
    // trappedWater += waterLevel - height[i];
    // }

    // return trappedWater;
    // }

    // public static void main(String[] args) {
    // int height[] = { 4, 2, 0, 6, 3, 2, 5 };

    // System.out.println(trappedRainWater(height));
    // }

    // ----------------------------Buy & Sell_Stocks-----------------------

    // public static int buyAndSellStock(int prices[]) {
    // int buyPrice = Integer.MAX_VALUE; //min value of stock(getting min value)
    // int maxProfit = 0;

    // for (int i = 0; i < prices.length; i++) {
    // if (buyPrice < prices[i]) { // profit
    // int profit = prices[i] - buyPrice; // Today's profit
    // maxProfit = Math.max(maxProfit, profit);
    // } else {
    // buyPrice = prices[i];
    // }
    // }
    // return maxProfit;
    // }

    // public static void main(String[] args) {
    // int prices[] = { 7, 1, 5, 3, 6, 4 };
    // System.out.println(buyAndSellStock(prices));
    // }
    // }

    //----------------------- --------Assignment_Question----------------------------------

    // --Question 1: Given an integer array nums, return true if any value appears
    // at
    // least twice in the
    // array, and return false if every element is distinct.

    // public static boolean ContainsDuplicate(int[] nums) {
    // for (int i = 0; i < nums.length-1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // return true;
    // }

    // }
    // }
    // return false;

    // }

    // public static void main(String[] args) {
    // int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
    // System.out.println(ContainsDuplicate(nums));
    // }
    // }

    // Question 2: to search for a target element in an array that has been rotated
    // at an unknown pivot.The key aspect is that the array was originally sorted in
    // ascending order before the rotation.

    public class SearchRotatedSortedArray {
        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                // If the target is found at the middle index
                if (nums[mid] == target) {
                    return mid;
                }
                
                // Check if the left side is sorted
                if (nums[left] <= nums[mid]) {
                    // If target is within the sorted left side
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1; // Narrow down the search to the left half
                    } else {
                        left = mid + 1; // Search in the right half
                    }
                }
                // Else the right side must be sorted
                else {
                    // If target is within the sorted right side
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1; // Narrow down the search to the right half
                    } else {
                        right = mid - 1; // Search in the left half
                    }
                }
            }
            
            // Target is not found in the array
            return -1;
        }
    
        public static void main(String[] args) {
            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
            int result = search(nums, target);
            System.out.println("Index of target " + target + ": " + result);
            
            target = 3;
            result = search(nums, target);
            System.out.println("Index of target " + target + ": " + result);
        }
    }

    // --Question 3: You are given an array prices where prices[i] is
    // the price of a given stock on the ith day.
    // Return the maximum profit you can achieve from this transaction.
    // If you cannot achieve any profit, return 0.

    // public static int maxProfit(int[] prices) {
    // int BuyPrice = prices[0];
    // int profit = 0;

    // for (int i = 0; i < prices.length; i++) {
    // if (BuyPrice < prices[i]) {
    // profit = Math.max(prices[i] - BuyPrice, profit);
    // } else {
    // BuyPrice = prices[i];
    // }
    // }
    // return profit;
    // }

    // public static void main(String[] args) {
    // int prices[] = { 7, 1, 5, 3, 6, 4 };
    // System.out.println(maxProfit(prices));
    // }

    // --Question 4: Given n non-negative integers representing an elevation map
    // where
    // the width of each bar is 1, compute how much water it can trap after raining.

    // public static int trappedRainWater(int height[]) {
    // int n = height.length;

    // // leftBoundary
    // int leftMax[] = new int[n];
    // leftMax[0] = height[0];

    // for (int i=1; i<n; i++){
    // leftMax[i] = Math.max(height[i], leftMax[i-1]);

    // }
    // // rightBoundary
    // int rightMax[] = new int[n];
    // rightMax[n-1] = height[n-1];
    // for (int i= n-2 ; i>n; i--){
    // rightMax[i] = Math.max(height[i], rightMax[i+1]);
    // }
    // int trappedWater = 0;
    // // loop
    // for (int i = 0; i<n; i++){
    // int waterLevel = Math.min(leftMax[i], rightMax[i]);
    // trappedWater += waterLevel - height[i];
    // }
    // return trappedWater;
    // }

    // public static void main(String[] args) {
    // int height[] = { 4, 2, 0, 6, 3, 2, 5 };

    // System.out.println(trappedRainWater(height));
    // }

    // }

    // Question 5: Given an integer array nums, return all the triplets [nums[i],
    // nums[j],
    // nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
    // nums[k] == 0.
    // Notice that the solution set must not contain duplicate triplets

}