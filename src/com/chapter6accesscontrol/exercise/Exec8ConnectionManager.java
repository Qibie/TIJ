package com.chapter6accesscontrol.exercise;

/**
 * @author qibie
 * @date 2018年12月9日 下午9:57:20
 */
class Connection {
	private static int count = 0;
	private int i = 0;

	private Connection() {
		System.out.println("Connection()");
	}

	// Aloow creation via static mehod:
	static Connection makeConnection() {
		count++;
		return new Connection();
	}

	public static int howMany() {
		return count;
	}

	public String toString() {
		return ("Connection " + count);
	}
}

class ConnectionManager {
	static int howManyLeft = 3;
	static Connection[] ca = new Connection[3];
	{
		for (Connection x : ca) {
			x = Connection.makeConnection();
		}
	}

	public static Connection getConnection() {
		if (howManyLeft > 0) {
			return ca[--howManyLeft];
		} else {
			System.out.println("No more connections");
			return null;
		}
	}
}

public class Exec8ConnectionManager {
	public static void main(String[] args) {
		ConnectionManager cm = new ConnectionManager();
		System.out.println(cm.howManyLeft);
		cm.getConnection();
		System.out.println(ConnectionManager.howManyLeft);
		cm.getConnection();
		System.out.println(ConnectionManager.howManyLeft);
		cm.getConnection();
		System.out.println(cm.getConnection());
		System.out.println(ConnectionManager.howManyLeft);
	}
}
