package com.chapter3operators.exercise;

import java.util.Random;

/**
 * @author qibie
 * @date 2018年12月3日 下午5:55:39   
 */
public class Exec7CoinToss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random  = new Random();
		int result;
		for(int i = 0; i < 6; i++) {
			result = random.nextInt(6);
			System.out.println(result);
		}
	}

}
