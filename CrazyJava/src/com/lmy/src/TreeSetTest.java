package com.lmy.src;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		nums.add(new Integer(5));
		nums.add(new Integer(2));
		nums.add(new Integer(10));
		nums.add(new Integer(-3));
		nums.add(new Integer(4));
		nums.add(new Integer(-9));
		System.out.println(nums);//集合元素已经处于排序状态
		
		System.out.println(nums.first());//第一个元素
		System.out.println(nums.last());//最后一个元素
		System.out.println(nums.headSet(new Integer(4)));//返回小于4的子集
		System.out.println(nums.tailSet(new Integer(5)));//返回大于等于5的子集
		System.out.println(nums.subSet(new Integer(-3), new Integer(4)));//返回大于等于-3，小于等于4的子集
		
	}

}
