package com.chapter2.exercise;

/**
 * @author qibie
 * @date 2018年12月1日 下午11:28:38   
 */
public class Exec3ATypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class ATypeName {
			int i;
			double d;
			boolean b;
			void show() {
				System.out.println(i);
				System.out.println(b);
				System.out.println(d);
			}
		}
		ATypeName aTypeName = new ATypeName();
		aTypeName.show();
	}

}
