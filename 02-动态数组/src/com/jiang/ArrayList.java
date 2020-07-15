package com.jiang;

public class ArrayList {
	//Ԫ�ص�����
	private int size;
	
	//���е�Ԫ��
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
	
	//�������Ԫ��
	public void clear() {
		size = 0;
	}
	
	//Ԫ�ص�����
	public int size() {
		return size;
	}
	
	//�Ƿ�Ϊ��
	public boolean isEmpty() {
		return size == 0;
	}
	
	//�Ƿ����ĳ��Ԫ��
	public boolean contains(int element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}
	
	//���Ԫ�ص�β��
	public void add(int element) {
		
	}
	
	//��ȡindexλ�õ�Ԫ��
	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("���Index��"+index+"���������Size��"+size);
		}
		return elements[index];
	}
	
	//����indexλ�õ�Ԫ��
	public int set(int index,int element) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("���Index��"+index+"���������Size��"+size);
		}
		int old = elements[index];
		elements[index] = element;
		return old;
	}
	
	//��index���һ��Ԫ��
	public void add(int index,int element) {
		
	}
	
	//ɾ��indexλ�õ�Ԫ��
	public int remove(int index) {
		return 0;
	}
	
	//�鿴Ԫ�ص�����
	public int indexOf(int element) {
		for (int i = 0; i < size; i++) {
			if(elements[i] == element) {
				return i;
			}
		}
		return ELEMENT_NOT_FOUND;
	}
	
	
	

}
