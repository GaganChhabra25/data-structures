package datastructures.sorting;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SortingTest {

    private SortingTechniquies sortingTechniquies;

    @BeforeClass
    public void setup() {
        sortingTechniquies = new SortingImpl();
    }

    @Test
    public void test_bubbleSort() {
        int[] array = {8,5,7,3,2};
        System.out.println("Before sorting : " +  Arrays.toString(array));
        int[] result = sortingTechniquies.bubbleSort(array);
        System.out.println("After sorting " + Arrays.toString(result));
    }

    @Test
    public void test_insertionSort() {
        int[] array = {2,6,10,15,20,25,30, 0};
        System.out.println("Before sorting : " +  Arrays.toString(array));
        int[] result = sortingTechniquies.insertionSort(12, array, 7);
        System.out.println("After sorting " + Arrays.toString(result));
    }

    @Test
    @Ignore
    public void test_quickSort() {
        int[] array  = {8,3,11,12,9,5};
        sortingTechniquies.quickSort(array);
    }

    @Test
    public void test_combineTwoSortedArrays() {
        int[] array1  = {1,3,5,7,9};
        int[] array2  = {2,4,6,8,10,12,13,14};
        int[] result = sortingTechniquies.mergeTwoSortedArrays(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}
