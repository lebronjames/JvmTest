package com.jvm.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出
 * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:\tmp\jvm.dump -XX:+PrintGCDetails
 * -Xms10M -Xmx10M
 * 内存溢出查看工具VisualVM
 */
public class T04 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		for(int i=0;i<10000000;i++) list.add(new byte[1024*1024]);
	}
}
