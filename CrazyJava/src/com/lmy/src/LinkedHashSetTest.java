package com.lmy.src;

import java.util.LinkedHashSet;
//LinkedHashSet��Ҫά��Ԫ�صĲ���˳��
public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet books = new LinkedHashSet();
		books.add("aaa");
		books.add("bbb");
		books.add("ccc");
		System.out.println(books);
		books.remove("aaa");
		books.add("aaa");
		System.out.println(books);
		
	}
}
