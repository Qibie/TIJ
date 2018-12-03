package com.chapter3operators;

import java.util.*;
import static net.mindview.util.Print.*;

/** Using the bitwise operators.
 * @author qibie
 * @date 2018年12月3日 下午10:58:00
 */
public class BitManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47l);
		int i = rand.nextInt();
		int j = rand.nextInt();
		printBinaryInt("-1", -1);
		printBinaryInt("+1", +1);
		int maxpos = 2147483647;
		printBinaryInt("maxpos", maxpos);
		int maxneg = -2147483648;
		printBinaryInt("maxneg", maxneg);
		printBinaryInt("i", i);
		printBinaryInt("~i", ~i);
		printBinaryInt("-i", -i);
		printBinaryInt("j", j);
		printBinaryInt("i & j", i & j);
		printBinaryInt("i | j", i | j);
		printBinaryInt("i ^ j", i ^ j);
		printBinaryInt("i << 5", i << 5);
		printBinaryInt("i >> 5", i >> 5);
		printBinaryInt("(~i) >> 5", (~i) >> 5);
		printBinaryInt("i >>> 5", i >>> 5);
		printBinaryInt("(~i) >>> 5", (~i) >>> 5);
		
		long l = rand.nextLong();
		long m = rand.nextLong();
		printBinaryLong("-1L", -1L);
		printBinaryLong("+1L", +1L);
		long ll = 9223372036854775807L;
		printBinaryLong("maxpos", ll);
		long lln = -9223372036854775808L;
		printBinaryLong("maxneg", lln);
		printBinaryLong("l", l);
		printBinaryLong("~l", ~l);
		printBinaryLong("-l", -l);
		printBinaryLong("m", m);
		printBinaryLong("l & m", l & m);
		printBinaryLong("l | m", l | m);
		printBinaryLong("l ^ m", l ^ m);
		printBinaryLong("l << 5", l << 5);
		printBinaryLong("l >> 5", l >> 5);
		printBinaryLong("(~l) >> 5", (~l) >> 5);
		printBinaryLong("l >>> 5", l >>> 5);
		printBinaryLong("(~l) >>> 5", (~l) >>> 5);
	}

	static void printBinaryInt(String s, int i) {
		// TODO Auto-generated method stub
		print(s + ", int: " + i + ", binary:\n   " + Integer.toBinaryString(i));
	}

	static void printBinaryLong(String s, long l) {
		print(s + ", long: " + l + ", binary:\n " + Long.toBinaryString(l));
	}
}
