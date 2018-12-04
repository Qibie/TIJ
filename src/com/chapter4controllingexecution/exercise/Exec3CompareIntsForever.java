package com.chapter4controllingexecution.exercise;

import static net.mindview.util.Print.print;

import java.util.Random;

/**
 * @author qibie
 * @date 2018年12月4日 下午5:33:12   
 */
public class Exec3CompareIntsForever {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand1 = new Random();
		Random rand2 = new Random();
		while(true) {
			int x = rand1.nextInt();
			int y = rand2.nextInt();
			if (x < y)
				print(x + " < " + y);
			else if (x > y)
				print(x + " > " + y);
			else
				print(x + " = " + y);
		}
	}

}
