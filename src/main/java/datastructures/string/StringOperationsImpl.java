package datastructures.string;

import java.util.*;
import java.util.stream.Collectors;

public class StringOperationsImpl implements datastructures.string.StringOperations {

    @Override
    public String changeCase(String string) {
        char[] chars = string.toCharArray();
        for(int i = 0; i<chars.length; i++) {
            char character = chars[i];
            if(Character.isLowerCase(character)){
                chars[i] = Character.toUpperCase(character);
            } else {
                chars[i] = Character.toLowerCase(character);
            }
        }
        return new String(chars);
    }

    @Override
    public int countWords(String sting) {
        String[] words = sting.trim().split(" ");
        return words.length;
    }

    @Override
    public int countVowels(String string) {
        String lowerCaseString = string.toLowerCase();
        int result  = 0;
        for(int i = 0; i< lowerCaseString.length(); i++) {
            if(datastructures.string.StringUtility.isVowel(lowerCaseString.charAt(i)))
                result = result+1;
        }
        return result;
    }

    @Override
    public int countSpaces(String string) {
        int count = 0;
        for(int i =0; i< string.length(); i++) {
            if(string.charAt(i) == ' ') {
                count = count + 1;
            }
        }
        return count;
    }

    @Override
    public String reverseCharacters(String string) {
        char[] chars = string.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i< j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    @Override
    public String reverseWords(String string) {
        String[] strings = string.split(" ");
        String reversedString = "";
        int lastIndex = strings.length -1;

        while (lastIndex >= 0){
           reversedString =  reversedString.concat(strings[lastIndex]).concat(" ");
           lastIndex--;
         }
         return reversedString;
    }

    /*A palindrome number is a number that is same after reverse*/
    @Override
    public boolean checkPalindrome(String string) {
        int i = 0;
        int j = string.length()-1;
        while(i <j) {
            if(string.charAt(i) != string.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    @Override
    public Map<Character, Integer> findDuplicateCharsAndTheirCount(String string) {
        String input  = string.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< input.length(); i++) {
            char character = string.charAt(i);
            if(map.get(character) == null) {
                map.put(character, 1);
            } else {
                map.put(character, map.get(character) + 1);
            }
        }
       return map.entrySet()
               .stream()
               .filter(characterIntegerEntry -> characterIntegerEntry.getValue() > 1)
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /*An anagram of a string is another string that contains same characters, only the order of characters can be different.
    *       eg : LISTEN == SILENT
    * */
    @Override
    public boolean checkAnagram(String string1, String string2) {
        if(string1.length() != string2.length())
            return false;
        for(int i = 0; i< string1.length(); i++) {
            int  first = this.occurrenceOfCharacter(string1, string1.charAt(i));
            int second = this.occurrenceOfCharacter(string2, string1.charAt(i));
            if(first != second) {
                return false;
            }
        }
        return true;
    }

    @Override
    public char findMaxOccurringCharacter(String string) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i< string.length(); i++) {
            Character character = string.charAt(i);
            if(map.get(character) == null){
                map.put(character, 1);
            } else {
                map.put(character, map.get(character) + 1);
            }
        }

        Optional<Map.Entry<Character, Integer>> optional = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        return optional.get().getKey();
    }

    @Override
    public void printPermutations(String string) {

    }

     /*IMPORTANT */
    @Override
    public char findFirstNonRepeatingCharacter(String string) {
        char output = 0;
        for(Character ch:string.toCharArray()) {
            if(string.indexOf(ch) == string.lastIndexOf(ch)) {
              output = ch;
                break;
            }
        }
        return output;
    }

    @Override
    public boolean containsOnlyDigits(String string) {
        return string.matches("[0-9]+");
    }

    @Override
    public int occurrenceOfCharacter(String string, char c) {
        int occurrence = 0;
        for(int i = 0; i< string.length(); i++) {
            char character = string.charAt(i);
            if(character == c){
                occurrence = occurrence+1;
            }
        }
        return occurrence;
    }

    @Override
    public String removeCharacter(String string, char c) {
        if(!string.contains(String.valueOf(c)))
            return "Character " + c + " not present in string : " + string;
        char[] inputCharArray = string.toCharArray();
       char[] outputCharArray = new char[inputCharArray.length];
       int i = 0;
       int j  = inputCharArray.length;
       int k = 0;
       while (i<j) {
           if(inputCharArray[i] == c) {
               i++;
           } else {
               outputCharArray[k] = inputCharArray[i];
               i++;
               k++;
           }
       }
       return new String(outputCharArray).trim();
    }
}
