package com.chapter4controllingexecution;

import static net.mindview.util.Print.*;

/**
 * For loops with "labeled break" and "labeled continue."
 * @author qibie
 * @date 2018年12月5日 上午1:16:21
 */
public class LabelFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		// Can’t have statements here
		outer:
		// infinite loop
		for (; true;) {
			// Can’t have statements here
			inner: for (; i < 10; i++) {
				print("i = " + i);
				if (i == 2) {
					print("continue");
					continue;
				}
				if (i == 3) {
					print("break");
					// Otherwise i never gets incremented.
					i++;
					break;
				}
				if (i == 7) {
					print("continue outer");
					// Otherwise i never gets incremented.
					i++; 
					continue outer;
				}
				if (i == 8) {
					print("break outer");
					break outer;
				}
				for (int k = 0; k < 5; k++) {
					if (k == 3) {
						print("continue inner");
						continue inner;
					}
				}
			}
		}
		// Can’t break or continue to labels here
	}
}
