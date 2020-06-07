package datastructures.string;

import java.util.Map;

public interface StringOperations {
    String changeCase(String string);
    int countWords(String sting);
    int countVowels(String string);
    int countSpaces(String string);
    String reverseCharacters(String string);
    String reverseWords(String string);
    boolean checkPalindrome(String string);
    Map<Character, Integer> findDuplicateCharsAndTheirCount(String string);
    boolean checkAnagram(String string1, String string2);
    char findMaxOccurringCharacter(String string);
    void printPermutations(String string);
    char findFirstNonRepeatingCharacter(String string);
    boolean containsOnlyDigits(String string);
    int occurrenceOfCharacter(String string, char c);
    String removeCharacter(String string, char c);
}
