package com.chapter3operators;

import static net.mindview.util.Print.*;
/**
 * @author qibie
 * @date 2018年12月3日 下午6:07:48   
 */
public class Literals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hexadecimal (lowercase)
		int i1 = 0x2f;
		print("i1: " + Integer.toBinaryString(i1));
		// Hexadecimal (uppercase)
		int i2 = 0X2F;
		print("i2: " + Integer.toBinaryString(i2));
		// Octal (leading zero)
		int i3 = 0177;
		print("i3: " + Integer.toBinaryString(i3));
		// max char hex value
		char c = 0xffff;
		print("c: " + Integer.toBinaryString(c));
		// max byte hex value
		byte b = 0x7f;
		print("b: " + Integer.toBinaryString(b));
		// max short hex value
		short s = 0x7fff;
		print("s: " + Integer.toBinaryString(s));
		// long suffix
		long n1 = 200L;
		// long suffix (but can be confusing)
		long n2 = 200l;
		long n3 = 200;
		float f1 = 1;
		// float suffix
		float f2 = 1F;
		// float suffix
		float f3 = 1f;
		// double suffix
		double d1 = 1d;
		// double suffix
		double d2 = 1D; 
		// (Hex and Octal also work with long)
	}

}
