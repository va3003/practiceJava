package com.Learning.practiceJava;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String args[]) {
		String str = "aaabbaccdcb";
		byCreatingNewArr(str);
		updateOriginalArr(str);
	}
	
	static void byCreatingNewArr(String str) {
		char[] ch = str.toCharArray();
		Set<Character> st = new HashSet<Character>();
		for(char c:ch) {
			if(!st.contains(c)) {
				st.add(c);
			}
		}
		Object[] newCh = st.toArray();
		System.out.println(newCh.toString());
	}
	
	static void updateOriginalArr(String str) {
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char curr = ch[i];
			for(int j=1;j<ch.length;) {
				System.out.println("j : " + j);
				System.out.println("ch[j] : " + ch[j]);

				if(curr==ch[j]) {
					ch[j]=ch[j+1];
				}else {
					j++;
				}
			}
			System.out.println("updated for string : " + String.copyValueOf(ch));

		}
		System.out.println("updated string : " + String.copyValueOf(ch));
	}
}
