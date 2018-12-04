package com.chapter4controllingexecution;

import java.util.*;
import static net.mindview.util.Print.*;

/**
 * Demonstrates the switch statement.
 * 
 * @author qibie
 * @date 2018年12月4日 下午11:33:53
 */
public class VowelsAndConsonants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			printnb((char) c + ", " + c + ": ");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				print("vowel");
				break;
			case 'y':
			case 'w':
				print("Sometimes a vowel");
				break;
			default:
				print("consonant");
			}
		}
	}

}
