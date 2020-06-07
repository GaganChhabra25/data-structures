package string;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

public class StringTest {

    private datastructures.string.StringOperations stringOperations;

    @BeforeClass
    public void setup() {
         stringOperations = new StringOperationsImpl();
    }

    @Test
    public void test_changeCase() {
        String string = "wElCoMe";
        String result = stringOperations.changeCase(string);
        Assert.assertNotNull(result);
        Assert.assertEquals("WeLcOmE", result);
    }

    @Test
    public void test_countWords(){
        String string = "     Welcome to Java";
        String string1= "Welcome";
        int result1 = stringOperations.countWords(string);
        int  result2 = stringOperations.countWords(string1);
        Assert.assertEquals(3, result1);
        Assert.assertEquals(1, result2);
    }

    @Test
    public void test_countVowels() {
        String gagan = "Gagan";
        String aashish = "Aashish";
        String gaurav = "Gaurav";
        int result  = stringOperations.countVowels(gagan);
        int result1  = stringOperations.countVowels(aashish);
        int result2  = stringOperations.countVowels(gaurav);
        Assert.assertEquals(2, result);
        Assert.assertEquals(3, result1);
        Assert.assertEquals(3, result2);
    }

    @Test
    public void test_countSpaces() {
        String java = "Welcome to java";
        int result = stringOperations.countSpaces(java);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test_countSpaces_withExtraSpaces() {
        String java = "   Welcome to    java   ";
        int result = stringOperations.countSpaces(java);
        Assert.assertEquals(11, result);
    }

    @Test
    public void test_reverseCharacters() {
        String welcome = "Welcome";
        String reversedString = stringOperations.reverseCharacters(welcome);
        Assert.assertEquals("emocleW", reversedString);
    }

    @Test
    public void test_reverseWords() {
        String welcome = "Welcome to Java";
        String result = stringOperations.reverseWords(welcome);
        Assert.assertEquals("Java to Welcome", result.trim());
    }

    @Test
    public void test_findDuplicateCharsAndTheirCount() {
        String welcome = "welcome";
        Map<Character, Integer> result = stringOperations.findDuplicateCharsAndTheirCount(welcome);
        System.out.println(result);
    }

    @Test(description = "Can be more optimized")
    public void test_findMaxOccurringCharacter() {
        String java  = "javva";
        char result = stringOperations.findMaxOccurringCharacter(java);
        Assert.assertEquals('a', result);
    }

    @Test
    public void test_containsOnlyDigits() {
        String s = "12H";
        boolean result = stringOperations.containsOnlyDigits(s);
        Assert.assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void test_occurrenceOfCharacter(){
        String string = "Indian";
        int result = stringOperations.occurrenceOfCharacter(string, 'n');
        Assert.assertEquals(2, result);
    }

    @Test
    public void test_removeCharacter(){
        String indian  = "Indian";
        String result  = stringOperations.removeCharacter(indian, 'n');
        Assert.assertEquals("Idia", result);
    }

    @Test(description = "If first and last index of character is same, then thats the first non repeating character")
    public void test_findFirstNonRepeatingCharacter() {
        String input = "gsf";
        char output = stringOperations.findFirstNonRepeatingCharacter(input);
        Assert.assertEquals('f', output);
    }

    @Test
    public void test_checkPalindrome(){
        String input = "abcba";
        boolean output  = stringOperations.checkPalindrome(input);
        Assert.assertEquals(Boolean.TRUE, output);
    }

    @Test
    public void test_Anagram() {
        String string1 = "listen";
        String string2 = "silent";
        boolean result = stringOperations.checkAnagram(string1, string2);
        Assert.assertEquals(Boolean.TRUE, result);
    }
}
