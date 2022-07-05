package com.qa.generics;

public class Holder<T> {
	private T object;
	
	public void add(T object) {
		this.object = object;
	}
	
	public T get() {
		return object;
	}
	
	
}
