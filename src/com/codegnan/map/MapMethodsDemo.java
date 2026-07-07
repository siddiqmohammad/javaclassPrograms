package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodsDemo {
	public static void main(String[] args) {
		Map<String,Integer>studentMarks=new HashMap<>();
		studentMarks.put("arjun", 88);
		studentMarks.put("ravi", 92);
		studentMarks.put("sita", 79);
		studentMarks.put("priya", 85);
		studentMarks.put("rahul", 91);
		System.out.println(studentMarks);

		Map<String,Integer>newStudents=new HashMap<>();
		newStudents.put("Ananaya", 22);
		newStudents.put("sneha", 92);
		newStudents.put("rehan", 21);
		newStudents.put("meera", 99);
		studentMarks.putAll(newStudents);
		System.out.println(newStudents);
		System.out.println("marks of arjun:" +studentMarks.get("arjun"));
		System.out.println("removed marks of priya" +studentMarks.remove("priya"));
		System.out.println("is sita present?" +studentMarks.containsKey("sita"));
		System.out.println("any stduents scored 100?" +studentMarks.containsValue(100));
		System.out.println("Is Map is Empty ?" +studentMarks.isEmpty());
		System.out.println("total students" +studentMarks.size());
		Set<String> studentNames=studentMarks.keySet();
		System.out.println("student names" + studentNames);
		Collection<Integer>marks=studentMarks.values();
		System.out.println("marks:" +marks);
		Set<Map.Entry<String,Integer>>entries=studentMarks.entrySet()	;
		System.out.println("all entries");
		for(Map.Entry<String,Integer>entry:entries) {
			System.out.println(entry.getKey()+ "-----> "+entry.getValue());
		}
		studentMarks.clear();
		System.out.println("Map is Empty:" +studentMarks.isEmpty());
		
		
	}

}
