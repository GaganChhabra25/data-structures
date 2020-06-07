package array;

import datastructures.sorting.SortingImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayOperationsImpl implements datastructures.array.ArrayOperations {

    @Override
    public int[] insert(int element, int index,  int[] numbers, int size) {
        while(size > index) {
            numbers[size] = numbers[size-1];
            size--;
        }
        numbers[index] = element;
        return numbers;
    }

    /* 1. First find the index which element needs to be deleted : using outer for loop
    *   2. If element matches : From that index -> length, move elements from right -> left
    *   3. No. will be deleted
    * */
    @Override
    public int[] delete(int element, int[] numbers) {
        for(int i = 0 ; i< numbers.length; i++) {
            if(numbers[i] == element) {
                for(int j = i; j< numbers.length -1; j++) {
                    numbers[j] = numbers[j+1];
                }
            }
        }
        return numbers;
    }

    @Override
    public int sumValue(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }
        return result;
    }

    @Override
    public int avgValue(int[] numbers, int size) {
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }
        return result/size;
    }

    @Override
    public boolean contains(int element, int[] numbers) {
        for(int number : numbers) {
            if(number == element)
                 return true;
        }
        return false;
    }

    @Override
    public int indexOfElement(int element, int[] numbers) {
        for(int i = 0 ; i< numbers.length; i++) {
            if(numbers[i] == element)
                return i;
        }
        return -1;
    }

    @Override
    public Map<Integer, Integer> findDuplicatesAndTheirCount(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< numbers.length; i++) {
            int element = numbers[i];
            if(map.get(element)==null)
                map.put(element, 1);
             else
                 map.put(element, map.get(element )+ 1);
        }

       return map.entrySet().stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public int[] removeDuplicates(int[] array) {
        Map<Integer, Integer> map = datastructures.array.ArraysUtility.findNumbersCount(array);
        int[] newArray = new int[array.length];
        int i=0;
        Map<Integer, Integer> filteredMap =  map.entrySet().stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        for (int value :  filteredMap.keySet()) {
            newArray[i] = value;
            i++;
        }
        return newArray;
    }

    @Override
    public int findKthLargestElement(int kthLargest, int[] array) {
        int pass = 0;
        while (pass < kthLargest) {
            for(int i = 0; i< array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            pass++;
        }
        return array[array.length - kthLargest];
    }

    @Override
    public int findSingleMissingNumberInSortedArray(int[] array) {
        int l = array[0];
        int diff = l - 0;
        for(int i = 0; i< array.length -1 ; i++) {
            if(array[i] - i  != diff){
                return i+ diff;
            }
        }
        return -1;
    }

    @Override
    public void findMultipleMissingNumberInSortedArray(int[] array) {
        int l = array[0];
        int diff = l - 0;
        for(int i = 0; i< array.length ; i++) {
            if(array[i] - i  != diff){
                while (diff < array[i] -i){
                    System.out.println(diff + i);
                    diff++;
                }
            }
        }
    }

    /*
    * 1. Find max element
    * 2. Create new array with length  = max element
    * 3. Iterate through array, get element at each position and put that element in the corresponding number of new array
    * 4. Whatever  indexes contains "0" in new array, those indexes are missing elelements
    * */
    @Override
    public void findMissingNumberInUnsortedArray(int[] numbers) {
  /*      int maxElement = findMaxElement(numbers);*/
        int maxElement =11 +1;
        int[] newArray = new int[maxElement];
        for(int i = 0; i < numbers.length; i++) {
            newArray[numbers[i]] = numbers[i];
        }
        for (int j = 1; j< newArray.length -1; j++) {
            if(newArray[j] == 0) {
                System.out.println(j);
            }
        }
    }

    /*
    * 1. Take 2 variables start and end
    * 2. Iterate from start of array till we found element "0"
    * 3. Iterate from end of array till we fount element "1"
    * 4. Once we reach to desired indexes, swap those elements.
    *
    * */
    @Override
    public int[] moveZerosToLast(int[] array) {
        int start = 0;
        int end  = array.length-1;
        while (start < end) {
            while (array[start] != 0) {
                start++;
            }
            while (array[end] != 1){
                end--;
            }
            if(start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        return array;
    }

    @Override
    public Map<String, Integer> findEvenAndOdds(int[] array) {
        Map<String, Integer> map = new HashMap<>();
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0; i< array.length; i++) {
            if(array[i] %2 ==0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        map.put("Even", evenCount);
        map.put("Odd", oddCount);
        return map;
    }

    @Override
    public int differenceBtwLargestAndSmallest(int[] array) {
        int max = array[0];
        int min = array[0];
        for(int i = 0; i< array.length; i++) {
            if(array[i] > max)
                max = array[i];
            if(array[i] < min)
                min = array[i];
        }
        return max - min;
    }

    /* Elements hsould be unique*/
    @Override
    public void linearSearch(int element, int[] array) {
        for(int i = 0; i< array.length; i++) {
            if(array[i] == element){
                System.out.println("Element "+ element +  " found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    @Override
    public void binarySearch(int element, int[] array) {
        int l = 0;
        int h = array.length -1;
        if(l == h) {
            if(element == array[l]) {
                System.out.println("Element found");
                return;
            } else {
                System.out.println("Element  not found");
            }
        }
        datastructures.array.ArraysUtility.RBinarySearch(array, element, h, l);
    }

    @Override
    public int findMaxElement(int[] array) {
        int max = array[0];
        for(int i = 0; i< array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }

    @Override
    public int findMinElement(int[] array) {
        int min = array[0];
        for(int i = 0; i< array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }

    @Override
    public int[] reverse(int[] array) {
        int i = 0;
        int j = array.length -1;
        while (i< j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    @Override
    public boolean isSorted(int[] array) {
        boolean isSorted = true;
        for(int i = 0; i< array.length-1; i++) {
            if(array[i+1] < array[i]) {
                isSorted =  false;
                break;
            }
        }
        return isSorted;
    }

    @Override
    public int[] merge(int[] array1, int[] array2) {
        return new SortingImpl().mergeTwoSortedArrays(array1, array2);
    }

    @Override
    public int[] union(int[] numbers1, int[] numbers2) {
        return new int[0];
    }

    @Override
    public int[] intersection(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        int k  = 0;
        for(int i = 0; i< array1.length; i++) {
            for(int j = 0; j< array2.length; j++) {
                if(array1[i] == array2[j]) {
                    newArray[k] = array1[i];
                    k++;
                    break;
                }
            }
        }
        return newArray;
    }

    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}
