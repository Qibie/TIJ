package com.chapter4controllingexecution;

import java.util.Random;

/**
 * @author qibie
 * @date 2018年12月4日 下午5:44:30
 */
public class ForEachFloat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		float f[] = new float[10];
		for (int i = 0; i < 10; i++) {
			f[i] = rand.nextFloat();
		}
		for (float x : f) {
			System.out.println(x);
		}
	}

}
