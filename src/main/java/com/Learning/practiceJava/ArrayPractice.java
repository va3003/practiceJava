package com.Learning.practiceJava;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayPractice {
	public static void main(String args[]) {
		String str = "aabbcddda2";
		ArrayPractice.countLettersInString(str);
		System.out.println("Reverse String : " + ArrayPractice.reverseString(str));

		String str2 = "hello bachho where are you a7 for rebase?";
		ArrayPractice.reverseNonSpacedString(str2);
		String str3 = "hello";
	}

	static void countLettersInString(String args) {
		char[] chArr = args.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < chArr.length; i++) {
			if (hm.get(chArr[i]) != null) {
				hm.put(chArr[i], hm.get(chArr[i]) + 1);
			} else {
				hm.put(chArr[i], 1);
			}
		}
		System.out.println(hm);
	}

	static String reverseString(String args) {
		char[] arr = new char[args.length()];
		int i = args.length()-1;
		for (char ch : args.toCharArray()) {
//			System.out.println(ch);
			arr[i--] = ch;
		}
		System.out.println();
		return String.valueOf(arr);
	}

	static String reverseNonSpacedString(String args) {
		String[] splitArray = args.split(" ");
		String reversedString = null;
		for (String str : splitArray) {
			char[] arr = new char[str.length()];
			int i = str.length()-1;
			for (char ch : str.toCharArray()) {
//				System.out.println(ch);
				arr[i--] = ch;
			}
			reversedString = reversedString!=null?reversedString + " " + String.valueOf(arr):String.valueOf(arr);
		}
		System.out.println("reverseNonSpacedString : " + reversedString);
		return reversedString;
	}
}
