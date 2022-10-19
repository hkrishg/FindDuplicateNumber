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

  // We are given an unsorted array containing ‘n’ numbers taken from the range 1
  // to ‘n’. The array has some duplicates, find all the duplicate numbers without
  // using any extra space.

  // Example 1:

  // Input: [3, 4, 4, 5, 5]
  // Output: [4, 5]

  private static List<Integer> findAllDuplicateNumber(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] != arr[arr[i] - 1]) {
        Main.swap(arr, i, arr[i] - 1);
      } else {
        i++;
      }
    }

    List<Integer> duplicateNumbers = new ArrayList<>();

    for (i = 0; i < arr.length; i++) {
      if (arr[i] != i + 1)
        duplicateNumbers.add(arr[i]);
    }

    return duplicateNumbers;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  public static void main(String[] args) {
    int[] result = new int[] { 1, 4, 4, 3, 2 };
    System.out.println(Main.findDuplicateNumber(result));
    int[] result2 = new int[] { 3, 4, 4, 5, 5 };
    System.out.println(Main.findAllDuplicateNumber(result2));
  }
}