package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月5日 下午4:53:27   
 */
class Rabbit1{
	Rabbit1(){
		System.out.println("Default constructor print!");
	}
	
	Rabbit1(String message){
		System.out.println(message);
	}
}

public class Exec4OverloadedConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit1 rabbit = new Rabbit1();
		Rabbit1 rabbit1 = new Rabbit1("constructor print");
	}

}
