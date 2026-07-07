package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.codegnan.collectionframework.Employee;


public class ConsumerExample {
	public static void main(String[] args) {
		//Consumer<String>c=s->System.out.println(s)	;
		//Consumer<Integer>c=n->System.out.println("square" +n*n)	;
		//Consumer<String>c=s->System.out.println(s.toUpperCase())	;
		List<String>languages=Arrays.asList("java","python","c","c++");
		Consumer<String>c=n->System.out.println("languages" +n);
		languages.forEach(c);
		Consumer<Employee>display=e->
		System.out.println("employee name:" +e.name+"salary:" +e.salary);
		Employee e1=new Employee( "malli",50000, null);
		Employee e2 =new Employee( "Mahesh",70000, null);
		display.accept(e1);
		display.accept(e2);
		
		c.accept("hi");
		
	}

}
