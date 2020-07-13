package com.jiang;

import com.jiang.TimeTool.Task;

/*
 * title: 求第n个斐波那契数
 * 0 1 1 2 3 5 ....
 */
public class Main {
	
	//第一种算法
	public static int fib1(int n) {
		if(n <= 1) {
			return n;	
		}
		return fib1(n - 1) + fib1(n - 2);
	}
	
	//第二种算法
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
		/*第一种算法在n比较大的时候会出现错误
		System.out.println(fib1(10));
		
		第二种
		System.out.println(fib2(1000));
		*/
		int n = 45;
		TimeTool.check("fib1", new Task() {
			public void execute() {
				System.out.println(fib1(n));
			}
		});
		TimeTool.check("fib1", new Task() {
			public void execute() {
				System.out.println(fib2(n));
			}
		});
		
		
	}
}
