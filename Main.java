import java.util.*;

class Main {

  // We are given an unsorted array containing ‘n+1’ numbers taken from the range
  // 1 to ‘n’. The array has only one duplicate but it can be repeated multiple
  // times. Find that duplicate number without using any extra space. You are,
  // however, allowed to modify the input array.

  // Example 1:

  // Input: [1, 4, 4, 3, 2]
  // Output: 4
  // Example 2:

  // Input: [2, 1, 3, 3, 5, 4]
  // Output: 3
  // Example 3:

  // Input: [2, 4, 1, 4, 4]
  // Output: 4

  private static int findDuplicateNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] != i + 1) {
        if (arr[i] != arr[arr[i] - 1])
          Main.swap(arr, i, arr[i] - 1);
        else // found duplicate
          return arr[i];
      } else
        i++;
    }
    return -1;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  public static void main(String[] args) {
    int[] result = new int[] { 1, 4, 4, 3, 2 };
    System.out.println(Main.findDuplicateNumber(result));
  }
}