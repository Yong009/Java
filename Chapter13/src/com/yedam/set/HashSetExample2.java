package com.yedam.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member>set = new HashSet<>();
		
		//모든 데이터가 같아야 
		set.add(new Member("고길동", 30));
		set.add(new Member("고길동", 26));
		
		System.out.println("총 객체 수 : "+set.size());
		
	
	}
}
