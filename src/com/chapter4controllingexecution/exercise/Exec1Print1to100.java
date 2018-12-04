package com.chapter4controllingexecution.exercise;

/**
 * @author qibie
 * @date 2018年12月4日 下午5:14:44   
 */
public class Exec1Print1to100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 101; i++) {
			System.out.println("for : " + i);
		}
		
		int i = 1;
		
		while(i < 101) {
			System.out.println("while : " + i);
			i++;
		}
		
		i = 1;
		do {
			System.out.println("do-while : " + i);
			i++;
		} while (i < 101);
	}

}
