package com.jvm.demo;

/**
 * 也可以使用Runtime类“大致”计算系统内存情况
* 
 */
public class T03 {
	
	public static void printMemoryInfo() {
		System.out.println("total:"+Runtime.getRuntime().totalMemory());
		System.out.println("free:"+Runtime.getRuntime().freeMemory());
	}

	public static void main(String[] args) {
		printMemoryInfo();
		byte[] b = new byte[1024*1024];
		System.out.println("----------------------------------");
		printMemoryInfo();
	}
}
