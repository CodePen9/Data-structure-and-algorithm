package com.jiang;

public class ArrayList {
	//元素的数量
	private int size;
	
	//所有的元素
	private int[] elements;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	private static final int ELEMENT_NOT_FOUND = -1;
	
	public ArrayList(int capaticy) {
		capaticy = (capaticy < DEFAULT_CAPACITY ) ? DEFAULT_CAPACITY : capaticy;
		elements = new int[capaticy];
	}
	
	public ArrayList() {
		//elements = new int[DEFAULT_CAPACITY];
		this(DEFAULT_CAPACITY);
	}
	
	//清楚所有元素
	public void clear() {
		size = 0;
	}
	
	//元素的数量
	public int size() {
		return size;
	}
	
	//是否为空
	public boolean isEmpty() {
		return size == 0;
	}
	
	//是否包含某个元素
	public boolean contains(int element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}
	
	//添加元素到尾部
	public void add(int element) {
		
	}
	
	//获取index位置的元素
	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("你的Index是"+index+"，但是你的Size是"+size);
		}
		return elements[index];
	}
	
	//设置index位置的元素
	public int set(int index,int element) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("你的Index是"+index+"，但是你的Size是"+size);
		}
		int old = elements[index];
		elements[index] = element;
		return old;
	}
	
	//在index添加一个元素
	public void add(int index,int element) {
		
	}
	
	//删除index位置的元素
	public int remove(int index) {
		return 0;
	}
	
	//查看元素的索引
	public int indexOf(int element) {
		for (int i = 0; i < size; i++) {
			if(elements[i] == element) {
				return i;
			}
		}
		return ELEMENT_NOT_FOUND;
	}
	
	
	

}
