package week_7.practice1.algo7;

import org.junit.Test;
import static org.junit.Assert.*;


public class ProgramTests {
    @Test
    public void TestCase1() {
        assertEquals("mentisac", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("clementisacap"));
    }

    @Test
    public void TestCase2() {
        assertEquals("a", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("a"));
    }

    @Test
    public void TestCase3() {
        assertEquals("abc", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("abc"));
    }

    @Test
    public void TestCase4() {
        assertEquals("abc", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("abcb"));
    }

    @Test
    public void TestCase5() {
        assertEquals("abcdef", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("abcdeabcdefc"));
    }

    @Test
    public void TestCase6() {
        assertEquals("cdea", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("abccdeaabbcddef"));
    }

    @Test
    public void TestCase7() {
        assertEquals("bac", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("abacacacaaabacaaaeaaafa"));
    }

    @Test
    public void TestCase8() {
        assertEquals("dabcef", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("abcdabcef"));
    }

    @Test
    public void TestCase9() {
        assertEquals("cbde", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("abcbde"));
    }

    @Test
    public void TestCase10() {
        assertEquals("vsindecago", LongestSubstringWithoutDuplication.longestSubstringWithoutDuplication("decadevsindecagonarelit"));
    }
}
