package com.rank.strings;

public class CaesarCipher {
	public static void main(String... args) {
		System.out.println(CaesarCipher.caesarCipherEncrypted("middle-Outz", 2));
	}
	
	private static String caesarCipherEncrypted(String s, int k) {
	    int strLength = s.length();
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i = 0; i < strLength; i++) {
	    	char ch;
			if (Character.isUpperCase(s.charAt(i))) {
				ch = (char) (((int)s.charAt(i)+k-65)%26 + 65);
			}else {
				ch = (char) (((int)s.charAt(i)+k-97)%26 + 97);	
			}
			sb.append(ch);
		}
	    return sb.toString();
	}
}
