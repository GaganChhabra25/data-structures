package datastructures.array;

import java.util.HashMap;
import java.util.Map;

public class ArraysUtility {
    public static int[] getNumbers() {
        int[] numbers = new int[8];
        numbers[0] = 8;
        numbers[1] = 3;
        numbers[2] = 7;
        numbers[3] = 12;
        numbers[4] = 6;
        return numbers;
    }

    public static int[] getDuplicateElementsArray() {
        int[] numbers = new int[8];
        numbers[0] = 8;
        numbers[1] = 6;
        numbers[2] = 7;
        numbers[3] = 12;
        numbers[4] = 8;
        return numbers;
    }

    public static Map<Integer, Integer> findNumbersCount(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< numbers.length; i++) {
            int element = numbers[i];
            if(map.get(element)==null)
                map.put(element, 1);
            else
                map.put(element, map.get(element )+ 1);
        }
        return map;
    }

    public static void RBinarySearch(int[] array, int element, int high, int low) {
        int mid = (low + high)/2;
        if(element == array[mid]) {
            System.out.println("Element found");
            return;
        }
        if(element < array[mid]){
            RBinarySearch(array, element, mid-1, low);
        } else {
            RBinarySearch(array, element, high, mid+1);
        }
    }
}
