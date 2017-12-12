package com.jvm.demo;

/**
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:-UseTLAB -XX:+PrintGC
 * 关闭逃逸分析，关闭标量替换，关闭线程本地内存，打印GC信息
 */
public class T01 {

	class User {
		int id;
		String name;

		User(int id, String name) {
			this.name = name;
			this.id = id;
		}
	}

	void alloc(int i) {
		new User(i, i + "");
	}

	public static void main(String[] args) {
		T01 t = new T01();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 2000000; i++) {
			t.alloc(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}
