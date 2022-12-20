package com.ust.training;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SampleProject {
	
	 public static void main(String[] args)
	    {
		 
	 
	        String str ="Find the number of words in a sentence and print the number of words";
	        Map<String, Integer> hashMap = new HashMap<>();
	 
	        String[] words = str.split(" ");
	 
	        for (String word : words) { 
	            if (hashMap.get(word) == null)	               
	                hashMap.put(word, 1);	 
	            else {	               
	                hashMap.put(word, hashMap.get(word) + 1);
	            }
	            System.out.println(word+":"+hashMap.get(word));
	        }
	        System.out.println(hashMap);
	    }
	}


