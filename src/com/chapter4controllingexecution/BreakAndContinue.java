package com.chapter4controllingexecution;

import static net.mindview.util.Range.*;

/**
 * Demonstrates break and continue keywords.
 * 
 * @author qibie
 * @date 2018年12月4日 下午6:05:03
 */
public class BreakAndContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if (i == 74) {
				// Out of for loop
				break;
			}
			if (i % 9 != 0) {
				// Next iteration
				continue;
			}
			System.out.println(i + " ");
		}
		System.out.println();
		// Using foreach:
		for (int i : range(100)) {
			// Out of for loop
			if (i == 74) break;
			// Next iteration
			if (i % 9 != 0)	continue;
			System.out.println(i + " ");
		}
		System.out.println();
		int i = 0;
		// An "infinite loop":
		for(;;) {
			i++;
			int j = i * 27;
			// Out of loop
			if(j == 1269) break;
			// Top of loop
			if(i % 10 != 0) continue;
			System.out.println(i + " ");
		}
	}

}
