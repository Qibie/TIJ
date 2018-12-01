package com.chapter2.exercise;

/**
 * @author qibie
 * @date 2018年12月1日 下午11:35:29
 * object/DataOnlyTest.java
 * TIJ4 Chapter Object Exercise 4 page 90
 * Turn the DataOnly code fragments into a program that compiles and runs
 */
public class Exec4Exec5DataOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class DataOnly {
			int i;
			double d;
			boolean b;

			void show() {
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
		DataOnly data = new DataOnly();
		data.i = 3;
		data.d = 2.71828;
		data.b = false;
		data.show();
	}

}
