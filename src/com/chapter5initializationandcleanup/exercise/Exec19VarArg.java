package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午10:45:34
 */
class Exam {
	void printArray(String... s) {
		for (String str : s) {
			System.out.println(str);
		}
	}
}

public class Exec19VarArg {
	public static void main(String[] args) {
		new Exam().printArray("zhangsan", "lisi", "");
		new Exam().printArray(new String[] { "zhangsan", "lisi", "" });
	}
}
