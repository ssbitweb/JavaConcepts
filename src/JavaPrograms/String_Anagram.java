package JavaPrograms;

import java.util.Arrays;

// Write a program to check if Two string are anagrams to each other.

// Anagram -- two string are anagram to each other if they contain same number of character and same character.

public class String_Anagram {

	public static void main(String[] args) {
		
		if(isAnagram("Dog", "God")) {
			System.out.println("anagram words");
		}else {
			System.out.println("not anagram");
		}

	}
	
	public static boolean isAnagram(String s1, String s2) {
		String a = s1.toLowerCase();
		String b = s2.toLowerCase();
		char[] word1 = a.toCharArray();
		char[] word2 = b.toCharArray();
		
//		char[] word1 = s1.replaceAll("[\\s]", "").toCharArray();
//		char[] word2 = s2.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
	}

}
