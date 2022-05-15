package com.openBrowser;

import java.util.HashMap;
import java.util.Hashtable;

public class MapClass {
	
	public static void main(String[] args) {
		HashMap<String,Integer> abc =new HashMap<String,Integer>();
		
		abc.put("Jahid", 456789153);
		abc.put("Imam", 79465465);
		abc.put("Azad", 54665465);
		abc.put(null, 568421354);
		abc.put(null, 531345646);
		
		System.out.println(abc.get(null));
		
		Hashtable<String,Integer> xyz =new Hashtable<String,Integer>();
		
		xyz.put("kayla", 456789153);
		xyz.put("protik", 79465465);
		xyz.put("nabi", 54665465);
		xyz.put("liton", 568421354);
		//xyz.put(null, null);
		
		//System.out.println(xyz.get(null));
		
	}

}
