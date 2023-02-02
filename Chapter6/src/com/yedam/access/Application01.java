package com.yedam.access;

public class Application01 {
	public static void main(String[] args) {
		Acess ac = new Acess();

		// public
		ac.free = "public";
		// protected
		ac.parent = "parent";
		// default
		ac.basic = "basic";
		// private
//	ac.privacy ="privacy";
		ac.instead();
//    ac.info();
		ac.parent();
		ac.basic();

	}
}
