package datastructures.sorting;

import java.util.Arrays;

public class SortingImpl implements SortingTechniquies {
    @Override
    public int[] bubbleSort(int[] array) {
        int pass = 0;
        while (pass < array.length) {
            for(int i = 0; i< array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            pass++;
        }
        return array;
    }

    @Override
    public int[] insertionSort(int element, int[] array, int size) {
        for(int i = size-1; i>0; i--) {
            if(array[i] > element){
                array[i+1] = array[i];
            } else {
                array[i+1] = element;
                break;
            }
        }
        return array;
    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort(int[] array) {
        int pivot = array[0];
        int start = 1;
        int last = array.length -1;
        while (start < last) {
            do{
                start++;
            } while (array[start] < pivot);
            do {
                last--;
            } while (array[last] > pivot);
            if(start < last) {
                int temp = array[last];
                array[last] = array[start];
                array[start] = temp;
            }
            int temp = pivot;
            pivot = array[last];
            array[last] = temp;


        }
        System.out.println("array after first pass : " + Arrays.toString(array));
    }

    @Override
    public int[] mergeTwoSortedArrays(int[] array1, int[] array2) {
        int array1Size = array1.length;
        int array2Size = array2.length;
        int newArray[] = new int[array1Size + array2Size];
        int i = 0,j  = 0, k = 0;
        /* While there are elements  to scan in both the list*/
        while (i < array1Size && j< array2Size) {
            if(array1[i] < array2[j]){
                newArray[k] = array1[i];
                i++;
                k++;
            } else {
                newArray[k] = array2[j];
                j++;
                k++;
            }
        }
        /* If elements left in first array, copy those to new array*/
        for( ;i< array1Size;i++) {
            newArray[k] = array1[i];
            k++;
        }
        /* If elements left in second array, copy those to new array*/
        for( ;j< array2Size;j++) {
            newArray[k] = array2[j];
            k++;
        }
        return newArray;
    }

    @Override
    public void iterativeMergeSort() {

    }

    @Override
    public void recursiveMergeSort() {

    }

    @Override
    public void radixSort() {

    }
}
