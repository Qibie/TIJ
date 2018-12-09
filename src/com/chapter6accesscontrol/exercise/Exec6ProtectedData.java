package com.chapter6accesscontrol.exercise;

/**
 * @author qibie
 * @date 2018年12月9日 下午5:40:49   
 */
class Data{
	protected int a = 13;
}
class DataChanger {
	static void change(Data d, int i) {
		d.a = i;
	}
}

public class Exec6ProtectedData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		System.out.println(d.a);
		DataChanger.change(d, 58);
		System.out.println(d.a);
	}

}
