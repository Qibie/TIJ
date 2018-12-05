package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月5日 下午4:48:03   
 */
class Rabbit{
	Rabbit(){
		System.out.println("Default constructor print!");
	}
}

public class Exec3DefaultConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit rabbit = new Rabbit();
	}

}
