package com.chapter2;

/**
 * @author qibie
 * @date 2018年12月1日 下午10:20:45   
 */
public class ShowProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
