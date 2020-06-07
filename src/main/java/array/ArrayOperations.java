package datastructures.array;

import java.util.Map;

public interface ArrayOperations {
    int[] insert(int element, int index,  int[] numbers, int size);
    int[] delete(int element, int[] numbers);
    int sumValue(int[] numbers);
    int avgValue(int[] numbers, int size );
    boolean contains(int element, int[] numbers);
    int indexOfElement(int element, int[] numbers);
    Map<Integer, Integer> findDuplicatesAndTheirCount(int[] numbers);


    int[] removeDuplicates(int[] numbers);
    int findKthLargestElement(int kthLargest, int[] numbers);

    /* ------ MISSING ELEMENTS---------- */
    int findSingleMissingNumberInSortedArray(int[] numbers);
    void findMultipleMissingNumberInSortedArray(int[] numbers);
    void findMissingNumberInUnsortedArray(int[] numbers);

    int[] moveZerosToLast(int[] numbers);
    Map<String, Integer> findEvenAndOdds(int[] array);
    int findMaxElement(int[] numbers);
    int findMinElement(int[] numbers);
    int differenceBtwLargestAndSmallest(int[] numbers);

    /* SEARCH*/
    void linearSearch(int element, int[] numbers);
    void  binarySearch(int element, int[] numbers);

    int[] reverse(int[] numbers);
    boolean isSorted(int[] array);
    int[] merge(int[] numbers1, int[] numbers2);
    int[] union(int[] numbers1, int[] numbers2);
    int[] intersection(int[] array1, int[] array2);
    int[] sort(int[] numbers);
}
