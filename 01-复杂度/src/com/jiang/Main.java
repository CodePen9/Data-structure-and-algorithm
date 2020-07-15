package com.jiang;

import com.jiang.TimeTool.Task;

/**
 * @title: 第n个斐波那契项
 * @author JiangPeng
 *
 */
public class Main {
	
	//第一种 n较大的时候运算很慢
	public static int fib1(int n) {
		if(n <= 1) {
			return n;	
		}
		return fib1(n - 1) + fib1(n - 2);
	}
	
	//第二种
	public static int fib2(int n) { 
		int first = 0;
		int second = 1;
		for(int i = 0;i < n - 1; i++) { 
			int sum = first + second; 
			first = second; 
			second = sum; 
		}
		return second;
	}
	
	public static void main(String[] args) {
		/*first
		System.out.println(fib1(10));
		
		second
		System.out.println(fib2(1000));
		*/
		int n = 4;	
		TimeTool.check("fib1", new Task() {
			public void execute() {
				System.out.println(fib1(n));
			}
		});
		TimeTool.check("fib2", new Task() {
			public void execute() {
				System.out.println(fib2(1));
			}
		});
		
		
	}
}
