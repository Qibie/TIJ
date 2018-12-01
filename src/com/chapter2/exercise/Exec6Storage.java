package com.chapter2.exercise;

/**
 * @author qibie
 * @date 2018年12月1日 下午11:38:53   
 */
public class Exec6Storage {
	// object/StorageTest.java
	// TIJ4 Chapter Object, Exercise 6, page 90
	// Write a program that includes and calls the storage() method defined as a
	// code fragment in this chapter.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreStuff storeStuff;
		storeStuff = new StoreStuff();
		System.out.println(storeStuff.storage("hi"));
	}

}

class StoreStuff {
	int storage(String s) {
		return s.length() * 2;
	}	
}