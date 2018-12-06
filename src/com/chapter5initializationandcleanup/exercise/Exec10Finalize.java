package com.chapter5initializationandcleanup.exercise;

/**
 * @author qibie
 * @date 2018年12月6日 下午3:20:36   
 */
class Website{
	boolean login = false;
	Website(boolean islogin) {
		login = islogin;
	}
	void logout() {
		login = false;
	}
	
	protected void finalize() {
		if(login) {
			System.out.println("Test: finalize method print");
		}
	}
}

public class Exec10Finalize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Website website = new Website(true);
		website.logout();
		new Website(true);
		System.gc();
	}

}
