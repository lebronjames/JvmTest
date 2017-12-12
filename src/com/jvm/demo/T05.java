package com.jvm.demo;

/**
 * 
* 线程栈大小
* -Xss128k 测试：1096
* -Xss1280k 测试：39640
 */
public class T05 {
	
	static int count = 1;
	
	static void r() {
		count ++;
		r();
	}
	
	public static void main(String[] args) {
		try {
			r();
		}catch (Throwable e) {
			System.out.println("-------------------"+count);
			e.printStackTrace();
		}
	}
}
