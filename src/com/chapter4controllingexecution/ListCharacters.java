package com.chapter4controllingexecution;

/**
 * @author qibie
 * @date 2018年12月4日 下午4:48:44   
 */
public class ListCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c = 0; c < 128;c++) {
			if(Character.isLowerCase(c)) {
				System.out.println("value: " + (int)c + " character: " + c);
			}
		}
	}
}
