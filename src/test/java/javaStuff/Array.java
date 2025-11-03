package javaStuff;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		String abc[] = {"abc", "def", "ijk", "lmn"};
		int a[] = new int[4];
		a[0] = 123;
		a[1] = 456;
		a[2] = 789;
		
		
		System.out.println(Arrays.toString(abc));
		System.out.println(abc[2]);
		
		System.out.println(Arrays.toString(a));
		System.out.println(a[2]);

	}

}
