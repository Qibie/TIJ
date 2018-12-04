package com.chapter4controllingexecution.exercise;

/**
 * @author qibie
 * @date 2018年12月4日 下午5:37:28
 */
public class Exec4Primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			// 定义一个记录prime的标志factors
			int factors = 0;
			// 对于一个正整数num而言，它对(num/2, num)范围内的正整数是必然不能够整除的，因此，我们在判断num的时候，没有必要让它除以该范围内的数。
			for (int j = 1; j < (i + 2) / 2; j++) {
				// 记录是否出现能被整除的数
				if ((i % j) == 0) {
					factors++;
				}
			}
			// 如果标志位factors
			System.out.println("i : " + i + " factors: " + factors);
			if(factors < 2) System.out.println(i + " is prime");
		}
	}

}
