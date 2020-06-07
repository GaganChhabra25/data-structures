package datastructures.sorting;

public interface SortingTechniquies {
    int[] bubbleSort(int[] array);
    /* Inserting an element in sorted array at sorted position*/
    int[] insertionSort(int element, int[] array, int size);
    void selectionSort();

    /* PENDING*/
    void quickSort(int[] array);

    int [] mergeTwoSortedArrays(int[] array1, int[] array2);

    /* Array containing one list of 8 elements, we have to sort it
    *  There is an array containing 8 list where each list contains 1 element
    * */
    void iterativeMergeSort();
    void recursiveMergeSort();
    void radixSort();
}
