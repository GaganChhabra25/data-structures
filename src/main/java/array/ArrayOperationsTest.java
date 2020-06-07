package array;

import datastructures.array.ArrayOperations;
import datastructures.array.ArraysUtility;
import datastructures.sorting.SortingImpl;
import datastructures.sorting.SortingTechniquies;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Map;

public class ArrayOperationsTest {

    private ArrayOperations arrayOperations;
    private int[] numbers;
    private int[] arrayWithDuplicateElements;

    @BeforeClass
    public void setup() {
        arrayOperations = new ArrayOperationsImpl();
        numbers = ArraysUtility.getNumbers();
        arrayWithDuplicateElements = ArraysUtility.getDuplicateElementsArray();
    }

    @Test(description = "Length = 8, Size  = 5")
    public void test_insert() {
        int[] result =  arrayOperations.insert(44,2, numbers, 5);
        Assert.assertEquals(44, result[2]);
    }

    @Test
    public void test_delete() {
        int[] result = arrayOperations.delete(3, numbers);
        for (int aResult : result) {
            Assert.assertNotEquals(3, aResult);
        }
    }

    @Test
    public void test_sumValue() {
        int result = arrayOperations.sumValue(numbers);
        Assert.assertEquals(36, result);
    }

    @Test
    public void test_avgValue() {
        int result = arrayOperations.avgValue(numbers, 5);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_contains() {
        boolean result = arrayOperations.contains(3, numbers);
        Assert.assertTrue(result);
    }

    @Test
    public void test_indexOfElement() {
        int result = arrayOperations.indexOfElement(3, numbers);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test_findDuplicatesAndTheirCount() {
        Map<Integer, Integer> result  = arrayOperations.findDuplicatesAndTheirCount( arrayWithDuplicateElements);
        Assert.assertTrue(result.keySet().contains(8));
        Assert.assertTrue(result.values().contains(2));
    }

    @Test
    public void test_removeDuplicates() {
        int[] array = {8,3,2,9,8,2,3};
        int[] result = arrayOperations.removeDuplicates( array);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test_findKthLargestElement() {
        int[] array = {20,3,11,9,1};
         int result = arrayOperations.findKthLargestElement(2, array);
         Assert.assertEquals(11, result);
    }

    @Test
    public void test_findSingleMissingNumberInSortedArray() {
        int[] array = {1,2,4,5,6,8};
        int result = arrayOperations.findSingleMissingNumberInSortedArray(array);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test_findMultipleMissingNumberInSortedArray() {
        int[] array = {1,2,4,5,6,8,11,19};
       arrayOperations.findMultipleMissingNumberInSortedArray(array);
    }

    @Test
    public void test_findMissingNumberInUnsortedArray() {
        int[] array = {11,1,4,6,3,2};
        arrayOperations.findMissingNumberInUnsortedArray(array);
    }

    @Test
    public void test_moveZerosToLast() {
        int[] array = {1,0,1,0,1,0,1,0,1,0,1};
        int[] result  = arrayOperations.moveZerosToLast(array);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test_findEvenAndOdds() {
        int[] array = {11,1,4,6,3,2};
        Map<String, Integer> result = arrayOperations.findEvenAndOdds(array);
        System.out.println(result);
    }

    @Test
    public void test_differenceBtwLargestAndSmallest(){
        int[] array = {2,9,4,3,6};
        int result = arrayOperations.differenceBtwLargestAndSmallest(array);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_findMaxElement(){
        int[] array = {2,9,4,3,6};
        int result = arrayOperations.findMaxElement(array);
        Assert.assertEquals(9, result);
    }

    @Test
    public void test_findMinElement(){
        int[] array = {2,9,4,3,6};
        int result = arrayOperations.findMinElement(array);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test_binarySearch() {
        int[] array  = {2,4,5,7,9,0};
        arrayOperations.binarySearch(4, array);
    }

    @Test
    public void test_linear() {
        int[] array  = {2,4,5,7,9,0};
        arrayOperations.linearSearch(4, array);
    }

    @Test
    public void test_reverse() {
        int[] array  = {2,4,5,7,9,0};
        int[] result = arrayOperations.reverse(array);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test_isSorted() {
        int[] array  = {2,4,5,7,9};
       boolean result = arrayOperations.isSorted(array);
        System.out.println(result);
    }

    @Test
    public void test_merge() {
        int[] array1  = {1,3,5,7,9};
        int[] array2  = {2,4,6,8,10,12,13,14};
        int[] result = arrayOperations.merge(array1, array2);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test_intersection() {
        int[] array1  = {1,3,5,7,9};
        int[] array2  = {7};
        int[] result = arrayOperations.intersection(array1, array2);
        System.out.println(Arrays.toString(result));
    }
}
