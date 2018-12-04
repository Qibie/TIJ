package com.chapter4controllingexecution;

import static net.mindview.util.Print.*;

/**
 * While loops with "labeled break" and "labeled continue."
 * 
 * @author qibie
 * @date 2018年12月5日 上午1:23:48
 */
public class LabelWhile {
	public static void main(String[] args) {
		int i = 0;
		outer: while (true) {
			print("Outer while loop");
			while (true) {
				i++;
				print("i = " + i);
				if (i == 1) {
					print("continue");
					continue;
				}
				if (i == 3) {
					print("continue outer");
					continue outer;
				}
				if (i == 5) {
					print("break");
					break;
				}
				if (i == 7) {
					print("break outer");
					break outer;
				}
			}
		}
	}

}
