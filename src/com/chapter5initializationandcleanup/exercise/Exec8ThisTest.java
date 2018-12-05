package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月5日 下午11:17:51
 */
class Doc {
	void intubate() {
		System.out.println("prepare patient");
		laryngoscopy();
		this.laryngoscopy();
	}

	void laryngoscopy() {
		System.out.println("use laryngoscope");
	}
}

public class Exec8ThisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Doc().intubate();
	}

}
