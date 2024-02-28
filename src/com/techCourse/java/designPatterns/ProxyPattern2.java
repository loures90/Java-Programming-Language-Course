package com.techCourse.java.designPatterns;

import java.util.HashMap;

/*
 *  Proxy creates a representative obeject that controls access to another object
 *
 * 
 * Types:
 * 	Remote Proxy - For accessing a remote object.
 *  Virtual Proxy - For deferred inicialization
 *  Protection proxy - for secured and controlled acces to the object.
 * 
 * 
 * 
 * */

interface Dict {
	public String getWord(String word);
	public void  modifyWord(String word, String value);
}

class DictImpl implements Dict{
	private HashMap<String, String> dict = new HashMap<String, String>();
	@Override
	public String getWord(String word) {
		return dict.get(word);
	}

	@Override
	public void modifyWord(String word, String value) {
		dict.put(word, value);
	}
}

class DictVirtualProxy implements Dict {
	// lazy start
	private DictImpl dict = null;
	private Dict getDictionary () {
		if (dict == null) {
			dict = new DictImpl();
		}
		return dict;
	}
	
	@Override
	public String getWord(String word) {
		return getDictionary().getWord(word);
	}

	@Override
	public void modifyWord(String word, String value) {
		getDictionary().modifyWord(word, value);
	}
	
}

class DictProctorProxy implements Dict {
	private Dict dict = new DictImpl();
	@Override
	public String getWord(String word) {
		return dict.getWord(word);
	}

	@Override
	public void modifyWord(String word, String value) {
		throw new UnsupportedOperationException("Not allowed");		
	}
	
}

public class ProxyPattern2 {

	public static void main(String[] args) {
		Dict dict = new DictVirtualProxy();
		dict.modifyWord("some word", "some value");
		System.out.println(dict.getWord("some word"));
		
		Dict dict2 = new DictProctorProxy();
		dict2.modifyWord("some word", "some value");
		System.out.println(dict.getWord("some word"));
	}

}
