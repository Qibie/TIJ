package com.chapter3operators;

import static net.mindview.util.Print.*;
/** Test of unsigned right shift.
 * @author qibie
 * @date 2018年12月3日 下午10:50:19   
 */
public class URShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = -1;
		print(Integer.toBinaryString(i));
		i >>>= 10;
		print(Integer.toBinaryString(i));
		long l = -1l;
		print(Long.toBinaryString(l));
		l >>>= 10;
		print(Long.toBinaryString(l));
		short s = -1;
		print(Integer.toBinaryString(s));
		s >>>= 10;
		print(Integer.toBinaryString(s));*/
		byte b = -1;
		print(Integer.toBinaryString(b));
		b >>>= 10;
		print(Integer.toBinaryString(b));
		b = -1;
		print(Integer.toBinaryString(b));
		print(Integer.toBinaryString(b>>>10));
	}

}
